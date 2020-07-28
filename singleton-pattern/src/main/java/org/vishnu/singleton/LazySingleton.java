package org.vishnu.singleton;

/**
 * @author vishnu.g
 * @project org.vishnu.singleton : singleton-pattern
 * @created 23/May/2020
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton;

    /** private constructor to prevent others from instantiating this class **/
    private LazySingleton() {}

    /** Lazily create the instance when it is accessed for the first time **/
    public static synchronized  LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /*
    * synchronized method acquires a lock on the whole object. This means no other thread can use any synchronized
    * method in the whole object while the method is being run by one thread. synchronized blocks acquires a lock
    * in the object between parentheses after the synchronized keyword.
    * */
    /** Lazily initialize the singleton in a synchronized block **/
    public static synchronized  LazySingleton getInstanceOptimized () {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

    public void getDescription() {
        System.out.println("Lazily Initialized Singleton");
    }
}
