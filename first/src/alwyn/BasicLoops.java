package alwyn;

public class BasicLoops {
    public static void main(String[] args) {
        int a = 10;
        if(a == 10) {
            System.out.println("Hello World ");
            System.out.println();
        }
        else {
            System.out.println("Fuck you!");
        }

        int count = 0;
        while(count != 6) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        for(int num = 0; num <= 5; num++) {
            System.out.print(num + " ");
        }

    }
}
