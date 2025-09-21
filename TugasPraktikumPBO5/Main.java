/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikumPBO5;

/**
 *
 * @author Senandung Marimby
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek anjing
        Anjing anjing1 = new Anjing();
        anjing1.nama = "Rocky";
        anjing1.jenis = "Buldog";
        anjing1.jenisBulu = "Halus";
        anjing1.suaraAnjing = "wup-wup";

        System.out.println("=== Data Anjing ===");
        anjing1.info();

        // Membuat objek kucing
        Kucing kucing1 = new Kucing();
        kucing1.nama = "Snowy";
        kucing1.jenis = "Persia";
        kucing1.warna = "Putih";
        kucing1.suaraKucing = "Miaww";

        System.out.println("\n=== Data Kucing ===");
        kucing1.info();
    }
}