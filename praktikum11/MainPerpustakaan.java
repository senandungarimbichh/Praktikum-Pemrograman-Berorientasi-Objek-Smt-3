/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Senandung Marimby
 */
public class MainPerpustakaan {
    public static void main(String[] args) {

        // Membuat pengarang
        Pengarang p1 = new Pengarang("Wisnu Tirta");
        Pengarang p2 = new Pengarang("Nuby Zahira");
        Pengarang p3 = new Pengarang("Senandung Marimby");
        Pengarang p4 = new Pengarang("Nunu Wicaksana");

        // Membuat buku dengan agregasi ke pengarang
        Buku b1 = new Buku("Laut Bercerita", p1);
        Buku b2 = new Buku("Cantik Itu Luka", p2);
        Buku b3 = new Buku("Gadis Pantai", p3);
        Buku b4 = new Buku("Bumi Manusia", p4);

        // Membuat perpustakaan dengan kapasitas 3
        Perpustakaan perpustakaan = new Perpustakaan(3);

        // Menambahkan buku ke perpustakaan (komposisi)
        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3);
        perpustakaan.tambahBuku(b4);

        // Menampilkan info semua buku
        perpustakaan.infoPerpustakaan();
    }
}