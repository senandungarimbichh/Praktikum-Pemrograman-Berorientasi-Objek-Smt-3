/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugasmodul3;

/**
 *
 * @author Senandung Marimby
 */
public class Main {
    public static void main(String args[]) {
        Mobil mobil1 = new Mobil("Honda", "HR-v", 2023, "Khaki");
        mobil1.displayInfo();
        mobil1.startEngine();

        Mobil mobil2 = new Mobil("Honda", "Civic turbo", 2016, "Hitam");
        mobil2.displayInfo();
        mobil2.startEngine();

        mobil2.setWarna("Biru");
        System.out.println("\nSetelah diubah warna:");
        mobil2.displayInfo();
    }
}
