/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_teori;

/**
 *
 * @author Senandung Marimby
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Tirta", 20, "Editor", 350000);
       
        System.out.println("==Data Pekerja Awal==");
        System.out.println(pekerja1.toString());
        
        System.out.println("Nama Langsung: " + pekerja1.nama);
        System.out.println("Gaji Langsung: " + pekerja1.gaji);
        
        pekerja1.setNama("Wisnu");
        System.out.println("\n=== Data Pekerja Setelah Nama Diubah ===");
        System.out.println(pekerja1.toString());
    }
}
