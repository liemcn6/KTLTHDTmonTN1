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
public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        BigInteger b[]= new BigInteger[101];
        while(t-- >0){
            boolean kt=true;
            int n =  sc.nextInt();
            for(int i=0;i<n;i++){
                b[i]=new BigInteger(sc.next());
            }
            for(int i=0;i<n/2;i++){
                if(b[i].equals(b[n-i-1])){
                    kt=true;
                }else{
                    kt=false;
                    break;
                }
            }
            if(!kt)
                System.out.println("NO");
            else System.out.println("YES");
        }
        
    }
}
