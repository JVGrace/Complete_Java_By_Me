/* Using Hashmap and printing custom output by using iterator and Map interface
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapProblem {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(101, "news");
        hm.put(109, "args");
        hm.put(132, "Wow");
        Set s= hm.entrySet();
        Iterator itr=s.iterator();
        while (itr.hasNext()) {
           Map.Entry m=(Map.Entry)itr.next();
            System.out.println();
        }
    }
}
