package org.example.task2;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        for (int i = 1; i <= 20; i++) {
            myArrayList.add(i);
        }
        System.out.println("All elements of MyArrayList: " + myArrayList);
        System.out.println("Get element by index: " + myArrayList.get(3));
    }
}
