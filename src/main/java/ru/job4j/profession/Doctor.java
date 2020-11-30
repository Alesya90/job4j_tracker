package ru.job4j.profession;

public class Doctor extends Profession {
    private String hospitalName;
    private int price;
    private int countOfPacientsInDay;

    public void heal(Pacient pacient) {
        countOfPacientsInDay++;
    }
}
