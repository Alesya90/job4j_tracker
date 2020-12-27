package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    /*@Test  //1
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }*/

    /*@Test //2
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        // Добавим в tracker новую заявку
        Item item = tracker.add(new Item("Replaced item"));
        // Входные данные должны содержать ID добавленной заявки item.getId()
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf((item.getId())), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceItem(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }*/

    /*@Test //3
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        // Добавим в tracker новую заявку
        Item item = tracker.add(new Item("Deleted item"));
        // Входные данные должны содержать ID добавленной заявки item.getId()
        Input in = new StubInput(
                new String[] {"0", String.valueOf((item.getId())), "1"}
        );
        UserAction[] actions = {
                new DeleteItem(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }*/

    /*@Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenCreateItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), // id сохраненной заявки в объект tracker.
                "replaced item"
        };
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item delete = tracker.findById(item.getId());
        assertThat(delete, is(nullValue()));
    }*/

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenShowAllItems() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        Tracker tracker = new Tracker();

        UserAction[] actions = {
                new ShowAllItems(out), new Exit(out)
        };
        Item item1 = new Item();
        item1.setName("111");
        tracker.add(item1);

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Show all" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Show all items ====" + System.lineSeparator()
                        + "Item{id=1, name='111'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Show all" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindItemByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item1 = new Item();
        item1.setName("111");
        tracker.add(item1);
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item1.getName()), "1"}
        );

        UserAction[] actions = {
                new FindItemByName(out), new Exit(out)
        };

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find item by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find item by name ====" + System.lineSeparator()
                        + "Item{id=1, name='111'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find item by name" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindItemById() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item1 = new Item();
        item1.setName("111");
        tracker.add(item1);
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item1.getId()), "1"}
        );

        UserAction[] actions = {
                new FindItemById(out), new Exit(out)
        };

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find item by Id" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Find item by Id ====" + System.lineSeparator()
                        + "Item{id=1, name='111'}" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find item by Id" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

}