/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;
import java.util.Scanner;
/**
 *
 * @author Yuliana
 */
public class Persegi {
    //membuat scanner
    Scanner input = new Scanner(System.in);
    //variabel
    Double luas, s;
    
    //method hitung luas persegi
    void hitung2(){
        System.out.println("<<<      MENGHITUNG LUAS PERSEGI       >>>");
        System.out.println("==========================================");
        //user memasukkan sisi
        System.out.print("Masukkan Sisi   : ");
        s = input.nextDouble();
        //rumus luas persegi
        luas = s * s;
        System.out.println("Luas Persegi    : "+luas);
    }
}
