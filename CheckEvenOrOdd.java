public class CheckEvenOrOdd {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i : a) {
            if(i%2==0){
                System.out.println("Even Number: "+i);
            }
            else{
                System.out.println("Odd Number: "+i);
            }
        }
    }
}
