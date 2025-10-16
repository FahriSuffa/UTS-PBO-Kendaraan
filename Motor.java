/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbo;

/**
 *
 * @author Administrator
 */
public class Motor extends Kendaraan {
    private boolean memilikiBox;
    
    public Motor(String nomorPlat, String merk, int tahunProduksi, 
                 boolean memilikiBox) {
        super(nomorPlat, merk, tahunProduksi); 
    }
    

    public boolean isMemilikiBox() {
        return memilikiBox;
    }
    
    public void setMemilikiBox(boolean memilikiBox) {
        this.memilikiBox = memilikiBox;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI MOTOR ===");
        super.tampilkanInfo();
        String statusBox = memilikiBox ? "Ya" : "Tidak";
        System.out.println("Memiliki Box Belakang: " + statusBox);
        System.out.println("------------------------");
    }
}
