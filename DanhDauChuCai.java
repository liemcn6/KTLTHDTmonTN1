/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        TreeSet l = new TreeSet();
        for(int i=0;i<s.length();i++){
            l.add(s.charAt(i));
        }
        System.out.println(l.size());
    }
}
