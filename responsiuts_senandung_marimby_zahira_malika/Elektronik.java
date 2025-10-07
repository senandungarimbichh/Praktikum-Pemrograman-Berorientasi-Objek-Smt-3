/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_senandung_marimby_zahira_malika;

/**
 *
 * @author Senandung Marimby
 */
class Elektronik extends Produk {
    private int garansi; // dalam tahun

    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga); // panggil constructor induk
        this.garansi = garansi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // panggil versi dari kelas Produk
        System.out.println("Garansi: " + garansi + " tahun");
    }
}