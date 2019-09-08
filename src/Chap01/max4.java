package Chap01;
import java.util.Scanner;

public class max4 {
     static int max4(int a, int b, int c, int d){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        return max;
    }
    public static void main(String[] args) {
        Scanner stdInt = new Scanner(System.in);

        System.out.println("최댓값을 입력하시오: ");
        System.out.printf("a의 값: "); int a = stdInt.nextInt();
        System.out.printf("b의 값: "); int b = stdInt.nextInt();
        System.out.printf("c의 값: "); int c = stdInt.nextInt();
        System.out.printf("d의 값: "); int d = stdInt.nextInt();

        System.out.println("최댓값은 " + max4(a, b, c, d) + "입니다.");
    }
}
