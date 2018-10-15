package com.onpu;

import java.util.ArrayList;
import java.util.Scanner;

public class Group {

    private int groupId;
    private ArrayList<Student> students;


    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getGroupId() {

        return groupId;
    }

    public void setGroupId(int groupId) {

        this.groupId = groupId;
    }


    public Group(int groupId, ArrayList<Student> students) {
        this.groupId = groupId;
        this.students = new ArrayList<>();
    }

    public Group(ArrayList<Student> students) {

        this.students = students;
    }

    public int getStudentQuanity() {

        return this.students.size();
    }

    public Student getStudentById(int id) {

        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                return students.get(i);
            } else System.out.println("not found");
        }
        return null;
    }

    public void removeStudent() {
        this.students = new ArrayList<>();
        arrayOut(this.students);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int studentIDvalue = scan.nextInt();
        for (int i = 0; i < students.size(); i++) {
            students.removeIf(student -> student.getId() == studentIDvalue);
        }
        arrayOut(this.students);
    }


    public ArrayList<Student> getStudents() {

        return students;
    }

    private void arrayOut(ArrayList<Student> students) {
        for (int j = 0; j < students.size(); j++) {
            System.out.println(students.get(j).getSurname());
        }
    }

    public void addStudent() {
        String name;
        String surname;
        int year;
        int studentID;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = scan.nextLine();
        System.out.print("Enter student's surname: ");
        surname = scan.nextLine();
        System.out.print("Enter student's first year of education: ");
        year = scan.nextInt();
        System.out.print("Enter student ID: ");
        studentID = scan.nextInt();
        students.add(new Student(name, surname, year, studentID));
    }
}
