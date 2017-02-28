package javaapplication2;

import java.util.*;

public class JavaApplication2 {

    public static void main(String[] args) {
        int a;
        int b;
        int[] n1 = new int[33];
        int[] n2 = new int[33];
        int[] gcd = new int[33];
        Scanner input = new Scanner(System.in);
        System.out.print("A= ");
        a = input.nextInt();
        System.out.print("B= ");
        b = input.nextInt();
        int i1 = 0;
        int i2 = 0;
        int i = 0;
       // sssssss;
       System.out.println("Hello");
       System.out.println("A= " + a);
       System.out.println("B= " + b);
       n1=getPrimes(a);
       n2=getPrimes(b);
        while (n1[i1] != 0 && n2[i2] != 0) {
            if (n1[i1] == n2[i2]) {
                gcd[i] = n1[i1];
                i++;
                i1++;
                i2++;
            } else if (n1[i1] < n2[i2]) {
                i1++;
            } else {
                i2++;
            }
        }
        int m = 0;
        while (gcd[m] != 0) {
            System.out.println(gcd[m]);
            m++;
        }
        int l = 0;
        int gcdNum = 1;
        while (gcd[l] != 0) {
            gcdNum *= gcd[l];
            l++;
        }
        System.out.println("gcdNum: " + gcdNum);
    }

    public static int[] getPrimes(int k) {
        int[] res = new int[33];
        int j = 0;

        for (int i = 2; i <= k;) {
            if (k % i == 0) {
                k /= i;
                res[j] = i;
                j++;
            } else {
                i++;
            }
        }
        return res;
    }
}
