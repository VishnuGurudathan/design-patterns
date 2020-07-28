package org.vishnu.singleton;

import java.io.Serializable;

/**
 * @author vishnu.g
 * @project org.vishnu.singleton : singleton-pattern
 * @created 22/May/2020
 */
public class EagerSingleton {

    /** Create an instance of the class at the time of class loading **/
    private  static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    /** private constructor to prevent others from instantiating this class **/
    private EagerSingleton() {
        /** protect against instantiation via reflection **/
        if(EAGER_SINGLETON != null) {
            throw new IllegalStateException("Singleton already initialized");
        }
    }

    /** Provide a global point of access to the instance **/
    public static EagerSingleton getInstance() {
        return EAGER_SINGLETON;
    }

    public void getDescription() {
        System.out.println("Eagerly Initialized Singleton");
    }

    /**
     * @author vishnu.g
     * @project org.vishnu.client : singleton-pattern
     * @created 23/May/2020
     */
    public static class SerializableSingleton implements Serializable {

        private static final long serialVersionUID = 8906830716158732006L;

        private static SerializableSingleton serializableSingleton;

        /** private constructor to prevent others from instantiating this class **/
        public SerializableSingleton() {
            /** protect against instantiation via reflection **/
            if (serializableSingleton != null)
                throw new IllegalStateException("Singleton already initialized");
        }

        public static synchronized SerializableSingleton getInstance() {
            if(serializableSingleton == null) {
                serializableSingleton = new SerializableSingleton();
            }
            return serializableSingleton;
        }

        /** implement readResolve method to return the existing instance **/
    //    protected Object readResolve() {
    //        return serializableSingleton;
    //    }
    }
}
