package ru.job4j.tracker;

public class FindItemByName implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name of item: ");
        Item[] findItem = tracker.findByName(name);
        if (findItem.length > 0) {
            for (int i = 0; i < findItem.length; i++) {
                System.out.println(findItem[i]);
            }
        } else {
            System.out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
