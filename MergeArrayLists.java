import java.util.ArrayList;

public class MergeArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        System.out.println("Merged List: " + mergedList);
    }
}
