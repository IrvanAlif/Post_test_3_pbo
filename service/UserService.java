/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.post_test_2.service;

import com.mycompany.post_test_2.model.User;
import java.util.ArrayList;

/**
 * Service class untuk mengelola operasi User
 * @author IRVAN
 */
public class UserService {
    private ArrayList<User> daftarUser;
    private User currentUser;
    
    public UserService() {
        this.daftarUser = new ArrayList<>();
        // Inisialisasi user default
        daftarUser.add(new User("admin", "admin123", "admin", "Administrator"));
        daftarUser.add(new User("user", "user123", "user", "Regular User"));
        this.currentUser = null;
    }
    
    public boolean login(String username, String password) {
        for(User user : daftarUser) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                this.currentUser = user;
                return true;
            }
        }
        return false;
    }
    
    public void logout() {
        this.currentUser = null;
    }
    
    public User getCurrentUser() {
        return currentUser;
    }
    
    public boolean isLoggedIn() {
        return currentUser != null;
    }
    
    public boolean isAdmin() {
        return currentUser != null && "admin".equals(currentUser.getRole());
    }
}