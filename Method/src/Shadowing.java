public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x); //This is shadowing the upper level 'x' value
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
