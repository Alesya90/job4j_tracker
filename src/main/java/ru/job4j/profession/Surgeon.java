package ru.job4j.profession;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, String birthday,
                   String hospitalName, int price, int countOfPacientsInDay) {
        super(name, surname, education, birthday, hospitalName, price, countOfPacientsInDay);
    }

    public void makeBandage(Pacient pacient) {
    }
}
