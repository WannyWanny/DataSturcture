package Chap01;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner stdInt = new Scanner(System.in);

        System.out.printf("n의 값을 입력하시오:");
        int n = stdInt.nextInt();
        int med = n / 2;
        int sum = 0;
        if(n%2 ==0)         //짝수
            sum = (1 + n) * med;
        else if(n % 2 ==1)      //홀수
            sum = ((1+n)*med)+(n/2+1);
        else
            sum=1;

        System.out.println("값은 " + sum + " 입니다.");

    }
}
