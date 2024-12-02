import java.util.ArrayList;
import java.util.Collections;

public class MaxElementFinder {
    public static int findMax(ArrayList<Integer> arrayList) {
        return Collections.max(arrayList);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(16);
        myList.add(26);
        myList.add(3);
        myList.add(52);
        myList.add(70);
        myList.add(12);

        int maxElement = findMax(myList);
        System.out.println("Maximum Element in ArrayList = " + maxElement);
    }
}