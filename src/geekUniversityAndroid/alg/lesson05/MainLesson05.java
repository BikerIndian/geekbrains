package geekUniversityAndroid.alg.lesson05;

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
        System.out.println(pow(3, 3));

    }
    private static double pow(double num, double exponent) {
        if (exponent <= 1){
            return num;
        }

        num = num * pow(num,exponent-1);
        return num;
    }

    private static void backpack() {

    }

}
