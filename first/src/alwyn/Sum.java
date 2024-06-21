package alwyn;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : " );
        int int1 = input.nextInt();
        System.out.print("Enter the second number : " );
        int int2 = input.nextInt();

        int sum = int1 + int2;
        System.out.println("The sum is : " + sum);
    }
}
