package Chap02;
import java.util.*;

public class Q3 {
    static int sumOf(int[] a){
        int sum =0;
        for(int i=0; i<a.length; i++)
            sum += a[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("요솟수:");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("배열의 값을 입력하세요.");
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("배열의 합은 "+sumOf(arr)+"입니다.");
    }
}
