package Chap01;

import java.util.Scanner;

public class Triangle_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형 출력을 원합니까? ");
            n = sc.nextInt();
        }while(n <=0);

        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.printf("*");
            System.out.println();
        }
    }
}
