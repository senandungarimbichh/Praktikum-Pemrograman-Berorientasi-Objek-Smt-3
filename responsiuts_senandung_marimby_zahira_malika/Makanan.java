/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_senandung_marimby_zahira_malika;

/**
 *
 * @author Senandung Marimby
 */
class Makanan extends Produk {
    private String tanggalKadaluarsa; // atribut tambahan untuk makanan

    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan nama dan harga dari induk
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}