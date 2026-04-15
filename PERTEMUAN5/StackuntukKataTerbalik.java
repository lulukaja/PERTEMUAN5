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

public class StackuntukKataTerbalik {
    public static void main(String[] args) {
        // Membaca input kata dari pengguna
        try (Scanner scanner = new Scanner(System.in)) {
            // Membaca input kata dari pengguna
            System.out.print("Masukkan kata: ");
            String kata = scanner.nextLine();
            
            // Membuat objek Stack untuk menyimpan karakter
            Stack<Character> stack = new Stack<>();
            
            // Memasukkan setiap karakter ke dalam Stack
            for (int i = 0; i < kata.length(); i++) {
                stack.push(kata.charAt(i));
            }
            
            // Mengeluarkan karakter dari Stack dan menyusunnya menjadi kata terbalik
            String kataTerbalik = "";
            while (!stack.isEmpty()) {
                kataTerbalik += stack.pop();
            }
            
            // Menampilkan hasil
            System.out.println("Kata terbalik: " + kataTerbalik);
        }
    }
}
