/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ThuGonDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while (t-- > 0) {
            list.add(sc.nextInt());
        }
        boolean ch=true;
        while(ch){
            ch=false;
            for(int i=0;i<list.size()-1;i++){
            if((list.get(i)+list.get(i+1))%2 ==0){
                list.remove(i);
                list.remove(i);
                ch=true;
            }
        }
        }
        
        System.out.println(list.size());
    }

}
