package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산 1
        int sum1 = add(5, 10);
        System.out.println("결과 출력 "  + sum1);

        // 계산 2
        int sum2 = add(15, 20);
        System.out.println("결과 출력 " + sum2);
    }
    
    // add 메서드 
    public static int add(int a, int b) { // 메서드 선언 부분 (메서드 , 정적 메서드. 변환 타입, 메서드 이름
        System.out.println(a + " + " + b + " = " + "연산 수행");
        int sum = a + b;
        return sum;
    }
    // 제어자 반환타입 메서드 이름(매게변수 목록) {
    // 메서드 본문 }
}
