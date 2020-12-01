package ru.job4j.profession;

public class SchoolTeacher extends Teacher {
    private String schoolName;

    public SchoolTeacher(String name, String surname, String education, String birthday,
                         String subject, String schoolName) {
        super(name, surname, education, birthday, subject);
        this.schoolName = schoolName;
    }
}
