/* String Buffer a method for creating string with a buffer size
 * StringBuffer sv=new StringBuffer();//sv.capacity():16 // sv.length():0
 * Buffer Size increases after every string added
 * StringBuffer sv=new StringBuffer("Berus");//sv.capacity():21 // sv.length():5
 * sv.append(" new"); // Berus new: length() 9 capacity: 25
 * can get string data using method: new StringBuffer.toString(): sv.toString() 
 * Different Methods: same as string builder
 * Thread Safe: String Builder is not safe
*/

public  class  StringBufferDemo{
    public static void main(String[] args) {
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sv= new StringBuffer();
        System.out.println("Size of String Buffer at initialization: "+sv.length());
        System.out.println("String buffer capasity now: "+sv.capacity());
        sv.append("New String BUffer data");
        System.out.println("New capacity: "+sv.capacity());
        System.out.println("Size of String Buffer now: "+sv.length());
        sv.append("more data ");
        System.out.println("New capacity: "+sv.capacity());
        System.out.println("Size of String Buffer now: "+sv.length());
        System.out.println("Printing string buffer using toString method: "+sv.toString());
        sv.ensureCapacity(100);
        System.out.println("Capacity increased using ensure capacity: "+sv.capacity());
    }
}