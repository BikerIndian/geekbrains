package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.Lesson05;

public class ArrMath extends Thread{
    private float[] arr;
    int i;

    public ArrMath(float[] arr, int index){
        this.arr = arr;
        this.i = index;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" index: "+  i +" - "+( i+ arr.length));
        for (int j = 0; j < arr.length; j++) {

            arr[j] = (float)(arr[j] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            i++;
        }
    }
}
