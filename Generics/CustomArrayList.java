package Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int data[];
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        data[size++] = num;

        if (isFull()) {
            resize();
        }
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[size--];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return data.length;
    }

    public void set(int index, int num) {
        data[index] = num;
    }

    @Override
    public String toString() {
        return "CustomArrayList {" +
                " data = " + Arrays.toString(data) + ", size = " + size + "}";

    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        list.add(2);
        list.add(5);

        System.out.println(list);
    }
}
