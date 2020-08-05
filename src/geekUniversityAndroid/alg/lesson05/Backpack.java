package geekUniversityAndroid.alg.lesson05;

import java.util.LinkedList;
import java.util.List;

public class Backpack {
    private int size;
    private int sizeBackpackBox = 0;
    private List<Box> boxArrIn;
    private List<Box> backpackBox =  new LinkedList<>();;

    public Backpack(int size) {
        this.size = size;
    }


    //private void addBox(List<Box> sort, List<Box> boxArr) {
    private void addBox() {

        if (boxArrIn.size() == 0) {
            return;
        }
        Box boxOk = boxArrIn.remove(0);
        for (int i = 0; i < boxArrIn.size(); i++) {
            if (boxArrIn.get(i).getPrice() > boxOk.getPrice() && (boxArrIn.get(i).getWeight() < boxOk.getWeight())) {
                Box buf = boxArrIn.get(i);
                boxArrIn.set(i,boxOk);
                boxOk = buf;
            }

        }

        if (size >= sizeBackpackBox+boxOk.getWeight()) {
            sizeBackpackBox = sizeBackpackBox+boxOk.getWeight();
            backpackBox.add(boxOk);
            if (boxArrIn.size() > 1) {
                addBox();
            } else {
                backpackBox.add(boxArrIn.remove(0));
            }
        }


    }

    public List<Box> getRemains() {
        return boxArrIn;
    }


    public List<Box> add(List<Box> boxArrIn) {
        this.boxArrIn = boxArrIn;
        addBox();
        return boxArrIn;
    }

    public List<Box> getBackpackBox(){
        return backpackBox;
    }
    public int getSizeBackpackBox() {
        return sizeBackpackBox;
    }
}
