Create an abstract parent class called Shave with an abstract draw method and create subclass of this class like Rectangle, Triangle, Parallelogram. Define a simple Java class called DrawShave, which will instantiate an object depending on the dependency injection and calls appropriate draw method.

1.Shape.java

package com.example.shapes;

public abstract class Shave {
    // Abstract method
    public abstract void draw();
}

2.Rectangle.java

package com.example.shapes;

public class Rectangle extends Shave {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

3.Triangle.java


package com.example.shapes;

public class Triangle extends Shave {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}


4.Parallelogram.java

package com.example.shapes;

public class Parallelogram extends Shave {
    @Override
    public void draw() {
        System.out.println("Drawing a Parallelogram");
    }
}

5.beans.xml

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Dependency Injection: change the class to inject different shape -->
    <bean id="shapeBean" class="com.example.shapes.Rectangle"/>
    <!-- For Triangle: class="com.example.shapes.Triangle" -->
    <!-- For Parallelogram: class="com.example.shapes.Parallelogram" -->
</beans>


6.DrawShape.java


package com.example.client;

import com.example.shapes.Shave;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShave {
    public static void main(String[] args) {
        // Load Spring XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the shape bean
        Shave shape = (Shave) context.getBean("shapeBean");

        // Call the draw method
        shape.draw();
    }
}
