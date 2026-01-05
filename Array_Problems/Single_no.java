// Brute force Approach

/*
import java.util.*;

public class Single_no {

    public static int singlenumber(int[] nums, int n){

        for(int i = 0; i < n; i++){
            int num = nums[i];
            int cnt = 0;

            for(int j = 0; j < n; j++){
                if(nums[j] == num)
                    cnt ++;
            }
            if(cnt == 1)
                return num;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the arary: ");
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }
        int result = singlenumber(nums, n);
        System.out.println("Single number present in the array: " + Arrays.toString(nums) + " is: " + result);
        input.close();
    }
}
*/

// Optimized approach

/* 
import java.util.*;

public class Single_no {

    public static int singlenumber(int[] nums, int n){
        int xor = 0;

        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }
        int result = singlenumber(nums, n);
        System.out.println("Number with single occurance in the array " + Arrays.toString(nums) + " is: " + result);
        input.close();
    }
    
}
    */

