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
public class TinhLuyThua {
    static BigInteger e = new BigInteger("1000000007");
    static BigInteger c = new BigInteger("0");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        while(true){
            
            BigInteger aa = new BigInteger(sc.next());
            BigInteger bb = new BigInteger(sc.next());
            
           
            if(aa.equals(c) && bb.equals(c)) break;
           System.out.println(aa.modPow(bb, e));
        }
           }
}
