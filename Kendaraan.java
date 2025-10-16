/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.utspbo;

/**
 *
 * @author Administrator
 */
public class Kendaraan {
    private String nomorPlat;
    private String merk;
    private int tahunProduksi;
    
    // Konstruktor
    public Kendaraan(String nomorPlat, String merk, int tahunProduksi) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }
    
    // Getter dan Setter (enkapsulasi)
    public String getNomorPlat() {
        return nomorPlat;
    }
    
    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    
    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}
