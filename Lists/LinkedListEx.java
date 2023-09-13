package Lists;

//written by MK Fairfield
//last edit:

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



    }
}



