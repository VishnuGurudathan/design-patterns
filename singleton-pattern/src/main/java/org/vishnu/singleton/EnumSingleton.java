package org.vishnu.singleton;

import java.util.Arrays;

/**
 * @author vishnu.g
 * @project org.vishnu.singleton : singleton-pattern
 * @created 23/May/2020
 */
public enum EnumSingleton {

    /**
     *  An Enum value is initialized only once at the time of class loading.
     * It is singleton by design and is also thread-safe. *
     * */
    WEEKDAY("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"),
    WEEKEND("Saturday", "Sunday"),
    INSTANCE;

    private String[] days;

    EnumSingleton () {}
    EnumSingleton(String ...days) {
        System.out.println("Initializing enum with " + Arrays.toString(days));
        this.days = days;
    }

    public String[] getDays() {
        return this.days;
    }

    @Override
    public String toString() {
        return "EnumSingleton{" +
                "days=" + Arrays.toString(days) +
                '}';
    }

    public void getDescription() {
        System.out.println("Enum Singleton");
    }
}
