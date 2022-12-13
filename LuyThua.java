/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class LuyThua {
    //static long e = 1000000007;
    static BigInteger e = new BigInteger("1000000007");
    //static int n, k;

//    static long solve(int n, int k) {
//        if (k == 0) return 1;
//        long x = solve(n, k / 2) % e;
//        if (k % 2 == 0) return (x % e * x % e) % e;
//        return (n % e * x % e * x % e) % e;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            //n = sc.nextInt();
            //k = sc.nextInt();
            BigInteger aa = new BigInteger(sc.next());
            BigInteger bb = new BigInteger(sc.next());
            
           
           
           System.out.println(aa.modPow(bb, e));
           // System.out.println(solve(n, k));
        }
    }
}
