import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = in.nextInt();
        ArmStrong(a);
    }
    static void ArmStrong(int b){
      while (b % 10 > 0) {
        int c = b % 10;
        int cube = c * c * c;
        System.out.println(cube);
        b = b / 10;
      }

    }
}
