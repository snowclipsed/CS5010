import java.util.*;
/**
 * Syntax resource used : https://www.geeksforgeeks.org/arraylist-in-java/
 */
public class Arraylist {
    public void arraylist()
    {
//         creating the arraylist

        ArrayList<Integer> arr1 = new ArrayList<Integer>(6);

        ArrayList<String> arr2 = new ArrayList<String>(6);
        System.out.println("Creating new Arraylists");
        System.out.println("Arraylist1:" + arr1);
        System.out.println("Arraylist2:" + arr2);

//         setting the values
        for (int i = 0; i <= 6; i++) {
            arr1.add(i);

        }
        arr2.add(0,"People");
        arr2.add(1,"Hardik");
        arr2.add(2,"Isha");
        arr2.add(3,"Mary");
        arr2.add(4,"Jiawei");
        arr2.add(5,"Dhanush");


//         updating the second arraylist at index 1
        arr2.set(0,"Members");
        System.out.println("Printing the Arraylist");

//         printing the arraylist
        for (int i = 0; i <= arr1.size()-2; i++) {
            System.out.println( arr1.get(i)+" : "+arr2.get(i));
        }
//        removing an element from the list
            arr2.remove(0);
            arr1.remove(0);
//        printing the updated Arraylist
            System.out.println("Updated Arraylist");
            for (int i = 0; i <= 4; i++) {
                    System.out.println( arr1.get(i)+arr2.get(i));
            }
    }
}


