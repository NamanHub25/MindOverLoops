package Binary_Search_programs;

import java.util.*;

class Koko_banana {

    public static int calculateTotalhours(int[] nums, int speed){
        int totalhours = 0;

        for(int pile: nums){
            totalhours += (int)Math.ceil((double)pile/speed);
        }
        return totalhours;
    }
    public static int minEatingspeed(int[] nums, int n, int h){
        int maxVal = Arrays.stream(nums).max().getAsInt();

        for(int i = 1; i <= maxVal; i++){
            int hours = calculateTotalhours(nums, i);

            if(hours <= h){
                return i;
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");

        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }
        System.out.print("Enter the minimum hours koko needs to finish bananas: ");
        int h = input.nextInt();

        int result = minEatingspeed(nums, n, h);
        System.out.print("Minimum hours in which koko can finish all the bananas is: " + result);
        input.close();
    }
}
