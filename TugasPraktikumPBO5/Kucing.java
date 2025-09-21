/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikumPBO5;

/**
 *
 * @author Senandung Marimby
 */
public class Kucing extends Hewan{   
    String warna;    
    String suaraKucing;    
    
    @Override    
    public void info() {    
        super.info();    
        System.out.println("Warna " + warna);
        System.out.println("Suaranya " + suaraKucing);
    }
}