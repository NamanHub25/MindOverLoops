package Binary_Search_programs;

import java.util.*;

public class Upper_bound {
    public static int upperbound(int[] nums, int n, int target){
        int start = 0, end = nums.length - 1; int ans = 0;

        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] > target){
                ans = mid;
                end = mid - 1; 
            }
            else{
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
        int result = upperbound(nums, n, n);
        System.out.println("Upper bound in the array: " + Arrays.toString(nums) + " is: " + result);
        input.close();
    }
}
