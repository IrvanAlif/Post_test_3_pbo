package com.mycompany.post_test_2.model;

/**
 * Subclass untuk Tanaman yang Cepat Tumbuh
 * Extends dari Tanaman (superclass)
 * @author IRVAN
 */
public class TanamanCepat extends Tanaman {
    private boolean cepatTumbuh;
    
    // Constructor
    public TanamanCepat(String nama, String jenis, String sistemHidroponik, 
                       String tanggalTanam, String status, String phAir, String catatan) {
        super(nama, jenis, sistemHidroponik, tanggalTanam, status, phAir, catatan);
        this.cepatTumbuh = cekApakahCepatTumbuh(jenis, sistemHidroponik);
        
        // Kalau sayuran + sistem NFT/DWC, tambahkan info ke catatan
        if (cepatTumbuh) {
            String catatanBaru = catatan + " (Sayuran sistem " + sistemHidroponik + " - cepat tumbuh)";
            setCatatan(catatanBaru);
        }
    }
    
    // Method untuk cek apakah tanaman cepat tumbuh (Sayuran + NFT/DWC)
    private boolean cekApakahCepatTumbuh(String jenis, String sistemHidroponik) {
        // Sayuran + sistem canggih = cepat tumbuh
        if (jenis.equals("Sayuran") && 
            (sistemHidroponik.equals("NFT") || sistemHidroponik.equals("DWC"))) {
            return true;
        }
        
        // Kondisi lain = tidak cepat tumbuh
        return false;
    }
    
    // Getter
    public boolean isCepatTumbuh() {
        return cepatTumbuh;
    }
    
    // Setter
    public void setCepatTumbuh(boolean cepatTumbuh) {
        this.cepatTumbuh = cepatTumbuh;
    }
}