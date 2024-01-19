package cond;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 1;
        int coupon = switch (grade) {
            case 1 -> 1000; // 자바 14 이후에 바뀐 switch문
            case 2 -> 2000; // 바로 대입되서 전보다 간단하게 작성가능
            case 3 -> 3000; // 대신 마지막 중괄호 후에 ;로 끝내줘야함.
            default -> 500; // 선택된 값은 반환 가능.
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
