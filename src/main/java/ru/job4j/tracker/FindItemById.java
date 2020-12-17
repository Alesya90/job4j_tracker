package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id of item: "));
        Item foundItem = tracker.findById(id);
        if (foundItem != null) {
            System.out.println(foundItem);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
