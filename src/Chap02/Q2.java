package Chap02;
import java.util.*;

public class Q2 {
    static void swap(int[] a, int n1, int n2){
        int t = a[n1];
        a[n1] = a[n2];
        a[n2] = t;
    }

    static void reverse(int []a){
        print(a);
        for(int i=0; i<a.length / 2; i++) {
            System.out.println("a["+i+"]과(와) a["+(a.length-i-1)+"]를 교환합니다.");
            swap(a, i, a.length - i - 1);
            print(a);
        }
    }

    static void print(int []a){
        for(int i=0; i<a.length; i++)
            System.out.printf(a[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 10, 73, 2, -5, 42};
        reverse(arr);

        System.out.println("역순 정렬을 마쳤습니다.");

    }
}
