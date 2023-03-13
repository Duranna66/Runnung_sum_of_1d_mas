import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] mas = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(runningSum(mas)));
    }

    public static int[] runningSum(int[] nums) {
        int sumk = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            sumk += nums[i];
            nums[i] = sumk;
        }
        return nums;
    }
}