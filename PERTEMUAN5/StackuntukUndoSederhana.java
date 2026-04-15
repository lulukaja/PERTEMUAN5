/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN5;

/**
 *
 * @author LULUK
 */
import java.util.Scanner;
import java.util.Stack;

public class StackuntukUndoSederhana {
    public static void main(String[] args) {
        // Bikin tumpukan kosong
        try (Scanner input = new Scanner(System.in)) {
            // Bikin tumpukan kosong
            Stack<String> tumpukan = new Stack<>();
            
            String pilihan;
            
            do {
                // Tampilkan menu
                System.out.println("\n==== MENU ====");
                System.out.println("1. Buka Halaman");
                System.out.println("2. Undo (Kembali)");
                System.out.println("3. Lihat Halaman");
                System.out.println("4. Keluar");
                System.out.print("Pilih nomor berapa? ");
                pilihan = input.nextLine(); // Baca pilihan kamu
                // ===================== PILIH 1 =====================
                switch (pilihan) {
                    case "1" -> {
                        System.out.print("Tulis nama halaman: ");
                        String nama = input.nextLine();
                        tumpukan.push(nama); // Masukin nama ke tumpukan
                        System.out.println("Kamu sekarang di: " + nama);
                    }
                    case "2" -> {
                        // Cek: Kalau tumpukan ADA ISINYA
                        if ( !tumpukan.isEmpty() ) {
                            String yangDihapus = tumpukan.pop(); // Ambil yang paling atas
                            System.out.println("Undo! Keluar dari: " + yangDihapus);
                            
                            // Cek lagi: Kalau setelah dihapus masih ada sisa
                            if ( !tumpukan.isEmpty() ) {
                                System.out.println("Sekarang balik ke: " + tumpukan.peek());
                            } else {
                                System.out.println("Sudah tidak ada halaman lagi.");
                            }
                        }
                        else {
                            System.out.println("Tumpukan kosong, gak bisa undo!");
                        }
                    }
                    case "3" -> {
                        // Cek: Kalau ada isinya
                        if ( !tumpukan.isEmpty() ) {
                            System.out.println("Halaman sekarang: " + tumpukan.peek());
                        }
                        else {
                            System.out.println("Belum ada halaman yang dibuka.");
                        }
                    }
                    default -> {
                    }
                }

            }
            // Ulangi terus sampai kamu pilih nomor 4
            while ( !pilihan.equals("4") );
            
            System.out.println("Program Selesai.");
        }
    }
}