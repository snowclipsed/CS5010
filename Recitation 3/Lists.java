
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import  java.util.ListIterator;
import java.util.LinkedList;

/**
 *  This file aims to explain List Interfaces in java.
 *  Written by Hardik Bishnoi for the CS5010 Recital.
 *
 *  Lists in Java are extended through an interface.
 *
 *  An interface in java is a class blueprint. It specifies what a class can do. (According to GeeksForGeeks)
 *
 *  "An interface is like a superclass in some senses" ~ Jiawei Zou (Teammate)
 *
 *  The interface can extend either LinkedList or ArrayLists.
 */

public class Lists {

    public void lists() {
        // Let's define our linked list here
        List<String> campus = new LinkedList<String>(); // List keyword is the interface here. We use the new keyword to define a new LinkedList called campus
        campus.add("Boston");
        campus.add("Portland");
        campus.add("Seattle");
        campus.add("Charlotte");
        campus.add("London");

        // let's try fetching the first linked list
        String first = campus.get(0);

        // we can also output from the linked list
        System.out.printf("Here's an output from the Linked List \n");
        System.out.printf("First we print the first element and then the entire list again \n");
        System.out.println(first);

        for (String campuses : campus) {
            System.out.println(campuses);
        }

        List<String> NEU = new ArrayList<String>(); // List keyword is the interface here. We use the new keyword to define a new LinkedList called campus
        NEU.add("Boston");
        NEU.add("Portland");
        NEU.add("Seattle");
        NEU.add("Charlotte");
        NEU.add("London");



        // let's try fetching the first linked list
        String second = campus.get(1);

        System.out.printf("Here's an output from the Array List \n");
        System.out.printf("First we print the second element and then the entire list again \n");
        System.out.println(second);

        // we can also output from the linked list
        for (String campuses : campus) {
            System.out.println(campuses);
        }

    }
}
