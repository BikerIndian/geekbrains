package geekUniversityAndroid.alg.lesson05;

public class Box {
    private int weight;
    private int price;

    public Box(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " Цена = "+price +" : Вес = "+weight ;
    }
}
