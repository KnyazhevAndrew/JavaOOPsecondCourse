package com.onpu;

public class Cat extends Animal {


    public Cat(String name, String sex, String age) {

        super(name, sex, age);
    }
    @Override
    public String playVoice(){
        String voice = "MEW";
        return voice;
    }
public void purr(){}
}
