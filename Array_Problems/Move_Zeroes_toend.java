import java.util.*;

public class Move_Zeroes_toend {

    public static int[] movezeroes(int[] nums, int n){

        int[] arr = new int[n];
        int j = 0;

        for(int i = 0; i < n; i ++){ // O(n)
            if(nums[i] != 0){
                arr[j ++] = nums[i];
            }
        }
        for(int i = 0; i < n; i++){ // O(n)
            nums[i] = arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < n; i ++){
            nums[i] = input.nextInt();
        }
        System.out.println("Array before moving zeroes to the end was: " + Arrays.toString(nums));

        int[] result_arr = movezeroes(nums, n);
        System.out.println("Array after moving zeroes to the end is: " + Arrays.toString(result_arr));

        input.close();
    }
}