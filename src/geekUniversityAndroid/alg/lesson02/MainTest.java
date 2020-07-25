package geekUniversityAndroid.alg.lesson02;

/*
      ФИО:  		    Свищ Владимир Сергеевич
      Факультет:        Geek University Android-разработки
      Курс: 		    Алгоритмы и структуры данных на Java.
      Урок: 		    Урок 2. Массивы и сортировка
      Дата правки:      25.07.2020
*/

import java.util.Random;

public class MainTest {
    public static void main(String[] args) {

        /*
        1. Создать массив большого размера (миллион элементов).
        2. Заполнить массив случайными числами.
        3. Проверить скорость выполнения каждой сортировки.
           (Если время сортировки будет не приемлимо долго, можете для массива
           из 100 000 элементов проверить)
         */

        int size = 30000;

        Random rd = new Random();

        MyArrayList<Integer> arr1 = new MyArrayList<>(size);
        MyArrayList<Integer> arr2 = new MyArrayList<>(size);
        MyArrayList<Integer> arr3 = new MyArrayList<>(size);

        int rnd;
        for (int i = 0; i <size ; i++) {
            rnd = rd.nextInt(100);
            arr1.add(rnd);
            arr2.add(rnd);
            arr3.add(rnd);
        }

        // insertionSort
        long start = System.currentTimeMillis();
        arr1.insertionSort();
        long finish = System.currentTimeMillis();
        long timeWork = finish - start;
        System.out.println("insertionSort = " + timeWork);

        //selectionSort
        start = System.currentTimeMillis();
        arr2.selectionSort();
        finish = System.currentTimeMillis();
        timeWork = finish - start;
        System.out.println("selectionSort = " + timeWork);

        //bubbleSort
        start = System.currentTimeMillis();
        arr3.bubbleSort();
        finish = System.currentTimeMillis();
        timeWork = finish - start;
        System.out.println("bubbleSort    = " + timeWork);
    }
}
