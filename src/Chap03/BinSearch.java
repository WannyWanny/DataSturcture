package Chap03;
import java.util.*;

public class BinSearch {
    static int binsearch(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;

        do{
            int pc = (pl+pr)/2;
            if(a[pc] == key)
                return pc;
            else if(a[pc] < key)
                pl = pc+1;      //검색범위를 뒤쪽 절반으로 좁힘
            else
                pr = pc-1;      //검색범위를 앞쪽 절반으로 좁힘
        }while(pl<=pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.printf("x[0]: ");
        x[0] = sc.nextInt();

        for(int i=1; i<num; i++){
            do{
                System.out.printf("x["+i+"]: ");
                x[i] = sc.nextInt();
            }while(x[i] < x[i-1]);      //바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.printf("검색할 값:");
        int ky = sc.nextInt();

        int idx = binsearch(x, num, ky);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky +"는 x["+idx+"]에 있습니다.");
    }
}
