import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String b = in.nextLine();
        String personalised = myGreet(b);
        System.out.println(personalised);
    }
    static String myGreet(String c){
        String a = "Hello " + c;
        return a;
    }
}
