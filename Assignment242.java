A model class Movie has a below properties Sensitivity, Internal, and Restricted MovieIdString, MovieNameString, MovieActorString. Create a Spring XML configuration file to create a Bean entry for the Movie object with some sample property values. The client program should be able to display all the details of the Movie object on the console.


1.Movie.java


package com.example.model;

public class Movie {
    private String sensitivity;
    private String internal;
    private String restricted;
    private String movieId;
    private String movieName;
    private String movieActor;

    // Getters and Setters
    public String getSensitivity() { return sensitivity; }
    public void setSensitivity(String sensitivity) { this.sensitivity = sensitivity; }

    public String getInternal() { return internal; }
    public void setInternal(String internal) { this.internal = internal; }

    public String getRestricted() { return restricted; }
    public void setRestricted(String restricted) { this.restricted = restricted; }

    public String getMovieId() { return movieId; }
    public void setMovieId(String movieId) { this.movieId = movieId; }

    public String getMovieName() { return movieName; }
    public void setMovieName(String movieName) { this.movieName = movieName; }

    public String getMovieActor() { return movieActor; }
    public void setMovieActor(String movieActor) { this.movieActor = movieActor; }

    @Override
    public String toString() {
        return "Movie [Sensitivity=" + sensitivity + ", Internal=" + internal + ", Restricted=" + restricted +
                ", MovieId=" + movieId + ", MovieName=" + movieName + ", MovieActor=" + movieActor + "]";
    }
}


2.beans.xml


<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Bean definition for Movie -->
    <bean id="movieBean" class="com.example.model.Movie">
        <property name="sensitivity" value="High"/>
        <property name="internal" value="Yes"/>
        <property name="restricted" value="No"/>
        <property name="movieId" value="M101"/>
        <property name="movieName" value="Inception"/>
        <property name="movieActor" value="Leonardo DiCaprio"/>
    </bean>
</beans>


3.MovieClient.java

package com.example.client;

import com.example.model.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieClient {
    public static void main(String[] args) {
        // Load Spring XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get Movie bean
        Movie movie = (Movie) context.getBean("movieBean");

        // Display movie details
        System.out.println("Movie Details:");
        System.out.println("Sensitivity: " + movie.getSensitivity());
        System.out.println("Internal: " + movie.getInternal());
        System.out.println("Restricted: " + movie.getRestricted());
        System.out.println("Movie ID: " + movie.getMovieId());
        System.out.println("Movie Name: " + movie.getMovieName());
        System.out.println("Movie Actor: " + movie.getMovieActor());
    }
}

