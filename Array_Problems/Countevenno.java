import java.util.*;

public class Countevenno {

    public static int counteven(int[] nums, int n){
        int cnt_no = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];   // Make a copy so original array isn't changed
            int cnt = 0;

            if (num == 0) {
                cnt = 1;      
            } else {
                while (num > 0) {
                    cnt++;
                    num /= 10;
                }
            }

            if (cnt % 2 == 0) {
                cnt_no++;
            }
        }

        return cnt_no;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        int result = counteven(nums, n);
        System.out.println("Number of elements with even number of digits in the array "
                + Arrays.toString(nums) + " is: " + result);

        input.close();
    }
}
