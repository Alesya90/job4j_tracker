package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id of item: "));
        if (tracker.delete(id)) {
            System.out.println("Удаление заявки произведено успешно");
        } else {
            System.out.println("Ошибка! Индекс не найден! Заявка не удалена");
        }
        return true;
    }
}