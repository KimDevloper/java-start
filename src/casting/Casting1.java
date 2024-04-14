package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("long value is " + longValue);

        doubleValue = intValue;
        System.out.println("double value is " + doubleValue);

        doubleValue = 20L; // long형을 변환
        System.out.println("double value is " + doubleValue);
    }
}
