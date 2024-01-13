package Operater;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = ++a; // 전위 증감
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감
        a = 1;
        b = 0 ;
        b = a++;
        System.out.println("a = " + a + ", b = " + b);
    }
}
