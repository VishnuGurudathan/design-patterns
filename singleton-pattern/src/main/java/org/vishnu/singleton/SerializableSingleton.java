package org.vishnu.singleton;

/**
 * @author vishnu.g
 * @project org.vishnu.singleton : singleton-pattern
 * @created 23/May/2020
 */
public class SerializableSingleton {

    private static final long serialVersionUID = 8906830526158936106L;

    private static SerializableSingleton serializableSingleton;

    /** private constructor to prevent others from instantiating this class **/
    private SerializableSingleton() {
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
    protected Object readResolve() {
        return serializableSingleton;
    }

}
