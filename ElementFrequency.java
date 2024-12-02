import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        // Initialize the array list with elements
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(2);
        arrList.add(1);
        arrList.add(4);
        arrList.add(5);
        arrList.add(2);

        // Create a HashMap to store element frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the ArrayList and count element frequencies
        for (int element : arrList) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        // Print the frequency map
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}