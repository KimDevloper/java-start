package Operater;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); //false, a와 b는 같지 않다.
        System.out.println(a != b); //true, a와 b는 다르다.
        System.out.println(a > b); //false, b가 더 크다.
        System.out.println(a < b); //true, a가 작다.
        System.out.println(a >= b);//false b가 더 크다.
        System.out.println(a <= b); //true  a가 b보다 작거나 같다.

        boolean result = a==b ;
        System.out.println(result);
    }
}
