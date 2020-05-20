package org.vishnu;

import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * @author vishnu.g
 * @project org.vishnu : factory-pattern
 * @created 19/May/2020
 */
public class Client {
    private static final String propertiesFileLocation = "src/main/resources/app.properties";
    private static final String factoryKey = "shape.factory.type";

    private ShapeFactory factory;

    /**
     *<p>
     *     Constructor
     *</p>
     * @param factory
     */
    public Client(ShapeFactory factory)
    {
        this.factory = factory;
    }

    public static void main(String[] args) throws Exception
    {
        /*
        * We can simply create the shape object from proper ShapeFactory.
        * Here SimpleShapeFactory is the concrete implementation of ShapeFactory.
        *
        * ShapeFactory shapeFactory = new SimpleShapeFactory();
        * Shape shape = shapeFactory.shapeCreator(ShapeType.CIRCLE);
        * */

        /*
        *
        * We can inject the Concrete shape factory to client using constructor like,
        * Client client = new Client(new SimpleShapeFactory());
        *                       or
        * we can inject at run time using property file.
        * */
        Client client = new Client(getFactory());
        Shape shape = client.shapeCreator(ShapeType.CIRCLE);
        shape.draw();
    }

    /**
     * <p>
     *     Create shape using shape type.
     * </p>
     * @param type
     * @return {@link Shape}
     * @throws Exception
     */
    private Shape shapeCreator(ShapeType type) throws Exception
    {
        return factory.createShape(type);
    }

    /**
     * <p>
     *      Read factory class name from property file.
     * </p>
     * @return {@link ShapeFactory}
     */
    private static ShapeFactory getFactory() {
        ShapeFactory result;
        try (FileInputStream fileInputStream = new FileInputStream(propertiesFileLocation)) {
            Properties properties = new Properties();
            properties.load(fileInputStream);

            Class<?> clazz = Class.forName(properties.getProperty(factoryKey));
            Constructor<?> constructor = clazz.getConstructor();
            result = (ShapeFactory) constructor.newInstance();
        } catch (Exception exec) {
            exec.printStackTrace();
            throw new IllegalArgumentException("Factory with '" + factoryKey + "' cannot be initiated.");
        }
        return result;
    }
}