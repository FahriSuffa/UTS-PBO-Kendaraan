/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.utspbo;

/**
 *
 * @author Administrator
 */
public class MainKendaraan {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("B 1234 ABC", "Toyota", 2020, 4, "Bensin");
        
        // Membuat objek Motor
        Motor motor1 = new Motor("B 5678 XYZ", "Honda", 2022, true);
        
        // Menampilkan informasi kendaraan
        System.out.println("DATA KENDARAAN PERUSAHAAN TRANSPORTASI");
        System.out.println("======================================");
        
        mobil1.tampilkanInfo();
        motor1.tampilkanInfo();
        
        // Demonstrasi tambahan dengan array
        System.out.println("\n=== MENGGUNAKAN ARRAY ===");
        Kendaraan[] daftarKendaraan = new Kendaraan[2];
        daftarKendaraan[0] = mobil1;
        daftarKendaraan[1] = motor1;
        
        for (Kendaraan kendaraan : daftarKendaraan) {
            kendaraan.tampilkanInfo();
        }
    }
}
