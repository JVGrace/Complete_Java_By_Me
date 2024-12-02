import java.util.LinkedList;

public class LinkedListRemoveAndAdd {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to the LinkedList
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");

        // Print the LinkedList
        System.out.println("Initial LinkedList: " + animals);

        // Add an element at the beginning
        animals.addFirst("Horse");
        System.out.println("LinkedList after addFirst(): " + animals);

        // Add an element at the end
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);

        // Remove the first element
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals);

        // Remove the last element
        animals.removeLast();
        System.out.println("LinkedList after removeLast(): " + animals);

        // Iterate over the LinkedList using for-each loop
        System.out.println("Accessing linked list elements:");
        for (String animal : animals) {
            System.out.print(animal + ", ");
        }
    }
}