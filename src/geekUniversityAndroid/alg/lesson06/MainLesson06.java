package geekUniversityAndroid.alg.lesson06;

import java.util.Random;

public class MainLesson06 {

    /*
      ФИО:  		    Свищ Владимир Сергеевич
      Факультет:        Geek University Android-разработки
      Курс: 		    Алгоритмы и структуры данных на Java.
      Урок: 		    Урок 6. Деревья
      Дата правки:      06.08.2020
    */

    public static void main(String[] args) {
        /*
        1. Создать и запустить программу для построения двоичного дерева.
        В цикле построить двадцать деревьев с глубиной в 6 уровней. Данные,
        которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int.
        Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100.

        2. Проанализировать, какой процент созданных деревьев являются несбалансированными.
        */


        for (int i = 0; i < 20; i++) {
            System.out.println("Map #"+(i+1));
            MyTreeMap<Integer, String> map = createTreeMap();
            MyTreeMapAnalyzer myTreeMapAnalyzer = new MyTreeMapAnalyzer(map);
            //myTreeMapAnalyzer.print();

//            if (myTreeMapAnalyzer.isBalance()) {
//                System.out.println("Tree Balance");
//
//            }
            System.out.println();
        }



        //System.out.println(map);

    }

    private static MyTreeMap<Integer, String> createTreeMap() {
        MyTreeMap<Integer, String> map = new MyTreeMap<>(6);
        Random rd = new Random();

        for (int i = 0; i < 100; i++) {
            int n = rd.nextInt(200)-100;
            map.put(rd.nextInt(20),Integer.toString(n));
        }
        return map;
    }
}
