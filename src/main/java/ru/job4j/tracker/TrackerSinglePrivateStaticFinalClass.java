package ru.job4j.tracker;

public class TrackerSinglePrivateStaticFinalClass {
    private TrackerSinglePrivateStaticFinalClass() {
    }

    public static TrackerSinglePrivateStaticFinalClass getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSinglePrivateStaticFinalClass INSTANCE =
                new TrackerSinglePrivateStaticFinalClass();
    }

    public static void main(String[] args) {
        TrackerSinglePrivateStaticFinalClass tracker =
                TrackerSinglePrivateStaticFinalClass.getInstance();
    }
}
