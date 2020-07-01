package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.Lesson06.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    ServerSocket server = null;
    Socket socket = null;
    private DataInputStream in;
    private DataOutputStream out;
    Scanner keyboard  = new Scanner(System.in);;
    Thread threadKeyboard;

    final int PORT = 8189;

    public static void main(String[] args) {
        new Server().run();
    }
    public void run() {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Сервер запущен!");

            socket = server.accept();
            System.out.println("Клиент подключился");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            threadKeyboard = tKeyboardRead();

            while (true) {
                String  str = in.readUTF();

                if (str.equals("/end")) {
                    sendMsg("/end");
                    break;
                }
                System.out.println("Клиент: "+str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        System.out.println("Сервер остановлен");
    }

    private Thread tKeyboardRead() {

            Thread tKeyRead = new Thread(() -> {
                while (true) {
                    sendMsg(keyboard.next());
                }

            });

            tKeyRead.setDaemon(true);
            tKeyRead.start();
            return tKeyRead;




    }



    public void sendMsg(String mess) {
        try {
            out.writeUTF(mess);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

