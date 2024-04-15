package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.print(number);
        }
        System.out.println( );
        // 향상된 for문, for-each문
        for(int number : numbers) {
            System.out.print(number);
        }
        //for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for(int i = 0 ; i < numbers.length ; i++) {
            System.out.print(numbers[i]);
        }
    }
}
