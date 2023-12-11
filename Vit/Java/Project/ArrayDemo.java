package Vit.Java.Project;
import java.util.ArrayList;
public class ArrayDemo {

    public static void main(String[] args) 
    {
        // Declaration and Initialization of Arrays
        int[] numbers; // Declaration of an integer array
        numbers = new int[5]; // Initialization with a size of 5

        String[] names = new String[3]; // Declaration and Initialization of a String array

        // Assigning values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        names[0] = "Anil";
        names[1] = "Sunil";
        names[2] = "Manil";

        // Accessing and displaying array elements
        System.out.println("Integer Array:");
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("\nString Array:");
        for (int i = 0; i < names.length; i++)
         {
            System.out.println("names[" + i + "] = " + names[i]);
        }

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Apples");
        shoppingList.add("Bananas");
        //shoppingList.remove("Apples");
        System.out.println(shoppingList);

    }
}
