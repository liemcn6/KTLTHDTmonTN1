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
public class RutgonXauKitu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) list.add(s.charAt(i));
        boolean check= true;
        while(check){
            check=false;
            for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                list.remove(i);
                list.remove(i);
                check=true;
            }
        }
        }
        if(list.size()==0){
            System.out.print("Empty String");
        }else{
            for(Character x : list){
            System.out.print(x);
        }
        }
        System.out.println();
        
    }
}
