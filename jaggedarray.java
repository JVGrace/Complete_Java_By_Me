/*
Jagged array :Multi dimensional array: Inner array can have any size but it should be specified
int nums[][] = new int[7][]; : Outer array fixed
nums[0]=new int[4];
nums[1]=new int[2];
nums[2]=new int[9];
Inside array index: value specified only then can we get error free array
Multiple array are allowed and same thing can be done
int num[][][][]=new int[8][][][];
Takes heap memory takes space continuously and has fixed size

*/
public class jaggedarray{
    public static void main(String[] args) {
        int nums[][]=new int[5][];
        nums[0] = new int[3];
        nums[1] = new int[6];
        nums[2] = new int[7];
        nums[3] = new int[7];
        nums[4] = new int[7];
        
        // another way
        // for (int[] num : nums) {
        //     for (int j = 0; j < num.length; j++) {
        //         num[j] = (int)(Math.random()*100);
        //         System.err.print(num[j] + "    ");
        //     }   
        //     System.err.println();
        // }
         
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]= (int)(Math.random()*100);
                System.out.print(nums[i][j]+"    ");
            }   
            System.err.println();
        }
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print( m+"    ");
            }
            System.out.println();
        }
    }
}