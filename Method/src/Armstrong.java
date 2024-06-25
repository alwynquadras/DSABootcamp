import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Print all 3 digits armstrong number: ");
        for(int i =100; i < 1000; i++){
            ArmStrong(i);
        }
    }
    static void ArmStrong(int b){
      int sum = 0;
      int original = b;
      while (b > 0) {
        int c = b % 10;
        int cube = c * c * c;
        sum = sum + cube;
        b = b / 10;
      }
      if(sum == original){
          System.out.print(original + " ");
      }
    }
}
