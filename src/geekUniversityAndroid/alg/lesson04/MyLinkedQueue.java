package geekUniversityAndroid.alg.lesson04;

import java.util.Iterator;


public class MyLinkedQueue <T>{

    private MyLinkedList<T> linkedQueue = new MyLinkedList<>();


    public void add(T item){
        linkedQueue.insertLast(item);
    }

    public T peek(){
        return linkedQueue.getFirst();
    }
    public T poll() {
        T obj = peek();
        linkedQueue.deleteFirst();
        return obj;
    }

    public int size(){
        return linkedQueue.size();
    }

    public boolean isEmpty(){
        return linkedQueue.isEmpty();
    }

    public Iterator iterator() {
        return linkedQueue.iterator();
    }

    public boolean remove(T item) {
        return linkedQueue.delete(item);
    }


    @Override
    public String toString() {
        return linkedQueue.toString() ;
    }
}
