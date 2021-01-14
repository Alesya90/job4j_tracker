package ru.job4j.tracker;

public enum TrackerSingleEnum {
        INSTANCE; /* здесь мы указываем перечисления. */

        /* Конструкторы и методы. */
        public Item add(Item model) {
            return model;
        }

    public static void main(String[] args) {
        TrackerSingleEnum tracker = TrackerSingleEnum.INSTANCE;
    }
}
