import java.util.*;

public class Max_ones {

    public static int maxones(int[] nums, int n){
        int cnt = 0;
        int maxcnt = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                cnt ++;
            }
            else{
                cnt = 0;
            }
            maxcnt = Math.max(cnt, maxcnt);
        }
        return maxcnt;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");

        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the binary elements of the array: ");
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }

        int result = maxones(nums, n);

        System.out.println("Maximum consecutive ones in the given binary array: " + Arrays.toString(nums) + " is: " + result);
        input.close();
    }
}