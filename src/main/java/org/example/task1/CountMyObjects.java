package org.example.task1;

public class CountMyObjects {
    private static int amount;

    public CountMyObjects() {
        amount++;
    }

    public static int showAmountOfObjects(){
        return amount;
    }
}
