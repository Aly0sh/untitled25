package com.company;

public class iPhone_12 extends phone {
    iPhone_12(int year, String model) {
        super(year, model);
    }

    @Override
    public void call(int number) {
        System.out.println("iPhone звонит на номер "+number);
    }

    @Override
    public void ring(int inputnumber) {
        System.out.println("Принимаю звонок на iPhone");
    }
}
