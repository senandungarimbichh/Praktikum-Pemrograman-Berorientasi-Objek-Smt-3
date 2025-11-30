package praktikum12;

import java.io.Serializable;

public class Buku implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    
    // Constructor
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
    
    // Getter methods
    public String getJudul() {
        return judul;
    }
    
    public String getPengarang() {
        return pengarang;
    }
    
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    // Setter methods
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    
    // Method untuk menampilkan informasi buku
    @Override
    public String toString() {
        return "Judul: " + judul + ", Pengarang: " + pengarang + 
               ", Tahun Terbit: " + tahunTerbit;
    }
    
    // Method untuk format penulisan ke file text
    public String toFileFormat() {
        return judul + "|" + pengarang + "|" + tahunTerbit;
    }
}