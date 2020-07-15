package geekUniversityAndroid.quarter1.javaCorePro.lesson01;

  /*
	    ФИО:  		    Свищ Владимир Сергеевич
	    Факультет:      Geek University Android-разработки
	    Курс: 		    Java Core. Профессиональный уровень
	    Урок: 		    Урок 1. Обобщения
	    Дата правки:    15.07.2020
  */

import java.util.ArrayList;
import java.util.Collections;

public class MainLesson01 {
    public static void main(String[] args) {
        /*
        1. Написать метод, который меняет два элемента массива местами
           (массив может быть любого ссылочного типа);
        */

        System.out.println("1 Задание.");
        String[] arrStr = {"0","1","2","3"};
        int i =1;
        int j =3;
        printArr(arrStr,i,j);
        changesArr(arrStr,i,j);
        printArr(arrStr,i,j);

        Double[] arrInt = {1.1, 5.3, 4.0, 3.6};
        printArr(arrInt,i,j);
        changesArr(arrInt,i,j);
        printArr(arrInt,i,j);
        /*
        2. Написать метод, который преобразует массив в ArrayList;
        */
        ArrayList arrList = toArrayList(arrInt);
        int testIndex = 1;
        System.out.println("2 Задание.");
        System.out.printf("ArrayList[%d] - %s \n",testIndex,arrList.get(testIndex).toString());
        /*
        3. Большая задача:

           Есть классы Fruit -> Apple, Orange (больше фруктов не надо);
           Класс Box, в который можно складывать фрукты. Коробки условно
           сортируются по типу фрукта, поэтому в одну коробку нельзя сложить
           и яблоки, и апельсины;
           Для хранения фруктов внутри коробки можно использовать ArrayList;
           Сделать метод getWeight(), который высчитывает вес коробки, зная
           количество фруктов и вес одного фрукта (вес яблока – 1.0f,
           апельсина – 1.5f. Не важно, в каких это единицах);
           Внутри класса Коробка сделать метод compare, который позволяет
           сравнить текущую коробку с той, которую подадут в compare в качестве
           параметра, true – если она равны по весу, false – в противном случае
           (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
           Написать метод, который позволяет пересыпать фрукты из текущей коробки
           в другую (помним про сортировку фруктов: нельзя яблоки высыпать в
           коробку с апельсинами). Соответственно, в текущей коробке фруктов
           не остается, а в другую перекидываются объекты, которые были
           в этой коробке;
           Не забываем про метод добавления фрукта в коробку.

         */
    }

    private static<T> ArrayList toArrayList(T arr[]) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList,  arr);
        return arrayList;
    }

    private static  <T> T[] changesArr(T arr[] , int i, int j) {
        T a1 = arr[i];
        arr[i]=arr[j];
        arr[j]=a1;
        return arr;
    }

    private static void printArr(Object arr[], int i, int j) {
        System.out.println(arr.getClass().getName()+" - "+arr[i].toString()+" "+arr[j].toString());
    }

}
