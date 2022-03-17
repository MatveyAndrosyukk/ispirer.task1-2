package org.example.task2;

import java.util.Arrays;

public class MyArrayList<T> {
    private int size = 10;
    private Object[] innerArray;

    public void add(T obj){
        if (innerArray == null){
            createInnerArray(obj);
        }
        else {
            if (innerArray[size -1] != null){
                changed();
                addElement(obj);
            }else {
                addElement(obj);
            }
        }
    }

    public Object get(int index){
        return innerArray[index];
    }

    private void createInnerArray(T obj) {
        innerArray = new Object[size];
        innerArray[0] = obj;
    }

    private void addElement(T obj){
        int counter = 0;
        while (innerArray[counter] != null){
            if (innerArray[counter + 1] == null){
                innerArray[counter + 1] = obj;
                return;
            }
            counter++;
        }
    }

    private void changed() {
        this.size = size * 2 + 1;
        Object[] newArray = new Object[size];
        for (int i = 0; i < innerArray.length; i++) {
            newArray[i] = innerArray[i];
        }
        this.innerArray = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < innerArray.length; i++) {
            if (innerArray[i + 1] != null){
                sb.append(innerArray[i] + ", ");
            }else {
                sb.append(innerArray[i]);
                break;
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
