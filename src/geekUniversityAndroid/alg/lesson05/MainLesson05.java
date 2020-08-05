package geekUniversityAndroid.alg.lesson05;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MainLesson05 {

    /*
      ФИО:  		    Свищ Владимир Сергеевич
      Факультет:        Geek University Android-разработки
      Курс: 		    Алгоритмы и структуры данных на Java.
      Урок: 		    Урок 5. Рекурсия
      Дата правки:      04.08.2020
    */

    public static void main(String[] args) {
        /*
        1. Написать программу по возведению числа в степень с помощью рекурсии.
         */
        degree();

        /*
        2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
         */
        backpack();

    }

    private static void degree() {
        System.out.println("возведение числа "+pow(3, 3));

    }
    private static double pow(double num, double exponent) {
        if (exponent <= 1){
            return num;
        }

        num = num * pow(num,exponent-1);
        return num;
    }

    private static void backpack() {
        List<Box> boxArr = new LinkedList<>();
        boxArr.add(new Box(1,5));
        boxArr.add(new Box(5,2));
        boxArr.add(new Box(4,3));
        boxArr.add(new Box(2,5));
        boxArr.add(new Box(3,10));

        Backpack backpack = new Backpack(9);
        System.out.println("Рюкзак");
        System.out.println("Не удалось дабавить: "+backpack.add(boxArr));
        System.out.println("Что в рюкзаке: "+backpack.getBackpackBox());
        System.out.println("Вес рюкзака: "+backpack.getSizeBackpackBox());

    }

}
