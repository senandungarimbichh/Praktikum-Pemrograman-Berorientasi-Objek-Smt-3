/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum9;

/**
 *
 * @author Senandung Marimby
 */
// Kode utama untuk pengujian
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        // Memanggil metode suara()
        kucing.suara();
        anjing.suara();
    }
}