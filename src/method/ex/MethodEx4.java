package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bank = 10000;
        System.out.println("-----------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("-----------------------------------");
        while (true) {
            System.out.print("선택 :" );
            int s = sc.nextInt();
            if (s == 1) {
                System.out.print("입금액을 선택하세요 : ");
                int deposit = sc.nextInt();
                bank = deposit(bank, deposit);
            }
            if (s == 2) {
                System.out.print("출금액을 선택하세요 : ");
                int withdraw = sc.nextInt();
                bank = withdraw(bank, withdraw);
            }
            if (s == 3) {
                System.out.println("최종 잔액: " + bank + "원");
            }
            if (s == 4) {
                System.out.print("프로그램을 종료합니다.");
                break;
            }
        }
    }
    public static int deposit(int bank, int deposit) {
        bank = bank + deposit;
        System.out.print(deposit + "원을 입금하였습니다. 현재 잔액" + bank + "원");
        return bank;
    }

    public static int withdraw(int bank, int withdraw) {
        if (bank > withdraw) {
            bank = bank - withdraw;
            System.out.print(withdraw + "원을 춞금하였습니다. 현재 잔액" + bank + "원");
        }
        else {
            System.out.print(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return bank;
    }
}
