package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCounts = 0;

        while (true) {
            System.out.print("1. 상품등록 | 2. 상품목록 | 3.종료 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                if (productCounts >= maxProducts) {
                    System.out.println("더 이상 상품을 등록이 불가능합니다.");
                    continue;
                }

                System.out.println("상품명을 말해주세요 : ");
                productNames[productCounts] = sc.nextLine();

                System.out.println("상품 가격을 입력하세요:");
                productPrices[productCounts] = sc.nextInt();
                productCounts++;
            }
            else if (choice == 2) {
                if(productCounts == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCounts; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                }

            }
            else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("다시 입력해주세요");
            }
        }
    }
}
