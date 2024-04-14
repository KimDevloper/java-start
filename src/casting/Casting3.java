package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L; // 최고값에 +1함
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue: " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver: " + intValue); //오버플로우 발생
    }
}
