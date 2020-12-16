package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Число пассажиров " + count);
    }

    @Override
    public float azs(float petrol) {
        System.out.println("Вы заправили " + petrol + " л топлива");
        return 0;
    }
}
