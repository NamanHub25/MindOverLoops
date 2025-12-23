import java.util.*;

public class Left_rotate_byD {

    public static int[] rotateDplaces(int[] nums, int n, int k){
        int[] arr = new int[n];
        int j = 0;

        for(int i = n-k; i < n; i++){
            arr[j++] = nums[i];
        }
        for(int i = 0; i <= k; i++){
            arr[j++] = nums[i];
        }
        return arr;
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

        System.out.print("Enter the number of steps, array should be rotated: ");
        int k = input.nextInt();

        int[] result_arr = rotateDplaces(nums, n, k);
        System.out.println("Array after rotation is: " + Arrays.toString(result_arr));
        input.close();
    }
}