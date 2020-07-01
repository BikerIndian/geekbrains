package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.Lesson05;

    /*
	    ФИО:  		    Свищ Владимир Сергеевич
	    Факультет:      Geek University Android-разработки
	    Курс: 		    Java Core. Продвинутый уровень
	    Урок: 		    Урок 5. Многопоточность
	    Дата правки:    28.06.2020
    */

public class MainLesson05 {

   /*
        1) Создают одномерный длинный массив, например:
           static final int size = 10000000;
           static final int h = size / 2;
           float[] arr = new float[size];
    */

    static final int size = 10000000;
    static final int h = size / 2;



    public static void main(String[] args) {

        float[] arr = new float[size];
        //   2) Заполняют этот массив единицами;
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=1;
        }


        // 3,4,5
        printTimeWork1(arr.clone());
        System.out.println();
        // 6
        printTimeWork2(arr.clone());

    }

    private static void printTimeWork1(float[] arr) {

        //   3) Засекают время выполнения: long a = System.currentTimeMillis();
        long timeStart1 = System.currentTimeMillis();

     /*
        4) Проходят по всему массиву и для каждой ячейки считают новое значение
           по формуле:
     */
        ArrMath arrMath = new ArrMath(arr,0);
        arrMath.run();

        //   5) Проверяется время окончания метода System.currentTimeMillis();

        long timeStop1 = System.currentTimeMillis();
        System.out.println("Время выполнения в один поток "+(timeStop1 - timeStart1));
    }

    private static void printTimeWork2(float[] arr) {


          /*
        6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);
           Отличие первого метода от второго:
           Первый просто бежит по массиву и вычисляет значения.
           Второй разбивает массив на два массива, в двух потоках высчитывает новые значения
           и потом склеивает эти массивы обратно в один.

           Пример деления одного массива на два:
           System.arraycopy(arr, 0, a1, 0, h);
           System.arraycopy(arr, h, a2, 0, h);

           Пример обратной склейки:
           System.arraycopy(a1, 0, arr, 0, h);
           System.arraycopy(a2, 0, arr, h, h);

           Примечание:
           System.arraycopy() копирует данные из одного массива в другой:
           System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника,
           массив-назначение, откуда начинаем записывать данные в массив-назначение,
           сколько ячеек копируем)
           По замерам времени:
           Для первого метода надо считать время только на цикл расчета:
           for (int i = 0; i < size; i++) {
           arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
           }
     */
/*

 */

        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        /*
        System.arraycopy(источник, индекс источника,
                массив-назначение, индекс массив-назначение,
                сколько ячеек копируем)
        */
        long timeStart = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);


        ArrMath t1 = new ArrMath(arr1,0);
        t1.start();

        ArrMath t2 = new ArrMath(arr2,h);
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Склейка
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        long timeStop = System.currentTimeMillis();
        System.out.println("Время выполнения в два потока "+(timeStop - timeStart));
    }
}
