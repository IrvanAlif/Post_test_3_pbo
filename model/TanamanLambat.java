package com.mycompany.post_test_2.model;

/**
 * Subclass untuk Tanaman yang Lambat Tumbuh
 * Extends dari Tanaman (superclass)
 * @author IRVAN
 */
public class TanamanLambat extends Tanaman {
    private boolean lambatTumbuh;
    
    // Constructor
    public TanamanLambat(String nama, String jenis, String sistemHidroponik, 
                        String tanggalTanam, String status, String phAir, String catatan) {
        super(nama, jenis, sistemHidroponik, tanggalTanam, status, phAir, catatan);
        this.lambatTumbuh = cekApakahLambatTumbuh(jenis, sistemHidroponik);
        
        // Kalau tanaman hias + sistem sederhana, tambahkan info ke catatan
        if (lambatTumbuh) {
            String catatanBaru = catatan + " (Tanaman hias sistem " + sistemHidroponik + " - lambat tumbuh)";
            setCatatan(catatanBaru);
        }
    }
    
    // Method untuk cek apakah tanaman lambat tumbuh (Tanaman Hias + Wick/Drip)
    private boolean cekApakahLambatTumbuh(String jenis, String sistemHidroponik) {
        // Tanaman Hias + sistem sederhana = lambat tumbuh
        if (jenis.equals("Tanaman Hias") && 
            (sistemHidroponik.equals("Wick") || sistemHidroponik.equals("Drip"))) {
            return true;
        }
        
        // Kondisi lain = tidak lambat tumbuh khusus
        return false;
    }
    
    // Getter
    public boolean isLambatTumbuh() {
        return lambatTumbuh;
    }
    
    // Setter
    public void setLambatTumbuh(boolean lambatTumbuh) {
        this.lambatTumbuh = lambatTumbuh;
    }
    
    // Override toString untuk tampilkan info tambahan
    @Override
    public String toString() {
        String keterangan = lambatTumbuh ? "HIAS+"+getSistemHidroponik()+"=LAMBAT" : getJenis().toUpperCase();
        return super.toString() + " | " + keterangan;
    }
}