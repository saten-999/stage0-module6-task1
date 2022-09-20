package com.epam.mjc.stage0;

public class Bird extends Animal{

    public Bird(){
        super("blue",2,false);
    }

    @Override
    public String getDescription(){

        String response ="This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
        
        return response;
    }


    public static void main(String[] args){
        Bird a =new Bird();
        System.out.println(a.getDescription());
    }
}
