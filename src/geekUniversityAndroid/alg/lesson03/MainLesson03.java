package geekUniversityAndroid.alg.lesson03;
/*
      ФИО:  		    Свищ Владимир Сергеевич
      Факультет:        Geek University Android-разработки
      Курс: 		    Алгоритмы и структуры данных на Java.
      Урок: 		    Урок 3. Стек и очередь
      Дата правки:      26.07.2020
*/
public class MainLesson03 {
    public static void main(String[] args) {
        /*
        1. Создать программу, которая переворачивает
        вводимые строки (читает справа налево).
        */
        printReversStr("Java");

        /*
        2. Создать класс для реализации дека.
         */
        testDeca();
    }


    private static void printReversStr(String java) {
        System.out.println("1. Задание");
        char[] charArr = java.toCharArray();
        MyStack<Character> stack= new MyStack<>();
        for (int i = 0; i < charArr.length; i++) {
            stack.push(charArr[i]);
        }

        System.out.print(java+" - ");
        for (int i = 0; i < charArr.length; i++) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    private static void testDeca() {
        System.out.println("\n2. Задание");

        MyDeca<Integer> deca = new MyDeca<>();
        System.out.println("\n.insertRight ");
        for (int i = 1; i < 5; i++) {
            deca.insertRight(i);
        }
        System.out.println("deca = "+deca);
        System.out.println("\n.insertLeft ");
        for (int i = -1; i > -5; i--) {
            deca.insertLeft(i);

        }
       System.out.println("deca = "+deca);

        System.out.println("\n.removeRight ");
        for (int i = 0; i < 5; ++i) {
            System.out.print(deca.removeRight() + " ");
        }

        System.out.println("\ndeca = "+deca);
        System.out.println("\n.removeLeft ");
        for (int i = 0; i < 3; ++i) {
            System.out.print(deca.removeLeft() + " ");
        }
        System.out.println("\ndeca = "+deca);

    }
}

