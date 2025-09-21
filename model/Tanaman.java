package com.mycompany.post_test_2.model;

/**
 * Model class untuk data Tanaman Hidroponik
 * @author IRVAN
 */
public class Tanaman {
    // Properties dengan access modifier private
    private String nama;
    private String jenis;
    private String sistemHidroponik;
    private String tanggalTanam;
    private String status;
    private String phAir;
    private String catatan;
    
    // Constructor
    public Tanaman(String nama, String jenis, String sistemHidroponik, 
                   String tanggalTanam, String status, String phAir, String catatan) {
        this.nama = nama;
        this.jenis = jenis;
        this.sistemHidroponik = sistemHidroponik;
        this.tanggalTanam = tanggalTanam;
        this.status = status;
        this.phAir = phAir;
        this.catatan = catatan;
    }
    
    // Getter methods
    public String getNama() {
        return nama;
    }
    
    public String getJenis() {
        return jenis;
    }
    
    public String getSistemHidroponik() {
        return sistemHidroponik;
    }
    
    public String getTanggalTanam() {
        return tanggalTanam;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getPhAir() {
        return phAir;
    }
    
    public String getCatatan() {
        return catatan;
    }
    
    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public void setSistemHidroponik(String sistemHidroponik) {
        this.sistemHidroponik = sistemHidroponik;
    }
    
    public void setTanggalTanam(String tanggalTanam) {
        this.tanggalTanam = tanggalTanam;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setPhAir(String phAir) {
        this.phAir = phAir;
    }
    
    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
    
    @Override
    public String toString() {
        return nama + " | " + jenis + " | " + sistemHidroponik + " | " + 
               tanggalTanam + " | " + status + " | pH:" + phAir + " | " + catatan;
    }
}