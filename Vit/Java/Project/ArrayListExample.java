package Vit.Java.Project;

import java.util.ArrayList;

public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        //  ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println(fruits);
        // Displaying the elements of the ArrayList
        System.out.println("ArrayList elements: " + fruits);

        // Accessing elements by index
        System.out.println("Element at index 1: " + fruits.get(1));

        // Checking if an element is present
        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Contains 'Grapes': " + fruits.contains("Grapes"));

        // Getting the size of the ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // Removing an element by value
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

         //Iterating through the ArrayList
       // System.out.println("Iterating through ArrayList:");
        
        //for (String fruit : fruits) 
        //{
            //System.out.println(fruit);
        //}

        // Clearing the ArrayList
        //fruits.clear();
        //System.out.println("After clearing the ArrayList: " + fruits);
    }
}