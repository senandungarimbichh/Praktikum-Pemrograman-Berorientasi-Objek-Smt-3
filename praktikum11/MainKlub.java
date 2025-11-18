/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Senandung Marimby
 */

public class MainKlub {
    public static void main(String[] args) {

        // Membuat objek klub
        Klub klub = new Klub("Klub editor");

        // Membuat anggota (anggota tetap ada meski klub dibubarkan)
        Anggota ag1 = new Anggota("Senandung");
        Anggota ag2 = new Anggota("Wisnu");
        Anggota ag3 = new Anggota("Nuby");

        // Menambahkan anggota ke klub
        klub.tambahAnggota(ag1);
        klub.tambahAnggota(ag2);
        klub.tambahAnggota(ag3);

        // Menampilkan informasi klub
        System.out.println("Informasi Klub");
        klub.infoKlub();
    }
}
