package Chap02;
import java.util.*;

public class ArrayEqual {
    static boolean equals(int[] a, int[] b){
        if(a.length != b.length)
            return false;

        for(int i=0; i<a.length; i++)
            if(a[i] != b[i])
                return false;
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }
}
