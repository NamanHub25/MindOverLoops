// Brute force approach
/*
package Array_Problems;

import java.util.Scanner;
import java.util.Arrays;

public class Largest_element {

    public static int largestelement(int[] nums, int n){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
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
        int result = largestelement(nums, n);
        System.out.println("Largest element in the array: " + Arrays.toString(nums) + " = " + result);
        input.close();
    }
}
    */

// Better approach
/*
package Array_Problems;

import java.util.Scanner;
import java.util.Arrays;

public class Largest_element {

    public static int secondlargest(int[] nums, int n){
            int largest = Integer.MIN_VALUE;
            int second_largest = Integer.MIN_VALUE;

           for(int i = 0; i < nums.length; i++){ // O(n)
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > second_largest && nums[i] != largest){ // O(n)
                second_largest = nums[i];
            }
        }
        return second_largest;
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

        int result = secondlargest(nums, n);
        System.out.println("Second largest element in the array: " + Arrays.toString(nums) + " is: " + result);
        input.close();
    }
}
    */

// Optimal approach

/* 
package Array_Problems;

import java.util.*;

public class Largest_element {

    public static int secondlargest(int[] nums, int n){
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                second_largest = largest;
                largest = nums[i];
            }
            else if(nums[i] < largest && nums[i] > second_largest){
                second_largest = nums[i];
            }
        }
        return second_largest;
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
        int result = secondlargest(nums, n);
        System.out.println("Second largest element in the array: " + Arrays.toString(nums) + " is: " + result);
        input.close();
    }
}
*/
