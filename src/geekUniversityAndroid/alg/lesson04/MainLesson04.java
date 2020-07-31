package geekUniversityAndroid.alg.lesson04;

/*
      ФИО:  		    Свищ Владимир Сергеевич
      Факультет:        Geek University Android-разработки
      Курс: 		    Алгоритмы и структуры данных на Java.
      Урок: 		    Урок 4. Связанные списки
      Дата правки:      31.07.2020
*/

import java.util.*;

public class MainLesson04 {
    public static void main(String[] args) {
        
        // 1. Добавить ListIterator, реализовать некоторые из его методов.
        testListIterator();
        System.out.println();
        // 2. Реализовать LinkedQueue (очередь, на базе связанных списков.)
        testLinkedQueue();
        
    }

    private static void testListIterator() {

        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("Katia");
        mll.insertFirst("Petia");
        mll.insertFirst("Maria");

//        List<String> mll = new LinkedList<>();
//        mll.add("Katia");
//        mll.add("Petia");
//        mll.add("Maria");

        ListIterator<String> listIterator = mll.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("next: nextIndex = "+listIterator.nextIndex()+" value = "+listIterator.next());
        }

        listIterator.add("zzz");
        while (listIterator.hasPrevious()) {
            System.out.println("previous: previousIndex = "+listIterator.previousIndex()+" value = "+listIterator.previous());
        }
        //listIterator.add("zzz");

        System.out.println("next: nextIndex = "+listIterator.nextIndex()+" value = "+listIterator.next());

        /*
next: nextIndex = 0 value = Katia
next: nextIndex = 1 value = Petia
next: nextIndex = 2 value = Maria
previous: previousIndex = 2 value = Maria
previous: previousIndex = 1 value = Petia
previous: previousIndex = 0 value = Katia
         */
    }


    private static void testLinkedQueue() {
        MyLinkedQueue<String> queue = new MyLinkedQueue<>();
        queue.add("Katia");
        queue.add("Petia");
        queue.add("Maria");
        System.out.println(queue);
        System.out.println("peek - "+queue.peek());
        System.out.println("peek - "+queue.peek());
        System.out.println("poll - "+queue.poll());
        System.out.println("poll - "+queue.poll());
        System.out.println(queue);
    }
}
