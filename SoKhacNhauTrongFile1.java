/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SoKhacNhauTrongFile1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader f = new BufferedReader(new FileReader("DATA.in"));
        String l = f.readLine();
        List<Integer> list = new ArrayList<>();
        while (l != null) {
            String[] arr = l.trim().split("\\s");
            for (String x : arr) {
                list.add(Integer.parseInt(x));
            }

            l = f.readLine();
        }
        int a[] = new int[100001];
        for (Integer i : list) {
            a[i]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                System.out.println(i + " " + a[i]);
            }
        }
        f.close();

    }
}
