// Brute force

/*
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class Remove_duplicates {

    public static int removeduplicates(int[] nums, int n){
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");

        int n = input.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }

        int result = removeduplicates(nums, n);
        System.out.println("Number of unique elements in the array: " + Arrays.toString(nums) + " are: " + result);
        input.close();
    }
}
    */

// OPtimal approach
/* 
import java.util.*;

public class Remove_duplicates {

       
        public static int removeduplicates(int[] nums, int n){
            
            if(nums.length == 0) return 0;


            // Two pointer approach
            int i = 0;
            for(int j = 1; j < nums.length; j++){
                if(nums[j] != nums[i]){
                    i ++;

                    nums[i] = nums[j];
                }
            }
            return i+1;
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elemnts of the array: ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }

        int result = removeduplicates(nums, n);

        System.out.println("Nummber of uniques elements in the array: " + Arrays.toString(nums) + " :is " + result);
        input.close();
    }
}

*/

