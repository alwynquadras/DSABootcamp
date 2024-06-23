import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] a = {30,20};
        swap(a);
        System.out.println(Arrays.toString(a));
    }

    static int[] swap(int[] nums) {
        nums[0] = 20;
        nums[1] = 30;
        return nums;
    }
}
