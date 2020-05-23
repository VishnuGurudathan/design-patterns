package org.vishnu.singleton;

/**
 * @author vishnu.g
 * @project org.vishnu.singleton : singleton-pattern
 * @created 23/May/2020
 */
public class LazyInnerClassSingleton {

    /** private constructor to prevent others from instantiating this class */
    private LazyInnerClassSingleton() {}

    /** This inner class is loaded only after getInstance() is called for the first time. **/
    private static class SingletonHelper {
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }

    /** Lazily initialize the singleton using static inner class **/
    public static LazyInnerClassSingleton getInstance() {
        return SingletonHelper.LAZY_INNER_CLASS_SINGLETON;
    }

    public void getDescription() {
        System.out.println("Lazily Initialized Inner Class Singleton (Bill Pugh singleton)");
    }
}
