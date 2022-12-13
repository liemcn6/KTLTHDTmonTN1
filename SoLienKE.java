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
public class SoLienKE {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = Integer.parseInt(sc.nextLine());
        
         while(t-- > 0){
             boolean check= true;
             String s = sc.nextLine();
             String ss[]= s.split("");
             for(int i=0;i<ss.length-1;i++){
                 int a= Integer.parseInt(ss[i]);
                 int b=Integer.parseInt(ss[i+1]);
                 if(Math.abs(a-b)!=1){
                     check=false;
                     break;
                 }
                 
             }
             if(check) System.out.println("YES");
             else System.out.println("NO");
         }
    }
}
