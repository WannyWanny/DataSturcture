package Chap01;
import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner stdInt = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값: ");
        int n = stdInt.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n){
            sum+=i;
            i++;
        }
        System.out.println("1부터 "+n +"까지의 합은"+ sum+" 입니다.");

    }
}
