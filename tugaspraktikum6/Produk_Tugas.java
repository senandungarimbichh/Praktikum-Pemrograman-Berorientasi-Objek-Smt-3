/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author Senandung Marimby
 */
abstract class Produk_Tugas {
    String nama;
    double harga;

    public Produk_Tugas(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public abstract double hitungDiskon();
}
