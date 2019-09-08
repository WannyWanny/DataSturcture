package Chap01;
import java.util.Scanner;

public class min4 {
    static int min4(int a, int b, int c,int d){
        int min = a;
        if(b < min) b = min;
        if(c < min) c = min;
        if(d < min) d = min;

        return min;
    }

    public static void main(String[] args) {
        Scanner stdInt = new Scanner(System.in);

        System.out.println("최솟값을 구합니다.");
        System.out.printf("a의 값: "); int a = stdInt.nextInt();
        System.out.printf("b의 값: "); int b = stdInt.nextInt();
        System.out.printf("c의 값: "); int c = stdInt.nextInt();
        System.out.printf("d의 값: "); int d = stdInt.nextInt();

        System.out.println("최솟값은 "+min4(a, b, c, d)+"입니다.");
    }

}
