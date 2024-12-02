
import java.util.ArrayList;
import java.util.stream.Stream;

public class streamExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(73);
        al.add(3);
        al.add(2);
        al.add(734);
        Stream<Integer> s1 =al.stream().distinct();
        Stream<Integer> s2 =al.stream().filter((i)->i%2==0);
        Stream<Integer> s3 =al.stream().map((i)->i*i);
        Stream<Integer> s4 = al.stream().sorted();
        Stream<Integer> s5 = al.stream().sorted((o1,o2)->o2-o1);
        System.out.println("Stream Example using filter method: will count the nombers after filter "+s1.count());
        s5.forEach(System.out::println);
        s2.forEach(System.out::println);
      
        s3.forEach(System.out::println);
    }
}
