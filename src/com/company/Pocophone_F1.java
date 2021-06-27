package com.company;

public class Pocophone_F1 extends phone{

    Pocophone_F1(int year, String model) {
        super(year, model);
    }

    @Override
    public void call(int outputnumber) {
        System.out.println("Pocophone F1 звонит на номер "+outputnumber);
    }

    @Override
    public void ring(int inputnumber) {
        System.out.println("Принимаю звонок на Pocophone F1");
    }
}
