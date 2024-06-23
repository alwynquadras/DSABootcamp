import java.util.Arrays;

public class VariableLengthArgments {
    public static void main(String[] args) {
        fun(10,20,"Alwyn","Roshan");
    }
    static void fun(int a, int b, String ...c){
        System.out.println(" " + a + " " + b + " " + Arrays.toString(c));
    }
}
