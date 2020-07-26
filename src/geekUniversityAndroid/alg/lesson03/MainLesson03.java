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
       // printReversStr("Java");

        /*
        2. Создать класс для реализации дека.
         */
        testDeca();
    }



    private static void printReversStr(String java) {
        char[] charArr = java.toCharArray();
        MyStack<Character> stack= new MyStack<>();
        for (int i = 0; i < charArr.length; i++) {
            stack.push(charArr[i]);
        }

        for (int i = 0; i < charArr.length; i++) {
            System.out.print(stack.pop());
        }
    }

    private static void testDeca() {
        MyDeca<Integer> deca = new MyDeca<>();

        deca.InsertRight(1);
        deca.InsertRight(2);
        deca.InsertRight(3);


        System.out.println(deca);
        System.out.println(deca.removeLeft());
        System.out.println(deca);
    }
}

