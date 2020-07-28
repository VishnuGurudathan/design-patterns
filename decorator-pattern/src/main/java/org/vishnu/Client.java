package org.vishnu;

/**
 * @author vishnu.g
 * @project org.vishnu : decorator-pattern
 * @created 09/May/2020
 */
public class Client {
    public static void main(String[] args) {
        Reader reader = new FileReader("E://test.csv");
        reader.read();
    }
}
