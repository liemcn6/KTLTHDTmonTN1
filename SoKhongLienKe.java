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
public class SoKhongLienKe {
    static boolean chia10(int a){
        if(a % 10 ==0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {            
            String s = sc.nextLine();
            int tong=0;
            boolean check= true;
            for(int i=0;i<s.length();i++){
                tong+=Integer.parseInt(s.charAt(i)+"");
            }
            for(int i=0;i<s.length()-1;i++){
                int a = Integer.parseInt(s.charAt(i)+"");
                int b= Integer.parseInt(s.charAt(i+1)+"");
                if(Math.abs(a-b)!= 2)check=false;
            }
            if(check && chia10(tong)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
