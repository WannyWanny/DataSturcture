package Chap01;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner stdInt = new Scanner(System.in);
        int a, b;

        System.out.printf("a의 값:");
        a = stdInt.nextInt();
        do {
            System.out.printf("b의 값:");
            b = stdInt.nextInt();
            if(b-a <=0)
                System.out.println("a보다 큰 값을 입력하세요.");
        }while(b-a <= 0);
            System.out.println("b - a는 "+(b-a)+"입니다.");
    }
}
