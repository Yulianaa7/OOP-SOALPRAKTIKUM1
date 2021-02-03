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
public class Lingkaran {
    //membuat scanner
    Scanner input = new Scanner(System.in);
    
    //atribut
    Double luas, r;
    
    //method hitung
    void hitung1(){
        //judul
        System.out.println("<<<      MENGHITUNG LUAS LINGKARAN       >>>");
        System.out.println("============================================");
        
        System.out.print("Masukkan jari-jari  : ");
        r = input.nextDouble();
        
        //rumus luas lingkaran
        luas = 22 * r * r / 7;
        System.out.println("Luas Lingkaran      : "+luas);
    }
}
