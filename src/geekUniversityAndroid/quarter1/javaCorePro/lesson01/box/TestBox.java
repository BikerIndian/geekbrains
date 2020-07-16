package geekUniversityAndroid.quarter1.javaCorePro.lesson01.box;

public class TestBox {
    public static void main(String[] args) {
      new TestBox().run();

    }

    public void run() {
        // test a.
        Apple a = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple01 = new Box();
        Box<Apple> boxApple02 = new Box();
        Box<Apple> boxApple03 = new Box();
        Box<Orange> boxOrange = new Box();

        for (int i = 0; i < 10 ; i++) {
            boxApple01.add(a);
            boxApple02.add(a);
            boxOrange.add(orange);
        }

        for (int i = 0; i < 5 ; i++) {
            boxApple03.add(a);
        }


        // test b.
        //boxOrange.add(a);

        // test c., d.
        System.out.println("test c., d.");
        printInfo("boxApple01",boxApple01);
        printInfo("boxApple02",boxApple02);
        printInfo("boxApple03",boxApple03);
        //;
        // test e.
        System.out.println("test e. сравнить");
        System.out.println("сравнить boxApple01 и boxApple02: "+boxApple01.compare(boxApple02));
        System.out.println("сравнить boxApple01 и boxApple03: "+boxApple01.compare(boxApple03));

        //System.out.println("сравнить boxApple01 и boxOrange: "+boxApple01.compare(boxOrange));
        // test f. пересыпать
        System.out.println("test f. пересыпать");
        printInfo("boxApple01",boxApple01);
        printInfo("boxApple03",boxApple03);
        boxApple01.move(boxApple03);
        printInfo("boxApple01",boxApple01);
        printInfo("boxApple03",boxApple03);
    }

    private static void printInfo(String str, Box box) {
        System.out.printf("%s - количество %d, вес %.1f \n",str,box.getSize(),box.getWeight());
    }
}
