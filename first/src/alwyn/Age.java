package alwyn;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name : ");
        String name = input.nextLine();
        System.out.print("What is your Age : ");
        int age = input.nextInt();
        System.out.println("Age of " + name + " is " + age);
    }
}
