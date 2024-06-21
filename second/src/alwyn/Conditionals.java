package alwyn;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.print("Please enter the salary: ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if(salary >= 10000){
            System.out.println("the total salary is: " + (salary+2000));
        }
        else{
            System.out.println("the total salary is:" + (salary+1000));
        }

    }
}
