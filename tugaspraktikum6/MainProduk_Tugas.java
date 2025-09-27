/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author Senandung Marimby
 */
public class MainProduk_Tugas {
    public static void main(String[] args) {
        KeranjangBelanja_Tugas keranjang = new KeranjangBelanja_Tugas();

        keranjang.tambahProduk(new Buku_Tugas("Java Programming", 200000));
        keranjang.tambahProduk(new Elektronik_Tugas("Laptop", 2500000));
        keranjang.tambahProduk(new Pakaian_Tugas("Cardigan", 50000));

        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotal());
    }
}