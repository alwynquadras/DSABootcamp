package alwyn;

import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {
        System.out.print("Give the first number: ");
        Scanner input =new Scanner(System.in);
        int a = input.nextInt();

        System.out.print("Give the second number: ");
        int b = input.nextInt();

        System.out.print("Give the third number: ");
        int c = input.nextInt();

        int max = a;
        if(max < b) {
            max = b;
        }
        if(max < c){
            max = c;
        }
            System.out.println("The greatest integer is: " + max);
    }
}
