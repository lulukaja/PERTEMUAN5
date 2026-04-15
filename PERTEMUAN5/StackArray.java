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

public class StackArray {
    static int max = 5;
    static int[] stack = new int[max];
    static int top = -1;

    public static void main(String[] args) {
        try ( // Ganti baris try (...) jadi begini
                Scanner sc = new Scanner(System.in)) {
            int pilih;
            do {
                System.out.println("\n===== MENU STACK =====");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Display");
                System.out.println("4. Exit");
                System.out.print("Pilih menu: ");
                pilih = sc.nextInt();
                
                switch(pilih) {
                    case 1 -> {
                        if(top == max-1) {
                            System.out.println("Stack Penuh!");
                        } else {
                            System.out.print("Masukkan angka: ");
                            stack[++top] = sc.nextInt();
                            System.out.println("Data ditambahkan.");
                        }
                    }
                        
                    case 2 -> {
                        if(top == -1) {
                            System.out.println("Stack Kosong!");
                        } else {
                            System.out.println("Data " + stack[top--] + " dihapus.");
                        }
                    }
                        
                    case 3 -> {
                        if(top == -1) {
                            System.out.println("Stack Kosong.");
                        } else {
                            System.out.println("Isi Stack:");
                            for(int i = top; i >= 0; i--) {
                                System.out.println(stack[i]);
                            }
                        }
                    }
                        
                    case 4 -> System.out.println("Program selesai.");
                        
                    default -> System.out.println("Pilihan salah!");
                }
            } while (pilih != 4);
            // Tutup scanner di akhir
        }
    }
}