package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.Lesson06.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private final int PORT = 8189;
    private final String IP_ADDRESS = "localhost";

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Scanner keyboard = null;

    public static void main(String[] args) {
        new Client().run();
    }

    public void run() {
        try {
            socket = new Socket(IP_ADDRESS, PORT);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            keyboard = new Scanner(System.in);

            keyboardRead();

            try {
                while (true) {
                    String str = in.readUTF();
                    if (str.equals("/end")) {
                        break;
                    }
                    System.out.println("Server: " + str);
                }
                System.out.println("Сервер отключился");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                sendMsg("/end");
                try {
                    in.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private void keyboardRead() {
        Thread tKeyRead = new Thread(() -> {
            while (true) {
                sendMsg(keyboard.nextLine());
            }
        });
        tKeyRead.setDaemon(true);
        tKeyRead.start();
    }

    public void sendMsg(String mess) {
        try {
            out.writeUTF(mess);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
