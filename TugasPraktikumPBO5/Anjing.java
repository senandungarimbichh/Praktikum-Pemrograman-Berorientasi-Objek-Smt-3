/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikumPBO5;

/**
 *
 * @author Senandung Marimby
 */
public class Anjing extends Hewan {    
    String jenisBulu;    
    String suaraAnjing;   
    
    @Override   
    public void info(){   
        super.info();    
        System.out.println("Jenis Bulu " + jenisBulu); 
        System.out.println("Suaranya " + suaraAnjing);
    }
}
