package alwyn;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        System.out.println(num1);

        int num2 = (int)(num1);
        System.out.println(num2);

    }
}
