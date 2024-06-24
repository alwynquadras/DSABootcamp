import java.util.Scanner;

public class PrimeOrNOt {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        isPrime(a);
        if(isPrime(a) == false){
            System.out.println(a + " is a prime number");
        }
        else {
            System.out.println(a + " is not a prime number");
        }
    }
    static boolean isPrime(int n){
        if(n == 2){
            return false;
        }

        for(int i = 2; i <= n; i++){
            if(n % i == 0 && i < n){
                return true;
            }
        }
        return false;
    }

}
