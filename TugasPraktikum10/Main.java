/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum10;

/**
 *
 * @author Senandung Marimby
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Elektronik dan Makanan
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        // Menentukan harga masing-masing produk
        double hargaElektronik = 6000000; // Rp 6.000.000
        double hargaMakanan = 25000;      // Rp 25.000

        // Menghitung dan menampilkan pajak
        System.out.println("Sistem Pembayaran Toko");
        System.out.println("Harga Elektronik : Rp" + hargaElektronik);
        System.out.println("Pajak Elektronik : Rp" + elektronik.hitungPajak(hargaElektronik));

        System.out.println("\nHarga Makanan    : Rp" + hargaMakanan);
        System.out.println("Pajak Makanan    : Rp" + makanan.hitungPajak(hargaMakanan));
    }
}

