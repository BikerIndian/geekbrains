package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson02;

public class MyArrayDataException extends Exception{
    private String str;
    private int i;
    private int j;
    public MyArrayDataException(String str, int i, int j) {
        this.str = str;
        this.i=i;
        this.j=j;
    }
    public String getMessage() {
        return String.format("Не удалось преобразовать строку [%s] в ячейке [%d][%d]", str,i,j);
    }
}
