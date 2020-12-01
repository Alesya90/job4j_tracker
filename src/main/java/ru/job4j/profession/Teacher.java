package ru.job4j.profession;

public class Teacher extends Profession {
    private String subject;

    public Teacher(String name, String surname, String education, String birthday, String subject) {
        super(name, surname, education, birthday);
        this.subject = subject;
    }

    public void mark(Student student) {
    }

}
