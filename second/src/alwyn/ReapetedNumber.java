package alwyn;

import java.util.Scanner;

public class ReapetedNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give the string of the number: ");
        int n = input.nextInt();
        System.out.print("Which number do you want to check: ");
        int a = input.nextInt();
        int count = 0;
        while(n != 0){
            if(a == n%10){
                count ++;
            }
            n = n/10;
        }
        System.out.println(a + " is repeated " + count + " times");
    }
}
