import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String b = mssg();
        System.out.println(b);
    }
    static String mssg(){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        return a;
    }
}
