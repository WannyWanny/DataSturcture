package Chap03;
import java.util.*;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("요솟수: ");
        int num =sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.printf("x[0]: ");
        x[0] = sc.nextInt();

        for(int i=1; i<num; i++){
            do {
                System.out.printf("x["+i+"]: ");
                x[i] = sc.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.printf("검색할 값: ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(x, key);

        if(idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(key+"는 x["+idx+"] 에 있습니다.");
    }
}
