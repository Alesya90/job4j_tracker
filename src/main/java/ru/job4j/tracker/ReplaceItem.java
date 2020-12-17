package ru.job4j.tracker;

public class ReplaceItem implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id of item: "));
        String name = input.askStr("Enter new item name: ");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            System.out.println("Замена заявки произведена успешно");
        } else {
            System.out.println("Ошибка! Индекс не найден! Заявка не заменена");
        }
        return true;
    }
}
