package com.onpu;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Andrey", "Knyazhev", 1999, 111));
        students.add(new Student("Ivan", "Ivanov", 1999, 222));
        students.add(new Student("Dima", "Petrov", 1999, 333));
        students.add(new Student("Vlad", "Aleksandrov", 1999, 444));
        students.add(new Student("Nick", "Sidorov", 1999, 555));
        students.add(new Student("Dan", "Denov", 1999, 666));
        students.add(new Student("Roman", "Romanov", 1999, 777));

        Student student = new Student("Andrey", "Knyazhev");

        Group group = new Group(172, students);
        group.addStudent();
        group.addStudent();

        System.out.println(" Students quantity" + group.getStudentQuanity());

        Student s = group.getStudentById(111);

        if (s!=null) {

        }

        System.out.println(group.getStudentById(111).getSurname());

        group.removeStudent();
    }
}
