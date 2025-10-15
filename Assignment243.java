Create a class called DefaultMessage with a single member variable called message, which is initialized with the default value spring. Instantiate this class and test.

1.DefaultMessage.java


public class DefaultMessage {
    // Member variable initialized with default value
    private String message = "spring";

    // Getter for message
    public String getMessage() {
        return message;
    }
}


2.DefaultMessageTest.java
 

public class DefaultMessageTest {
    public static void main(String[] args) {
        // Instantiate DefaultMessage
        DefaultMessage dm = new DefaultMessage();

        // Display the default message
        System.out.println("Message: " + dm.getMessage());
    }
}
