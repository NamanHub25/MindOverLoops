package Binary_Search_programs;

import java.util.*;

class Lower_bound {

    public static int lowerbound(int[] nums, int n, int target){
        int start = 0, end = nums.length - 1; int ans = 0;

        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] >= target){
                ans = mid;
                end = mid - 1; // Just because we want the smallest index so we'll move the end pointer before mid in order to find out the smallest index 
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
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
        System.out.println("Enter the targeted value: ");
        int target = input.nextInt();

        int result = lowerbound(nums, n, target);
        System.out.println("Lower bound in the array: " + Arrays.toString(nums) + " is: " + result);
        input.close();
    }
}