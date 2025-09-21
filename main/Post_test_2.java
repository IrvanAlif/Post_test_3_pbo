/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.post_test_2.main;

import com.mycompany.post_test_2.view.MenuView;

/**
 * Main class - Entry point aplikasi Sistem Manajemen Tanaman Hidroponik
 * Menggunakan arsitektur MVC
 * @author IRVAN
 */
public class Post_test_2 {
    public static void main(String[] args) {
        System.out.println("Memuat Sistem Manajemen Tanaman Hidroponik...");
        System.out.println("Arsitektur: MVC (Model-View-Controller)");
        
        MenuView menuView = new MenuView();
        menuView.tampilkanMenuUtama();
    }
}