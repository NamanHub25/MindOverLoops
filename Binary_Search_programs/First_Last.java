package Binary_Search_programs;

import java.util.Arrays;
import java.util.Scanner;

public class First_Last {

    public static int[] firstandlast(int[] nums, int n, int target){
        int first = -1, last = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(first == -1){
                    first = i;
                }
                 last = i;
            }
        }
        return new int[]{first,last};
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
        System.out.println("Enter the target to be found: ");
        int target = input.nextInt();

        int[] result = firstandlast(nums, n, target);
        System.out.println("First and last position of the target: " + target + " in the array: " + Arrays.toString(nums) + " is: " + Arrays.toString(result));
        input.close();
    }
}
