import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Alwyn");
                break;
            case 2:
                System.out.println("Sahil");
                break;
            case 3:
                switch (department){
                    case "Computer":
                        System.out.println("Rabil");
                        break;

                    case "Activities":
                        System.out.println("Aveen");
                        break;

                    default:
                        System.out.println("Enter valid department !");
                }
                break;
        }
    }
}
