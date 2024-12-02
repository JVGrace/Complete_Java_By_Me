import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Date");
        myList.add("Elderberry");

        System.out.println("Original List: " + myList);

        // Shuffle the ArrayList
        Collections.shuffle(myList);

        System.out.println("Shuffled List: " + myList);
    }
}