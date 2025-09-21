/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.post_test_2.view;

import com.mycompany.post_test_2.service.TanamanService;
import com.mycompany.post_test_2.service.UserService;
import java.util.Scanner;

/**
 * View class untuk mengelola tampilan menu dan interaksi user
 *
 * @author IRVAN
 */
public class MenuView {

    private final TanamanService tanamanService;
    private final UserService userService;
    private final Scanner input;

    public MenuView() {
        this.tanamanService = new TanamanService();
        this.userService = new UserService();
        this.input = new Scanner(System.in);
    }

    public void tampilkanMenuUtama() {
        while (true) {
            if (!userService.isLoggedIn()) {
                tampilkanMenuLogin();
            } else {
                tampilkanMenuSistem();
            }
        }
    }

    private void tampilkanMenuLogin() {
        System.out.println("\n=== SISTEM MANAJEMEN TANAMAN HIDROPONIK ===");
        System.out.println("1. Login");
        System.out.println("2. Keluar");
        System.out.print("Pilih menu: ");

        int pilihan = validasiInputInteger(1, 2);

        switch (pilihan) {
            case 1:
                prosesLogin();
                break;
            case 2:
                System.out.println("Terima kasih!");
                System.exit(0);
                break;
        }
    }

    private void prosesLogin() {
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        if (userService.login(username, password)) {
            System.out.println("Login berhasil! Selamat datang, "
                    + userService.getCurrentUser().getNamaLengkap());
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    private void tampilkanMenuSistem() {
        System.out.println("\n=== SISTEM MANAJEMEN TANAMAN HIDROPONIK ===");
        System.out.println("User: " + userService.getCurrentUser().getNamaLengkap()
                + " (" + userService.getCurrentUser().getRole() + ")");
        System.out.println("1. Tambah Tanaman");
        System.out.println("2. Lihat Semua Tanaman");
        System.out.println("3. Update Tanaman");
        System.out.println("4. Hapus Tanaman");
        System.out.println("5. Cari Tanaman");
        System.out.println("6. Statistik Tanaman");
        System.out.println("7. Logout");
        System.out.print("Pilih menu: ");

        int maxMenu = userService.isAdmin() ? 8 : 8;
        int pilihan = validasiInputInteger(1, maxMenu);

        prosesMenuSistem(pilihan);
    }

    private void prosesMenuSistem(int pilihan) {
        switch (pilihan) {
            case 1:
                tanamanService.tambahTanaman();
                break;
            case 2:
                tanamanService.lihatTanaman();
                break;
            case 3:
                tanamanService.updateTanaman();
                break;
            case 4:
                if (userService.isAdmin()) {
                    tanamanService.hapusTanaman();
                } else {
                    System.out.println("Akses ditolak! Hanya admin yang dapat menghapus data.");
                }
                break;
            case 5:
                tanamanService.cariTanaman();
                break;
            case 6:
                tanamanService.tampilkanStatistik();
                break;
            case 7:
                userService.logout();
                System.out.println("Logout berhasil!");
                break;
        }
    }

    private int validasiInputInteger(int min, int max) {
        int nilai;
        while (true) {
            try {
                nilai = input.nextInt();
                input.nextLine(); // consume newline
                if (nilai >= min && nilai <= max) {
                    break;
                } else {
                    System.out.print("Input harus antara " + min + " dan " + max + ". Coba lagi: ");
                }
            } catch (Exception e) {
                System.out.print("Input harus berupa angka. Coba lagi: ");
                input.nextLine(); // consume invalid input
            }
        }
        return nilai;
    }
}
