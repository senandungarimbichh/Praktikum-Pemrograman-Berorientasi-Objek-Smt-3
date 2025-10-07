/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_senandung_marimby_zahira_malika;

/**
 *
 * @author Senandung Marimby
 */
public class Main {
    public static void main(String[] args) {

        // === 1. Output Produk ===
        Produk produk1 = new Elektronik("Laptop", 15000000, 2); // buat objek elektronik
        produk1.tampilkanInfo(); // tampilkan hasilnya

        System.out.println(); // baris kosong

        // === 2. Output Pegawai ===
        Pegawai pegawai1 = new PegawaiTetap("Senandung", 5000000, 1000000); // nama bisa disesuaikan
        pegawai1.tampilkanInfo();

        System.out.println(); // baris kosong

        // === 3. Output Polimorfisme ===
        Produk produkPoli = new Makanan("Snack", 15000, "2023-12-30"); // referensi induk ke objek turunan
        Pegawai pegawaiPoli = new PegawaiKontrak("Andi", 3000000, 12);

        produkPoli.tampilkanInfo(); // tampilkan versi Makanan
        System.out.println();
        pegawaiPoli.tampilkanInfo(); // tampilkan versi PegawaiKontrak
    }
}