package alwyn;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give the string of the number: ");
        int n = input.nextInt();
        int a = n;
        while(n != 0){
            int b = n%10;
            n = n/10;
            System.out.print(b + "");
        }
        System.out.println(" is reverse number of "+ a);
    }
}
