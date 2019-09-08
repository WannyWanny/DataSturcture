package Chap03;
import java.util.*;

public class SeqSearch {
    static int seqSearch(int[] a, int n, int key){
        int i=0;

        while(true){
            if(i == n)
                return -1;      //검색 실패
            if(a[i] == key)
                return i;       //검색 성공
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i=0; i<num; i++){
            System.out.printf("x[" + i +"]: ");
            x[i] = sc.nextInt();
        }

        System.out.printf("검색할 값: ");
        int ky = sc.nextInt();

        int idx = seqSearch(x, num, ky);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"는 x["+ idx +"]에 있습니다.");
    }
}
