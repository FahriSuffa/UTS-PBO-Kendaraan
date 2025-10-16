/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;

/**
 *
 * @author Administrator
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;
    
    // Konstruktor
    public Mobil(String nomorPlat, String merk, int tahunProduksi, 
                 int jumlahPintu, String jenisBahanBakar) {
        super(nomorPlat, merk, tahunProduksi); // Memanggil konstruktor induk
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }
    
    // Getter dan Setter
    public int getJumlahPintu() {
        return jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    
    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }
    
    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }
    
    // Override method tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI MOBIL ===");
        super.tampilkanInfo(); // Memanggil method dari kelas induk
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
        System.out.println("------------------------");
    }
}
