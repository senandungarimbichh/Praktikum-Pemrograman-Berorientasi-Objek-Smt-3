/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_senandung_marimby_zahira_malika;

/**
 *
 * @author Senandung Marimby
 */
class PegawaiTetap extends Pegawai {
    private double tunjangan; // atribut tambahan

    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan dari Pegawai
        System.out.println("Tunjangan: " + (int) tunjangan);
    }
}