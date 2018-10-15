package com.onpu;

public class Animal {
    private String name;
    private String sex;
    private String age;

    public Animal(String name, String sex, String age) {
        this.name = name;
        do System.out.println("Wrong value");
        while (sex != "male" || sex != "fermale");
        this.sex = sex;
        this.age = age;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }

    public String getAge() {

        return age;
    }

    public void setAge(String age) {

        this.age = age;
    }

    public String playVoice() {
        String voice = "AAAAAAA";
        return voice;
    }
}
