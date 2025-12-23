import java.util.*;

public class Linear_search {

    public static int linearsearch(int[] nums, int n, int x){

        for(int i = 0; i < n; i++){
            if(nums[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");

        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }
        System.out.println("Enter the target to be found: ");
        int x = input.nextInt();

       int result = linearsearch(nums, n, x);

       System.out.println("Index for the element " + x + " is: " + result);
        input.close();
    }
}