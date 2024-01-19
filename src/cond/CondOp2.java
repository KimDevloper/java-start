package cond;

public class CondOp2 { // 삼항 연산자
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자"; // 참이 왼쪽 거짓이 오른쪽
        System.out.println("age = " + age + " status = " + status);
    }
}
