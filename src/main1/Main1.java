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
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek
        Lingkaran luaslingkaran = new Lingkaran();
        Persegi luaspersegi = new Persegi();
        System.out.println("<<    Mari Menghitung Luas    >>");
        System.out.println("");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        
        Scanner input = new Scanner(System.in); //membuat Scanner
        //menerima inputan pilihan user
        System.out.print("Masukkan pilihan Anda : ");
        int pilihan = input.nextInt();
        System.out.println("");
        
        //percabangan
        switch(pilihan){
            case 1 : //jika user memasukkan angka 1 maka program ini yang akan dijalankan
                luaslingkaran.hitung1(); //memanggil method
                break;
            case 2 :
                luaspersegi.hitung2(); //memanggil method
                break;
            default : //jika angka yang dimasukkan user bukan angka 1 / 2 maka akan muncul kata dibawah ini
                System.out.println("Angka yang anda masukkan salah. Masukkan angka 1/2");
        }
    }
    
}
