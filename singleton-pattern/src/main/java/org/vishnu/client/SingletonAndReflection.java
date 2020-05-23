package org.vishnu.client;

import org.vishnu.singleton.EagerSingleton;

import java.lang.reflect.Constructor;

/**
 * @author vishnu.g
 * @project org.vishnu.client : singleton-pattern
 * @created 23/May/2020
 */
public class SingletonAndReflection {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerReflectionInstance = null;

        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                eagerReflectionInstance = (EagerSingleton) constructor.newInstance();
            }
        } catch (Exception exc) {
            throw  new RuntimeException(exc);
        }

        System.out.println("eagerSingleton hashCode: " + eagerSingleton.hashCode());
        System.out.println("eagerReflectionInstance hashCode: " + eagerReflectionInstance.hashCode());
    }
}
