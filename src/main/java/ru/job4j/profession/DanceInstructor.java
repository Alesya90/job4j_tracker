package ru.job4j.profession;

public class DanceInstructor extends Teacher {
    private String danceType;

    public DanceInstructor(String name, String surname, String education, String birthday,
                           String subject, String danceType) {
        super(name, surname, education, birthday, subject);
        this.danceType = danceType;
    }

    public void teachToDance(Student student) {
    }
}
