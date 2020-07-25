package geekUniversityAndroid.alg.lesson02;

/*
      ФИО:  		    Свищ Владимир Сергеевич
      Факультет:        Geek University Android-разработки
      Курс: 		    Алгоритмы и структуры данных на Java.
      Урок: 		    Урок 2. Массивы и сортировка
      Дата правки:      25.07.2020
*/

import java.util.Random;

public class MainTestFunctional {
    public static void main(String[] args) {
        testAdd();
        testAddIndex();
    }


    private static void testAdd() {
        System.out.println("TestAdd");
        int size = 20;

        //MyArrayList<Integer> arr = new MyArrayList<>(10);
        MyArrayList<Integer> arr = new MyArrayList<>();

        for (int i = 0; i <size ; i++) {
            arr.add(i);
        }

        System.out.println(arr);
    }

    private static void testAddIndex() {
        System.out.println("TestAddIndex");
        int size = 20;

        MyArrayList<Integer> arr = new MyArrayList<>();
        for (int i = 0; i <size ; i++) {
            arr.add(i,i);
        }
        System.out.println(arr);
    }
}
