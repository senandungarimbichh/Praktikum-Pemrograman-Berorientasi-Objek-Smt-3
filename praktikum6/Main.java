/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Senandung Marimby
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara();             // Output: Meow

        Kucing kucing = new Kucing();
        kucing.makan("ikan");         // Output: Hewan makan ikan
        kucing.makan("ikan", 2);      // Output: Hewan makan 2 porsi ikan

        Anjing anjing = new Anjing();
        anjing.bersuara();            // Output: Woof
        anjing.makan("daging", 3);    // Output: Hewan makan 3 porsi daging
    }
}