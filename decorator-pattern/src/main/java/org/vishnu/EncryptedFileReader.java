package org.vishnu;

/**
 * @author vishnu.g
 * @project org.vishnu : decorator-pattern
 * @created 09/May/2020
 */
public class EncryptedFileReader extends ReadDecorator {

    public EncryptedFileReader(Reader reader) {
        super(reader);
    }

    public void read() {
        System.out.println("Decrypting the file...");
        this.reader.read();
    }
}
