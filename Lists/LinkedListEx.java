package Lists;

//written by MK Fairfield
//last edit: 9/13/2023

import java.util.LinkedList;

public class LinkedListEx {
    static LinkedList<String> fruit = new LinkedList<String>(); //create a new linked list called 'fruit'

    public static void run() {
        //System.out.println("You can add items to a linked list using the \".add\" method.");
        //System.out.println("Example: 'fruit' LList before adding items: \n" + fruit);

        fruit.add("Strawberry");
        fruit.add("Blueberry");
        fruit.add("Orange");
        fruit.add("Banana");
        System.out.println("'fruit' LList after add: \n");

        System.out.println(fruit); //print the list, the contents will print wihtout any additional methods


        System.out.println("Other functions include: \n");

        //other methods include the following:
        //add first
        fruit.addFirst("Nectarine");
        System.out.println("Add first: " + fruit);

        //add last
        fruit.addLast("Apple");
        System.out.println("Add last: " + fruit);


        fruit.remove("Apple");
        System.out.println("Remove 'apple': " + fruit);


        fruit.removeFirst();
        System.out.println("Remove first: " + fruit);

        fruit.removeLast();
        System.out.println("Remove last: " + fruit);



        //citation: https://www.w3schools.com/java/java_linkedlist.asp
    }
}



