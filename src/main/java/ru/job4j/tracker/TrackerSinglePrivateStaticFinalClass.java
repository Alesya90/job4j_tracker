package ru.job4j.tracker;

public class TrackerSinglePrivateStaticFinalClass {
    private TrackerSinglePrivateStaticFinalClass() {
    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final Tracker INSTANCE =
                new Tracker();
    }

}
