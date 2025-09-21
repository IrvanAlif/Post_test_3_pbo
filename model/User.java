/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.post_test_2.model;

/**
 * Model class untuk data User
 * @author IRVAN
 */
public class User {
    private String username;
    private String password;
    private String role; // "admin" atau "user"
    private String namaLengkap;
    
    public User(String username, String password, String role, String namaLengkap) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.namaLengkap = namaLengkap;
    }
    
    // Getters
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getNamaLengkap() { return namaLengkap; }
    
    // Setters
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }
    public void setNamaLengkap(String namaLengkap) { this.namaLengkap = namaLengkap; }
    
    @Override
    public String toString() {
        return namaLengkap + " (" + username + ") - " + role;
    }
}