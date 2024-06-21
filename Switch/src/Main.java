import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select fruit (Mango, Apple, Banana): ");
        String fruit = in.next();
        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;

            case "Apple":
                System.out.println("Big round fruit");
                break;

            case "Banana":
                System.out.println("Weird fruit");
                break;

            default:
                System.out.println("Select a valid fruit !");
        }
    }
}
