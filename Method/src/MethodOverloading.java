public class MethodOverloading {
    public static void main(String[] args) {
        fun(3,4);
       // fun("Roshan","Alwyn");
    }
    static void fun(int a, int b){
        System.out.println(a +" " + b);
    }
    static void fun(String a, String b){
        System.out.println(a + " " + b);
    }
}
