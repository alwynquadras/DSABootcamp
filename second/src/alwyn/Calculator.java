package alwyn;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.print("Enter the operation: ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/')
            {
                if(op == '+'){
                    System.out.print("Enter two numbers: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    ans = num1 + num2;
                }
                if(op == '-'){
                    System.out.print("Enter two numbers: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    ans = num1 - num2;
                }
                if(op == '*'){
                    System.out.print("Enter two numbers: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    ans = num1 * num2;
                }
                if(op == '/'){
                    System.out.print("Enter two numbers: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    ans = num1 / num2;
                }
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operator");
            }
            System.out.println("The answer is: "+ans);
        }
    }
}
