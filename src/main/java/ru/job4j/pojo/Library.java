package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", 500);
        Book book2 = new Book("Колобок", 10);
        Book book3 = new Book("Clean code", 400);
        Book book4 = new Book("Геометрия", 200);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book number = books[index];
            System.out.println(number.getName() + " - " + number.getPages());
        }
        System.out.println("Меняем местами 0 и 3 книгу");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book number = books[index];
            System.out.println(number.getName() + " - " + number.getPages());
        }
        System.out.println("Есть ли книга Clean code?");
        for (int index = 0; index < books.length; index++) {
            Book number = books[index];
            if (number.getName().equals("Clean code")) {
                System.out.println("Да, есть " + number.getName());
            }
        }
    }
}
