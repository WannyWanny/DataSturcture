package Chap06;
import java.util.Scanner;

public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n){
        for(int i=0; i<n-1; i++)
            for(int j=n-1; j>i; j--)
                if(a[j - 1] > a[j])
                    swap(a, j-1, j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.printf("요솟수:");
        int nx = sc.nextInt();
        int []x = new int[nx];

        for(int i=0;i<nx; i++){
            System.out.printf("x["+i+"]:");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for(int i=0;i<nx; i++)
            System.out.println("x["+i+"]="+x[i]);
    }

    static void selectionSort(int[] a, int n){
        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=i+1; j<n; j++)
                if(a[j] < a[min])
                    min = j;
                swap(a, i, min);
        }
    }

    static void insertionSort(int[] a, int n){
        for(int i=1; i<n; i++){
            int j;
            int tmp = a[i];
            for(j=i; j>0 && a[j-1] > tmp; j--)
                a[j] = a[j-1];
            a[j] = tmp;
        }
    }
}
