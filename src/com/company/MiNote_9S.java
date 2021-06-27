package com.company;

public class MiNote_9S extends phone{
    MiNote_9S(int year, String model) {
        super(year, model);
    }

    @Override
    public void call(int outputnumber) {
        System.out.println("Redmi Note 9S звонит на номер "+outputnumber);
    }

    @Override
    public void ring(int inputnumber) {
        System.out.println("Принимаю звонок на Redmi Note 9S с номера "+inputnumber);
    }
}
