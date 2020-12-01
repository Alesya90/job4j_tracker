package ru.job4j.profession;

public class Doctor extends Profession {
    private String hospitalName;
    private int price;
    private int countOfPacientsInDay;

    public Doctor(String name, String surname, String education, String birthday,
                  String hospitalName, int price, int countOfPacientsInDay) {
        super(name, surname, education, birthday);
        this.hospitalName = hospitalName;
        this.price = price;
        this.countOfPacientsInDay = countOfPacientsInDay;
    }

    public void heal(Pacient pacient) {
        countOfPacientsInDay++;
    }
}
