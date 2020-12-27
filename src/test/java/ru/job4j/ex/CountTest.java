package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CountTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Count.add(10, 2);
    }

    @Test
    public void when0to2then3() {
        int rsl = Count.add(0, 3);
        assertEquals(rsl, 3);
    }

}