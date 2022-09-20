package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color =color;
        this.numberOfPaws =numberOfPaws;
        this.hasFur =hasFur;
    }

    public String getDescription(){
        String k,s;
        k= hasFur == true ? "a" : "no";
        s= numberOfPaws ==1  ? " paw" : " paws";
        String response ="This animal is mostly "+color+". It has "+numberOfPaws+s+" and "+k+" fur.";
        return response;
    }

    

}
