package com.company;

public abstract class phone {// абстрактный класс phone
    private String model;   // модель
    private int year;       // год выхода телефона
    phone(int year, String model){
        this.year=year;
        this.model=model;
    }
    public String getModel(){
        return this.model;
    }
    public abstract void call(int outputnumber);    // звонок
    public abstract void ring(int inputnumber);     // входящий звонок
}
