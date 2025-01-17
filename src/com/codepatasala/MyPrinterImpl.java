package com.codepatasala;

public class MyPrinterImpl implements MyPrinter{
    int counter = 0;
    @Override
    public void print(int a) {
        System.out.println("Received in impl: " + a + " with counter: " + counter++);
    }


    //pure functions vs. non-pure function

    //pure function
    public int add(int a, int b) {
        return a+b;
    }

    //non-pure function
    public int incrementCounter() {
        return counter++;
    }
}
