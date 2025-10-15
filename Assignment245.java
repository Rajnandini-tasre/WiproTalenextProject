Create a class called ConstructorMessage with a single member variable called Message which is initialized with None. The class will have parameterized constructor which initializes the member variable called Message. Instantiate this class using InversionControl and Test.

1.ConstructorMessage.java

package com.example.model;

public class ConstructorMessage {
    private String message = "None"; // default value

    // Parameterized constructor
    public ConstructorMessage(String message) {
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }
}


2.beans.xml


<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Bean definition using parameterized constructor -->
    <bean id="messageBean" class="com.example.model.ConstructorMessage">
        <constructor-arg value="Hello from Spring IOC!"/>
    </bean>
</beans>


3.ConstructorMessageTest.java

package com.example.client;

import com.example.model.ConstructorMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMessageTest {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the bean
        ConstructorMessage messageObj = (ConstructorMessage) context.getBean("messageBean");

        // Display message
        System.out.println("Message: " + messageObj.getMessage());
    }
}

