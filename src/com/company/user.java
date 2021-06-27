package com.company;

import java.util.Scanner;

public class user{
    Scanner in=new Scanner(System.in);
    private String name;    // имя пользователя
    user (String name){
        this.name=name;
    }
    private phone []a={new iPhone_12(2020,"iPhone 12"), new Pocophone_F1(2018,"Pocophone F1"),
            new Nokia_3310(2000,"Nokia 3310"), new MiNote_9S(2020, "Redmi Note 9S")};   // список телефонов пользователя
    public String getName(){
        return this.name;
    }
    public void callFromAllPhones(){    // звонок через все телефоны
        System.out.print("Введите номер: ");
        int number=in.nextInt();
        for (phone i:a){
            i.call(number);
        }
    }
    public void callFrom(String phoneModel){    // звонок с определенного телефона
        System.out.print("Введите номер: ");
        boolean b=false;
        for (phone i:a){
            if (i.getModel().equals(phoneModel)){
                i.call(in.nextInt());
                b=true;
            }
        }
        if(!b){
            System.out.println("Не удалось найти такую модель");
        }
    }
}
