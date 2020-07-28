package org.vishnu.client;

import org.vishnu.singleton.SerializableSingleton;

import java.io.*;

/**
 * @author vishnu.g
 * @project org.vishnu.client : singleton-pattern
 * @created 23/May/2020
 */
public class SingletonAndSerialization {
    public static void main(String[] args) {
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();

        try{
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(serializableSingleton);
            out.close();

            /** Deserialize singleton object from the file **/
            ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            SerializableSingleton deserializeObject = (SerializableSingleton) in.readObject();
            in.close();

            System.out.println("serializableSingleton hashCode: " + serializableSingleton.hashCode());
            System.out.println("deserializeObject hashCode: " + deserializeObject.hashCode());
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
