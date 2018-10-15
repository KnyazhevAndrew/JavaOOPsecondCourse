package com.onpu;

public class Dog extends Animal {
    public Dog(String name, String sex, String age) {
        super(name, sex, age);
    }
    @Override
    public String playVoice(){
        String voice = "BARK";
        return voice;
    }
    public void givePaw(){}
}
