/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.karyawanrequitment;

import java.util.Scanner;

/**
 *
 * @author Bintang Satria Mulya
 */
public class KaryawanRequitment {

    public static void main(String[] args) {
        Scanner loli = new Scanner (System.in);
        
        int akademik,keterampilan,psikologi,nilai,rata = 0;
        String nama;
        
        System.out.println(">>>--Selamat Datang Di Requitment PT Icikiwir--<<<");
        System.out.println();
       
        System.out.println("Data Diri Calon Karyawan ");
        
        System.out.print("Masukan Nama Anda : ");
        nama=loli.nextLine();
        System.out.print("Masukan Umur Anda : ");
        int umur =loli.nextInt();
        
        System.out.println();
        
        System.out.println("Nama Anda : "+nama+"\nUmur Anda : "+umur);
        
        System.out.println();
        
        System.out.print("Masukan Nilai Akademik :");
        akademik=loli.nextInt();
        System.out.print("Masukan Nilai Keterampilan :");
        keterampilan=loli.nextInt();
        System.out.print("Masukan Nilai Psikologi :");
        psikologi=loli.nextInt();
        
      
        
        System.out.println("Nilai Anda Adalah : ");
        System.out.println("1.Nilai Akademik : "+akademik+" \n2.Nilai Keterampilan : "+keterampilan+" \n3.Nilai Psikologi : "+psikologi);
        System.out.println();
        
        rata=(akademik+keterampilan+psikologi)/3;
        System.out.println("Rata Rata Anda : "+rata);
        System.out.println();
         if (rata >=75) {
             
             if (akademik >keterampilan && akademik >psikologi) {
                 System.out.println("Anda diterima di Adminitrasi");
             }else if (keterampilan >akademik && keterampilan >psikologi) {
                 System.out.println("Anda diterima di Produksi ");
             }else if (psikologi >akademik && psikologi >keterampilan) {
                 System.out.println("Anda diterims di Pemasaran");
             }
             else if (akademik==keterampilan && akademik==psikologi) {
                 System.out.println("Silahkan Pilih Jabataan : \n1.Adminitrasi \n2.Produksi \n3.Pemasaran");
             }
             System.out.println();
             System.out.println("Selamat Anda diterima bekerja \n Teruslah berusaha agar mengapai mimpi");
             System.out.println();
        }
         else{
             System.out.println("Anda Belum Lolos \nJangan Berkecil Hati \nTeruslah Berusaha");
         }
         
    }
}

