import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(1);
        originalList.add(3);
        originalList.add(3);
        originalList.add(4);

        ArrayList<Integer> uniqueList = removeDuplicates(originalList);
        System.out.println("Original List: " + originalList);
        System.out.println("Unique List: " + uniqueList);
    }
}