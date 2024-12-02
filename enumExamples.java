/*enum is kind of class in java that is an object 
 * enum is enumeration or object  
 */

enum Enumnew{
    Intialize , Loading, Waiting, Success;
} 
 public class enumExamples{
    public static void main(String[] args) {
        Enumnew[] e = Enumnew.values();
        System.out.println("Following are in enum class:");
        int i=1;
        for(Enumnew E:e){
            System.out.println(i+" : "+E);
            i++;
        }
    }
 } 