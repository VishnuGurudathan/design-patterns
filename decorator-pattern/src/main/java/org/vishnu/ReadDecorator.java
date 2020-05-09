package org.vishnu;

/**
 * @author vishnu.g
 * @project org.vishnu : decorator-pattern
 * @created 09/May/2020
 */
public abstract class ReadDecorator implements Reader {

    protected Reader reader;

    public ReadDecorator(Reader reader) {
        this.reader = reader;
    }
}
