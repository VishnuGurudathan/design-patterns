package org.vishnu.singleton;

/**
 * @author vishnu.g
 * @project org.vishnu.singleton : singleton-pattern
 * @created 23/May/2020
 */
public class EagerStaticBlockSingleton {

    private static final EagerStaticBlockSingleton EAGER_STATIC_BLOCK_SINGLETON;

    /** private constructor to prevent others from instantiating this class **/
    private EagerStaticBlockSingleton() {}

    /** Create the one-and-only instance in a static block **/
    static
    {
        try {
            EAGER_STATIC_BLOCK_SINGLETON = new EagerStaticBlockSingleton();
        } catch (Exception exc) {
            throw new RuntimeException("Error in instance creation ! ", exc);
        }
    }

    /** Provide a global point of access to the instance **/
    public static EagerStaticBlockSingleton getInstance() {
        return EAGER_STATIC_BLOCK_SINGLETON;
    }

    public void getDescription() {
        System.out.println("Eagerly Initialized Static Block Singleton");
    }
}
