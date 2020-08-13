package geekUniversityAndroid.alg.lesson08;

import java.util.HashMap;
import java.util.Random;

public class MainLesson08 {

    /*
      ФИО:  		    Свищ Владимир Сергеевич
      Факультет:        Geek University Android-разработки
      Курс: 		    Алгоритмы и структуры данных на Java.
      Урок: 		    Урок 8. Хеш-таблицы
      Дата правки:      13.08.2020
    */

    public static void main(String[] args) {


        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>();
        chm.put(1,"one");
        chm.put(2,"two");
        chm.put(3,"three");
        chm.put(59,"three");
        chm.put(4,"four");
        chm.put(5,"five");

        System.out.println(chm.get(3));
        System.out.println(chm);


        /*
        1. Создать метод удаления в классе метод цепочек.
         */


        System.out.println("remove = " + chm.remove(3));
        System.out.println(chm);


    }
}
