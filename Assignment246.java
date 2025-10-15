Create a class called SetterMessage with single member variable called message, which is instantiated with null. Instantiate this class using InversionControl and test.

1.SetterMessage.java


package com.example.model;

public class SetterMessage {
    private String message = null; // default null

    // Setter method
    public void setMessage(String message) {
        this.message = message;
    }

    // Getter method
    public String getMessage() {
        return message;
    }
}


2.beans.xml


package com.example.client;

import com.example.model.SetterMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMessageTest {
    public static void main(String[] args) {
        // Load Spring XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the bean
        SetterMessage messageObj = (SetterMessage) context.getBean("setterMessageBean");

        // Display the message
        System.out.println("Message: " + messageObj.getMessage());
    }
}
