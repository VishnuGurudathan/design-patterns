package org.vishnu;

import org.vishnu.message.*;
import org.vishnu.shape.Color;
import org.vishnu.shape.RedColor;
import org.vishnu.shape.Shape;
import org.vishnu.shape.Square;

/**
 * Created By : vishnu.g
 * Created On : 30/Jun/2020
 *
 * @project PACKAGE_NAME : bridge-pattern
 */
public class Client {
    public static void main(String[] args) {
        /*Message Has-A relationship with MessageSender*/
        /*
        * Message               ~ Abstraction
        * TextMessage           ~ RefinedAbstraction
        *
        * Implementor           ~ MessageSender
        * ConcreteImplementor   ~ TextMessageSender
        * */
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();

        Color redColor = new RedColor();
        Shape square = new Square(5, redColor);
        square.paintShape();


    }
}
