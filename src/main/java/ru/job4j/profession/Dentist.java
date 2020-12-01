package ru.job4j.profession;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, String birthday,
                   String hospitalName, int price, int countOfPacientsInDay) {
    super(name, surname, education, birthday, hospitalName, price, countOfPacientsInDay);
    }

    public boolean removeTeeth(Pacient pacient) {
        return false;
    }
}
