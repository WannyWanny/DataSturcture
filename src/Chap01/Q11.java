package Chap01;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("정수를 입력하세요:");
            num = sc.nextInt();
        }while(num <=0);

        int ans= 0;
        while(num > 0){
            num /= 10;
            ans++;
        }
        System.out.println("그 수는 "+ans+"자리 입니다.");
    }
}
