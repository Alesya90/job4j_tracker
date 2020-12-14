package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int match = 11;
        int count = 0;
        int gamer = 0;
        while (match > 0) {
            if (count % 2 == 0) {
                gamer = 1;
            } else {
                gamer = 2;
            }
            System.out.println(gamer + " игрок вытягивает от 1 до 3 спичек");
            System.out.print("Ваш выбор: ");
            int select = Integer.valueOf(input.nextLine());
            while (select < 1 || select > 3) {
                System.out.println("Вы играете не по правилам! Вытяните от 1 до 3 спичек");
                System.out.print("Ваш выбор: ");
                select = Integer.valueOf(input.nextLine());
            }
            while (select > match) {
                System.out.println("Столько спичек нет на столе, измените выбор!");
                System.out.print("Ваш выбор: ");
                select = Integer.valueOf(input.nextLine());
            }
            match = match - select;
            System.out.println("На столе осталось " + match + " спичек");
            count++;
        }
        System.out.println("Игра завершена, выиграл игрок " + gamer);
    }
}
