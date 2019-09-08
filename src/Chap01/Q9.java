package Chap01;
import java.util.Scanner;

public class Q9 {
    static int sumof(int a, int b){
        int sum = 0;
        if(a < b)
            for(;a<=b;a++)
                sum+=a;
            else if(a > b)
                for(;b<=a;b++)
                    sum+=b;
                else
                    sum = a;

        return sum;
    }
    public static void main(String[] args) {
        Scanner stdA = new Scanner(System.in);
        Scanner stdB = new Scanner(System.in);

        System.out.print("A와 B를 입력하세요");
        int a = stdA.nextInt();
        int b = stdB.nextInt();

        System.out.println("결과값은: "+sumof(a, b)+"입니다.");
    }
}
