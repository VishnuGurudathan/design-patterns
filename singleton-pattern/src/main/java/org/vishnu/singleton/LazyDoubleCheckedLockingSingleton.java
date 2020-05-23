package org.vishnu.singleton;

/**
 * @author vishnu.g
 * @project org.vishnu.singleton : singleton-pattern
 * @created 23/May/2020
 */
public class LazyDoubleCheckedLockingSingleton {

    private static volatile LazyDoubleCheckedLockingSingleton lazyDoubleCheckedSingleton;

    /** private constructor to prevent others from instantiating this class **/
    private LazyDoubleCheckedLockingSingleton() {}


    /** Lazily initialize the singleton in a synchronized block **/
    public static LazyDoubleCheckedLockingSingleton getInstance() {
        if (lazyDoubleCheckedSingleton == null) {
            synchronized (LazyDoubleCheckedLockingSingleton.class) {
                // double check
                if (lazyDoubleCheckedSingleton == null) {
                    lazyDoubleCheckedSingleton = new LazyDoubleCheckedLockingSingleton();
                }
            }
        }
        return lazyDoubleCheckedSingleton;
    }

    public void getDescription() {
        System.out.println("Lazily Initialized Double-Checked Locking Singleton");
    }
}
