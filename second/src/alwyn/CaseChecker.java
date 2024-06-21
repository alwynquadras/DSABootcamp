package alwyn;

import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char ch = inp.next().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("UpperCase");
        }
    }
}
