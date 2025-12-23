import java.util.*;

public class Missing_element {

    public static int missingele(int[] nums, int n) {

        int total_sum = n * (n + 1) / 2;
        int array_sum = 0;

        for (int num : nums) {
            array_sum += num;
        }

        return total_sum - array_sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        // array size is n-1
        int[] nums = new int[n - 1];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n - 1; i++) {
            nums[i] = input.nextInt();
        }

        int result = missingele(nums, n);

        System.out.println("Missing element in the array: " + Arrays.toString(nums) + " is: " + result);
        input.close();
    }
}
