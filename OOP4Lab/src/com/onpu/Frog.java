package com.onpu;

public class Frog extends Animal {
    public Frog(String name, String sex, String age) {
        super(name, sex, age);
    }
    @Override
    public String playVoice(){
        String voice = "CROCK";
        return voice;
    }
    public void jump(){}
}
