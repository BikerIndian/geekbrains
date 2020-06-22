package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson02;

  /*
	    ФИО:  		    Свищ Владимир Сергеевич
	    Факультет:      Geek University Android-разработки
	    Курс: 		    Java Core. Продвинутый уровень
	    Урок: 		    Урок 2. Исключения
	    Дата правки:    17.06.2020
  */

public class MainLesson02 {
    public static void main(String[] args) {
    /*
        1. Напишите метод, на вход которого подается двумерный строковый массив
           размером 4х4, при подаче массива другого размера необходимо бросить
           исключение MyArraySizeException.

        2. Далее метод должен пройтись по всем элементам массива, преобразовать
           в int, и просуммировать. Если в каком-то элементе массива преобразование
           не удалось (например, в ячейке лежит символ или текст вместо числа),
           должно быть брошено исключение MyArrayDataException – с детализацией,
           в какой именно ячейке лежат неверные данные.

        3. В методе main() вызвать полученный метод, обработать возможные
           исключения MySizeArrayException и MyArrayDataException и вывести
           результат расчета.
    */

        String[][] numArr= {
                {"1", "2", "3","4"},
                {"5", "6", "7", "8"},
                {"9", "10","11","12"},
                {"13","14","15","16"}
        };


        // 3.
        try {
            int summ =  getSum(numArr);
            System.out.println("Результат расчета "+summ);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static int getSum(String[][] numArr) throws MyArraySizeException, MyArrayDataException {
        // 1.

        int size = 4;
        testArr(numArr,size);


        // 2.
        int summ = 0;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                summ+=parseIntArr(numArr,i,j);
            }
        }
        return summ;
    }

    private static void testArr(String[][] numArr, int size) throws MyArraySizeException {
        if (size != numArr.length) {
            throw  new MyArraySizeException(numArr.length,size);
        }

        for (int i = 0; i < numArr.length; i++) {
            if (size != numArr[i].length) {
                throw  new MyArraySizeException(numArr[i].length,size,i);
            }
        }
    }


    private static int parseIntArr(String[][] numArr, int i, int j) throws MyArrayDataException {
        String str = numArr[i][j];
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e){
          throw new MyArrayDataException(str,i,j);
        }
    }
}
