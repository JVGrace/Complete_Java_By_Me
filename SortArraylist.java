import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Print the unsorted ArrayList
        System.out.println("Unsorted ArrayList: " + names);

        // Sort the ArrayList alphabetically
        Collections.sort(names);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + names);
    }
}