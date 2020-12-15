package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i].getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id of item: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter new item name: ");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                //tracker.add(newItem);
                tracker.replace(id, newItem);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Замена заявки произведена успешно");
                } else {
                    System.out.println("Ошибка! Индекс не найден! Заявка не заменена");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter id of item: ");
                int id = Integer.valueOf(scanner.nextLine());
                //tracker.delete(id);
                //System.out.println(tracker.delete(id));
                if (tracker.delete(id)) {
                    System.out.println("Удаление заявки произведено успешно");
                } else {
                    System.out.println("Ошибка! Индекс не найден! Заявка не удалена");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter id of item: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item foundItem = tracker.findById(id);
                if (foundItem != null) {
                    System.out.println(foundItem);
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name of item: ");
                String name = scanner.nextLine();
                Item[] findItem = tracker.findByName(name);
                if (findItem.length > 0) {
                    for (int i = 0; i < findItem.length; i++) {
                        System.out.println(findItem[i]);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
