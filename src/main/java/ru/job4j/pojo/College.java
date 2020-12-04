package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ротовская А.В.");
        student.setGroup("ПМИ-28");
        student.setStart("12.08.2007");

        System.out.println(student.getFio() + " зачислена в группу :" + student.getGroup() + " "
                + student.getStart());
    }
}
