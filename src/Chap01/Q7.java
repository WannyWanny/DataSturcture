package Chap01;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner stdInt = new Scanner(System.in);

        System.out.print("n의 값을 입력하시오: ");
        int n = stdInt.nextInt();

        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
            System.out.printf("'" + i+"'");
            if(i < n) System.out.printf(" + ");
            else if(i == n) System.out.print(" = ");
        }
        System.out.println(sum);
    }
}
