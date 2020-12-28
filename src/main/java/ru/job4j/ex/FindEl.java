package ru.job4j.ex;

public class FindEl {
    public static String indexOf(String[] value, String key) throws ElementNotFoundException {
        String rsl = "-1";
        for (String s : value) {
            if (key.equals(s)) {
                rsl = s;
                break;
            } else {
                throw new ElementNotFoundException("Element could not be found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = new String[] {"1", "a", ">" };
        try {
            indexOf(value, "2");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
