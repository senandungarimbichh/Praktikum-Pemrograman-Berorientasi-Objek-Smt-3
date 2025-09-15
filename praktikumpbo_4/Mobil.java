/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.praktikumpbo_4;

/**
 *
 * @author Senandung Marimby
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu; // Atribut tambahan khusus mobil
    
    // Constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }
    
    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        System.out.println("Nama Mobil: " + getNama());           // akses nama lewat getter
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h"); // protected
        System.out.println("Jenis Mesin: " + jenisMesin);        // public
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    // Getter & Setter jumlahPintu (opsional)
    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
}
