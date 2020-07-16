package geekUniversityAndroid.quarter1.javaCorePro.lesson01.box;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private  ArrayList<T> arr = new ArrayList();

    public void add(T fruit){
        arr.add(fruit);
    }
    public ArrayList<T>  get(){
        return arr;
    }
    public void clear(){
        this.arr.clear();
    }

    // сравнить
    public boolean compare(Box<T> box) {
        if (Math.abs(this.getWeight() - box.getWeight()) < 0.0001) {
            return true;
        }
        return false;
    }
    // пересыпать
    public void move(Box<T> boxIn){

        arr.addAll(boxIn.get());
        boxIn.clear();
    }

    public  int getSize(){
        return arr.size();
    }

    //высчитывает вес коробки
    public float getWeight() {
        float weight = 0;
        for (int i = 0; i < arr.size(); i++) {
            weight +=arr.get(i).getWeight();
        }
        return weight;
    }
}
