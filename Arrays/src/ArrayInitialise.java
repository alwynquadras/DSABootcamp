import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitialise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));
    }
}
