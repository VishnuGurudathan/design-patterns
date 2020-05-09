package org.vishnu;

/**
 * @author vishnu.g
 * @project org.vishnu : decorator-pattern
 * @created 09/May/2020
 */
public class CompressedFileReader extends ReadDecorator {
    public CompressedFileReader(Reader reader) {
        super(reader);
    }

    public void read() {
        System.out.println("Decompressing file.");
        this.reader.read();
    }
}
