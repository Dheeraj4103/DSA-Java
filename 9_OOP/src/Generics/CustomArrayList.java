package Generics;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (this.isFull()) {
            this.resize();
        }

        this.data[this.size++] = num;
    }

    private boolean isFull() {
        return this.size == this.data.length;
    }

    private void resize() {
        Object[] temp = new Object[this.data.length * 2];
        for (int i = 0; i < this.data.length; i++){
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    public T remove() {
        T removed = (T)this.data[--size];
        return removed;
    }

    public T get(int index){
        return (T)this.data[index];
    }

    public void set(int index, T value){
        this.data[index] = value;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        String ans = "";
        for (int i = 0; i < size; i++){
            ans += this.data[i] + " ";
        }
        return ans;
    }
}



