
import java.util.*;

public class Check_sorted {

    public static boolean checksortedarray(int[] nums, int n){
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
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

        boolean result = checksortedarray(nums, n);

        System.out.println("Result of the array: " + Arrays.toString(nums) + " is: " + result);
        input.close();
    }
}