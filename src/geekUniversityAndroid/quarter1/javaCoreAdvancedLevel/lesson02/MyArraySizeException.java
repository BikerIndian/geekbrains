package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson02;

public class MyArraySizeException extends Exception{

    String mess="";

    public MyArraySizeException(int length, int size) {
        this.mess = String.format("Размер массива %d, адолжен быть %d ",length ,size);
    }

    public MyArraySizeException(int length, int size, int i) {
        this.mess = String.format("#%d - Размер массива %d, а должен быть %d ",i,length ,size);
    }

    @Override
    public String getMessage() {
        return mess;
    }
}
