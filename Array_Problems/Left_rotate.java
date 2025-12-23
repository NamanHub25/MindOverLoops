// Brute force approach
/*
import java.util.Scanner;
import java.util.Arrays;


public class Left_rotate {

    public static int[] leftrotate(int[] nums, int n){
        
        int[] arr = new int[n]; // Taking a temporary array to store shifted elements 

        for(int i = 1; i < nums.length; i++){
            arr[i-1] = nums[i]; // Filling the dummy array from 0th index 
        }
        arr[n-1] = nums[0]; // Moving the first element from original array to the dummy array

        return arr;
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
        int[] result = leftrotate(nums, n);
        System.out.println("Rotated array is: " + Arrays.toString(result));

        input.close();
    }
}
    */

// Optimal approach

import java.util.Scanner;
import java.util.Arrays;

public class Left_rotate { // nums = [1, 2, 3, 4, 5, 6, 7]

    public static int[] leftrotate(int[] nums, int n){
        int temp = nums[0]; // temp = 1

        for(int i = 1; i < nums.length; i++){
            nums[i-1] = nums[i]; // Shifting elements in the left
        }
        nums[n-1] = temp;
        return nums; // nums = [2, 3, 4, 5, 6, 7, 1]
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
        int[] result = leftrotate(nums, n);
        System.out.println("Rotated array is: " + Arrays.toString(result));
        input.close();
    }
}