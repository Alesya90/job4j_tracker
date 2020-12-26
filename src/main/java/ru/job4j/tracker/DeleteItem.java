package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    private final Output out;

    public DeleteItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ====");
        int id = Integer.valueOf(input.askStr("Enter id of item: "));
        if (tracker.delete(id)) {
           out.println("Удаление заявки произведено успешно");
        } else {
            out.println("Ошибка! Индекс не найден! Заявка не удалена");
        }
        return true;
    }
}