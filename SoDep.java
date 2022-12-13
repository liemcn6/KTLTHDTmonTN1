/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoDep {
    static boolean isLe(int a){
        if(a%2==0) return false;
        return true;
    }
    static boolean dx(String x){
        for(int i=0;i<x.length()/2;i++){
            if(x.charAt(i) != x.charAt(x.length()-1-i)){
                 return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {            
            String s = sc.nextLine();
            boolean check=true;
            for(int i=0;i<s.length();i++){
                if(isLe(Integer.parseInt(s.charAt(i)+""))){
                    check=false;
                    break;
                }
            }
            if(!dx(s)) check=false;
            if(check) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
