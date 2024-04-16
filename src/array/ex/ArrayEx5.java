package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 받을 숫자를 입력하세요.");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int minnumber, maxnumber;

        System.out.println(n + "개의 정수를 입력하세요");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        minnumber = maxnumber = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < minnumber) {
                minnumber = arr[i];
            }
            if (arr[i] > maxnumber) {
                maxnumber = arr[i];
            }
        }

        System.out.println("가장 적은 정수 " + minnumber);
        System.out.println("가장 큰 정수 " + maxnumber);

    }
}
