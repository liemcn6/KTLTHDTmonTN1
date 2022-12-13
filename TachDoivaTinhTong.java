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
public class TachDoivaTinhTong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (s.length()!= 1) {            
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2);
            BigInteger b1 = new BigInteger(s1);
            BigInteger b2 = new BigInteger(s2);
            s=b1.add(b2)+"";
            System.out.println(s);
        }
    }
}
