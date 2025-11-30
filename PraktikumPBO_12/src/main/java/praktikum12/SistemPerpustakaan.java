package praktikum12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemPerpustakaan {
    private static final String FILE_TEXT = "buku.txt";
    private static final String FILE_SERIAL = "buku.ser";
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            tampilkanMenu();
            int pilihan = inputAngka("Pilih menu: ");
            
            switch (pilihan) {
                case 1:
                    tambahBukuKeText();
                    break;
                case 2:
                    tambahBukuKeSerial();
                    break;
                case 3:
                    tampilkanBukuDariText();
                    break;
                case 4:
                    tampilkanBukuDariSerial();
                    break;
                case 5:
                    System.out.println("\nTerima kasih telah menggunakan sistem perpustakaan");
                    running = false;
                    break;
                default:
                    System.out.println("\nPilihan tidak valid! Silakan coba lagi.");
            }
        }
        
        scanner.close();
    }
    
    private static void tampilkanMenu() {
        System.out.println("SISTEM MANAJEMEN BUKU PERPUSTAKAAN");
        System.out.println("1. Tambah Buku ke File Text (buku.txt)");
        System.out.println("2. Tambah Buku ke File Serial (buku.ser)");
        System.out.println("3. Tampilkan Buku dari File Text");
        System.out.println("4. Tampilkan Buku dari File Serial");
        System.out.println("5. Keluar");
    }

    private static void tambahBukuKeText() {
        System.out.println("\nTambah Buku ke File Text");
        
        Buku buku = inputDataBuku();
        
        // Menggunakan try-with-resources untuk otomatis menutup file
        try (FileWriter fw = new FileWriter(FILE_TEXT, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {
            
            pw.println(buku.toFileFormat());
            System.out.println("Buku berhasil disimpan ke " + FILE_TEXT);
            
        } catch (IOException e) {
            System.out.println("Error saat menyimpan ke file text: " + e.getMessage());
        }
    }

    private static void tambahBukuKeSerial() {
        System.out.println("\nTambah Buku ke File Serial");
        
        Buku buku = inputDataBuku();
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        
        // Baca buku yang sudah ada (jika file sudah ada)
        File file = new File(FILE_SERIAL);
        if (file.exists() && file.length() > 0) {
            try (FileInputStream fis = new FileInputStream(FILE_SERIAL);
                 ObjectInputStream ois = new ObjectInputStream(fis)) {
                
                daftarBuku = (ArrayList<Buku>) ois.readObject();
                
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Info: Membuat file baru karena file lama tidak dapat dibaca");
            }
        }
        
        // Tambahkan buku baru
        daftarBuku.add(buku);
        
        // Simpan kembali semua buku
        try (FileOutputStream fos = new FileOutputStream(FILE_SERIAL);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(daftarBuku);
            System.out.println("Buku berhasil disimpan ke " + FILE_SERIAL);
            
        } catch (IOException e) {
            System.out.println("Error saat menyimpan ke file serial: " + e.getMessage());
        }
    }

    private static void tampilkanBukuDariText() {
        System.out.println("\nDaftar Buku dari File Text");
        
        File file = new File(FILE_TEXT);
        if (!file.exists()) {
            System.out.println("File " + FILE_TEXT + " belum ada. Belum ada buku yang tersimpan.");
            return;
        }
        
        try (FileReader fr = new FileReader(FILE_TEXT);
             BufferedReader br = new BufferedReader(fr)) {
            
            String line;
            int nomor = 1;
            boolean adaBuku = false;
            
            while ((line = br.readLine()) != null) {
                adaBuku = true;
                String[] data = line.split("\\|");
                
                if (data.length == 3) {
                    System.out.println(nomor + ". Judul: " + data[0]);
                    System.out.println("   Pengarang: " + data[1]);
                    System.out.println("   Tahun Terbit: " + data[2]);
                    nomor++;
                }
            }
            
            if (!adaBuku) {
                System.out.println("Belum ada buku yang tersimpan.");
            }
            
        } catch (IOException e) {
            System.out.println("Error saat membaca file text: " + e.getMessage());
        }
    }

    private static void tampilkanBukuDariSerial() {
        System.out.println("\nDaftar Buku dari File Serial");
        
        File file = new File(FILE_SERIAL);
        if (!file.exists() || file.length() == 0) {
            System.out.println("File " + FILE_SERIAL + " belum ada atau kosong. Belum ada buku yang tersimpan.");
            return;
        }
        
        try (FileInputStream fis = new FileInputStream(FILE_SERIAL);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            ArrayList<Buku> daftarBuku = (ArrayList<Buku>) ois.readObject();
            
            if (daftarBuku.isEmpty()) {
                System.out.println("Belum ada buku yang tersimpan.");
            } else {
                for (int i = 0; i < daftarBuku.size(); i++) {
                    Buku buku = daftarBuku.get(i);
                    System.out.println((i + 1) + ". " + buku);
                }
            }
            
        } catch (IOException e) {
            System.out.println("Error saat membaca file serial: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Kelas Buku tidak ditemukan");
        }
    }

    private static Buku inputDataBuku() {
        scanner.nextLine(); // Konsumsi newline dari input menu sebelumnya
        
        System.out.print("Judul Buku: ");
        String judul = scanner.nextLine();
        
        System.out.print("Pengarang: ");
        String pengarang = scanner.nextLine();
        
        int tahunTerbit = inputAngka("Tahun Terbit: ");
        
        return new Buku(judul, pengarang, tahunTerbit);
    }

    private static int inputAngka(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int angka = scanner.nextInt();
                scanner.nextLine(); // Konsumsi newline setelah membaca angka
                return angka;
            } catch (Exception e) {
                System.out.println("Input tidak valid! Masukkan angka.");
                scanner.nextLine(); // Clear buffer
            }
        }
    }
}