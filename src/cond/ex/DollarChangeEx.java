package cond.ex;

public class DollarChangeEx {
    public static void main(String[] args) {
        int dollar = 5;
        int sum = dollar * 1300;
        if(dollar == 0) {
            System.out.println("환전된 금액이 없습니다.");
        } else if (dollar > 0) {
            System.out.println("횐전된 금액은 " + sum + "입니다.");
        } else {
            System.out.println("잘못된 금액입니다.");
        }
    }
}
