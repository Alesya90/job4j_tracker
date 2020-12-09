package ru.job4j.tracker;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println("Текущие дата и время: " + item.getCreated().format(formatter));

        Item item2 = new Item();
        item2.setName("test2");
        Item item3 = new Item();
        item3.setName("test3");
        Tracker tracker = new Tracker();
        tracker.add(item2);
        tracker.add(item3);
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println("result of findAll: name = " + items[i].getName()
                    + ", id = " + items[i].getId());
        }
        Item[] items1 = tracker.findByName("test3");
        for (int i = 0; i < items1.length; i++) {
            System.out.println("result of findByName: " + items1[i].getName());
        }
        Item items2 = tracker.findById(2);
        System.out.println("result of findById: " + "name = " + items2.getName()
                + ", id = " + items2.getId());

        Item itemForToString = new Item(10, "For test of toString");
        System.out.println(itemForToString);
    }
}
