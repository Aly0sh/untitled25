package com.company;

public class Nokia_3310 extends phone{
    Nokia_3310(int year, String model) {
        super(year, model);
    }

    @Override
    public void call(int outputnumber) {
        System.out.println("Nokia 3310 звонит на номер "+outputnumber);
    }

    @Override
    public void ring(int inputnumber) {
        System.out.println("Принимаю звонок на Nokia 3310 с номера "+inputnumber);
    }
}
