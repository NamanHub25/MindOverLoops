package Binary_Search_programs;

import java.util.*;

public class Intro {
    
    public static int binarysearch(int[] nums, int n, int x){
        int start = 0, end = nums.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == x){
                return mid;
            }
            else if(nums[mid] > x){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
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
        System.out.println("Enter the target to be searched: ");
        int x = input.nextInt();

        int result = binarysearch(nums, n, x);
        if (result == -1){
            System.out.println("Target not found !");
        } 
        else{
            System.out.println("Target found !");
        }
        input.close();
    }
}

