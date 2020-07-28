package org.vishnu.client;

import org.vishnu.singleton.*;

/**
 * @author vishnu.g
 * @project org.vishnu.client : singleton-pattern
 * @created 22/May/2020
 */
public class SingletonDemo {
    public static void main(String[] args) {

        /** Eagerly Initialized Singleton **/
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.getDescription();
        System.out.println("####################################################################");

        /** Eagerly Initialized Static Block Singleton **/
        EagerStaticBlockSingleton eagerStaticBlockSingleton = EagerStaticBlockSingleton.getInstance();
        eagerStaticBlockSingleton.getDescription();
        System.out.println("####################################################################");

        /** Lazily Initialized Singleton **/
        LazySingleton lazySingleton = LazySingleton.getInstanceOptimized();
        lazySingleton.getDescription();
        System.out.println("####################################################################");

        /** Lazily Initialized Double-Checked Locking Singleton **/
        LazyDoubleCheckedLockingSingleton lazyDoubleCheckedSingleton = LazyDoubleCheckedLockingSingleton.getInstance();
        lazyDoubleCheckedSingleton.getDescription();
        System.out.println("####################################################################");

        /** Singleton with bill pugh solution (Lazily Initialized Inner Class Singleton) **/
        LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
        lazyInnerClassSingleton.getDescription();
        System.out.println("####################################################################");

        /** Enum Singleton **/
        EnumSingleton.INSTANCE.getDescription();
        System.out.println("####################################################################");
    }
}
