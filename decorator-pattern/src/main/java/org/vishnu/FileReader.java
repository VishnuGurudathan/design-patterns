package org.vishnu;

/**
 * @author vishnu.g
 * @project org.vishnu : decorator-pattern
 * @created 09/May/2020
 */
public class FileReader implements Reader {

    private String filePath;

    public FileReader(String path) {
        this.filePath = path;
    }
    
    public void read() {
        System.out.printf("Reading file from : %s%n", this.filePath);
    }
}
