import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int add = sum();
        System.out.println("The total sum is: " + add);

    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }
}
