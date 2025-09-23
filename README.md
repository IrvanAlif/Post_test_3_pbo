## Irvan Alif
## 2409116071
## kelas B


---

Project ini bertema aplikasi manajemen data tanaman dan user sederhana berbasis console di Java. Program ini dibuat untuk latihan konsep OOP, di mana ada class untuk merepresentasikan tanaman dan user, lalu ada service untuk mengelola datanya. Semua fitur dijalankan lewat menu interaktif di console, seperti menambah, melihat, atau menghapus data. Aplikasi ini bisa jadi contoh dasar sistem manajemen data sederhana yang nantinya bisa dikembangkan lebih lanjut.

---

<img width="442" height="386" alt="image" src="https://github.com/user-attachments/assets/775313f3-1c93-4013-bbbb-6d66261025a8" />


1. com.mycompany.post_test_2.main

    Tugas: Menjadi entry point aplikasi.
    
    Isi:
  
    - Post_test_2.java – kelas utama yang memuat MenuView dan menampilkan menu utama.

2. com.mycompany.post_test_2.model
  
    Tugas: Menyimpan struktur data (Plain Old Java Object / POJO).
  
    Isi:
  
    - Tanaman.java – merepresentasikan satu tanaman hidroponik (nama, jenis, sistem, tanggal, status, pH, catatan).
    - User.java – merepresentasikan satu pengguna (username, password, role, nama lengkap).
    - TanamanCepat.java – subclass dari Tanaman, tetapi hanya berlaku jika jenisnya sayuran dan sistem hidroponiknya NFT atau DWC.
    - TanamanLambat.java – subclass dari Tanaman, tetapi hanya berlaku jika jenisnya hias dan sistem hidroponiknya Wick & Drip.

3. com.mycompany.post_test_2.service

    Tugas: Business logic / Controller.
  
    Semua proses CRUD, validasi, login, logout, statistik, dan pencarian berada di sini.
  
    Isi:
  
    - TanamanService.java – mengelola ArrayList tanaman: tambah, lihat, update, hapus, cari, statistik, validasi input.
    - UserService.java – mengelola ArrayList user: login, logout, cek role, current user.

4. com.mycompany.post_test_2.view

    Tugas: Presentation layer – interaksi konsol dengan pengguna.
  
    Isi:
  
    - MenuView.java – menampilkan menu login & utama, membaca input keyboard, lalu memanggil service yang sesuai.

---

# *OUTPUT*

---
1. Login sebagai admin

<img width="787" height="228" alt="image" src="https://github.com/user-attachments/assets/ff812087-6b04-4d60-a4c8-122dbeca322f" />

Program Sistem Manajemen Tanaman Hidroponik ini awalnya menunjukkan dua pilihan, login atau keluar. Kalau pilih login, kita diminta memasukan username sama password. Di contoh ini dipakai username admin dan password admin123. Karena bener, sistem langsung menginfokan kalau login berhasil dan menyambut kita sebagai Administrator.

---
2.Login sebagai user

<img width="601" height="204" alt="image" src="https://github.com/user-attachments/assets/4536de61-ed60-458e-96be-2835a260c408" />

Di tampilan ini, program juga menunjukkan menu awal dengan pilihan login atau keluar. Waktu memilih login, pengguna memasukkan username user sama password user123. Karena data cocok, sistem langsung menerima login dan menyapa kita sebagai Regular User.

---

### Menu utama

---
3.Tambah tanaman

<img width="908" height="726" alt="image" src="https://github.com/user-attachments/assets/7a59d47b-f7b8-4d60-af25-1d3139754995" />


Di bagian ini, pengguna berhasil login sebagai Regular User dan memilih menu Tambah Tanaman. Pengguna kemudian mengisi data tanaman baru mulai dari nama tanaman (bayam), jenis tanaman (sayuran), sistem hidroponik yang dipakai (NFT), tanggal tanam, status tanaman (bibit), pH air, sampai catatan tambahan. Karena tanaman ini termasuk kategori tanaman cepat (jenis sayuran dengan sistem hidroponik NFT), maka sistem otomatis menambahkan informasi tambahan di bagian catatan dengan format: "(Sayuran sistem NFT – cepat tumbuh)". Setelah semua data dimasukkan, sistem memberikan konfirmasi bahwa tanaman berhasil ditambahkan ke database. Contoh lain, saat pengguna menambahkan tanaman kangkung dengan sistem hidroponik Wick, data tetap berhasil disimpan, tetapi karena tidak memenuhi kriteria tanaman cepat, catatan hanya menampilkan isi yang dimasukkan pengguna tanpa tambahan otomatis.

---
4. Melihat semua tanaman dalam tabel
   
<img width="1328" height="103" alt="image" src="https://github.com/user-attachments/assets/28861ac0-ad17-4d04-9752-a179f9ced136" />


Tampilan ini menunjukkan saat pengguna memilih menu Lihat Semua Tanaman. Sistem langsung menampilkan daftar tanaman yang sudah ditambah sebelumnya, lengkap dengan detailnya. Contohnya ada tanaman bayam dengan jenis sayuran, sistem hidroponik NFT, tanggal tanam 12/2/2025, status Bibit, pH air 12, dan catatan efgggdgd. Karena tanaman ini termasuk kategori tanaman cepat (sayuran dengan sistem NFT atau DWC), maka sistem otomatis menambahkan keterangan tambahan pada catatan: "(Sayuran sistem NFT – cepat tumbuh)". Sedangkan tanaman kangkung dengan sistem hidroponik Wick tidak termasuk kategori cepat, sehingga catatannya hanya menampilkan isi yang dimasukkan pengguna, yaitu oke.

---
5. update tanaman

<img width="587" height="520" alt="image" src="https://github.com/user-attachments/assets/1dd9ef7b-9790-4e0c-b803-d6a647fabe0a" />

Tampilan ini menunjukkan saat pengguna milih menu **Update Tanaman**. Sistem minta nomor tanaman yang mau diubah, lalu pengguna memasukkan data baru untuk memperbarui informasi. Contohnya, tanaman dengan nomor 1 diupdate jadi nama **baymmmmm** dengan jenis **sayur**, sistem hidroponik **NFT**, tanggal tanam **11/9/2024**, status **tumbuh**, pH air **15**, dan catatan **okeeee**. Setelah semua data baru dimasukin, sistem menampilkan konfirmasi kalau tanaman berhasil diupdate.


---
6. Mencari tanaman

<img width="513" height="556" alt="image" src="https://github.com/user-attachments/assets/82b9f1de-56f7-4a9e-99da-b66cf12965b0" />

Tampilan ini menunjukkan saat pengguna milih menu Cari Tanaman. Sistem memberi pilihan pencarian berdasarkan nama, jenis, atau status. Pada percobaan pertama, pengguna pilih pencarian berdasarkan nama dan masukin keyword bayammm, tapi hasilnya kosong karena data dengan keyword itu nggak ditemukan. Setelah kembali ke menu utama, pengguna coba lagi cari tanaman dengan cara yang sama, kali ini keyword yang dimasukin baymmmmm. Proses ini memperlihatkan kalau sistem hanya bakal menampilkan data kalau keyword yang dimasukin sesuai persis dengan data yang tersimpan.

---
7. Statistik tanaman

<img width="533" height="590" alt="image" src="https://github.com/user-attachments/assets/6ffea3ff-d702-4e49-9fd6-746f90e5c814" />

Tampilan ini menunjukkan saat pengguna memilih menu Statistik Tanaman. Sistem langsung menampilkan jumlah total tanaman yang tercatat, yaitu 2 tanaman.

Selain total, sistem juga menyajikan rincian statistik berdasarkan:

- Jenis tanaman, yang menunjukkan ada 2 tanaman sayuran, sedangkan kategori buah, herbal, dan tanaman hias masih bernilai 0.

- Status tanaman, dengan rincian 1 tanaman berstatus Bibit dan 1 tanaman berstatus Tumbuh, sementara kategori Berbunga, Berbuah, Panen, dan Mati masih kosong (0).

Dari tampilan ini bisa disimpulkan kalau data tanaman sudah tercatat dan terklasifikasi dengan benar ke dalam jenis dan status masing-masing, sehingga pengguna bisa langsung tahu sebaran tanaman yang ada di sistem.

---
8. Menghapus tanaman di menu user

<img width="960" height="430" alt="image" src="https://github.com/user-attachments/assets/3fc83b53-b674-44ef-817c-a74f644c9072" />

Tampilan ini menunjukkan saat pengguna dengan role Regular User coba pilih menu Hapus Tanaman. Begitu opsi nomor 4 dipilih, sistem langsung menampilkan pesan Akses ditolak! Hanya admin yang dapat menghapus data. Artinya, fitur hapus tanaman dibatasi khusus untuk admin saja, sedangkan user biasa nggak punya izin untuk melakukan penghapusan data.

---
9. Keluar

<img width="798" height="417" alt="image" src="https://github.com/user-attachments/assets/42a6f845-5260-4f35-b04e-6a97e3668561" />

Tampilan ini menunjukkan saat pengguna dengan role Regular User milih menu Logout. Setelah memilih opsi nomor 8, sistem langsung menampilkan pesan Logout berhasil!, yang berarti sesi pengguna sudah diakhiri dan akses ke dalam sistem ditutup(tampilan ini juga sama dengan admin).

---
10. Menghapus tanaman di menu admin

<img width="843" height="456" alt="image" src="https://github.com/user-attachments/assets/64d22d49-3f76-47c2-82e3-7d3811b0d1f5" />


Tampilan ini menunjukkan saat pengguna dengan role Administrator (admin) memilih menu Hapus Tanaman. Setelah memilih opsi nomor 4, sistem minta nomor tanaman yang mau dihapus, lalu admin memasukkan angka 1. Sistem kemudian menampilkan pesan Tanaman berhasil dihapus!, yang berarti data tanaman dengan nomor tersebut sudah berhasil dihapus dari sistem. Berbeda dengan user biasa, admin punya akses penuh untuk melakukan penghapusan data.

---

# *CODE*

---

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

1. Post_test_2.java

    - File utama (main class) untuk menjalankan program.
    
    - Biasanya berisi public static void main(String[] args) sebagai entry point.
    
    - Dari sini program mulai dieksekusi dan menghubungkan semua service & view.

---

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

2. Tanaman.java

    - Class dasar (superclass) untuk semua jenis tanaman.
    
    - Berisi atribut umum seperti nama tanaman, usia, tinggi, atau pertumbuhan.
    
    - Bisa bersifat abstract kalau program butuh inheritance.

---

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


3. TanamanCepat.java

    - Subclass dari Tanaman.
    
    - Mewakili jenis tanaman yang cepat tumbuh.
    
    - Biasanya override metode dari Tanaman untuk pertumbuhan/penyiraman.

---
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

4. TanamanLambat.java

    - Subclass dari Tanaman.
    
    - Mewakili jenis tanaman yang lambat tumbuh.
    
    - Sama seperti TanamanCepat, tapi dengan logika pertumbuhan berbeda.
  
---

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

5. User.java

    - Representasi data user (model).
    
    - Berisi atribut seperti username, password, atau data lain terkait pengguna.
    
    - Dipakai untuk login/registrasi dalam program.
  
---

    package com.mycompany.post_test_2.service;
    
    import com.mycompany.post_test_2.model.Tanaman;
    import com.mycompany.post_test_2.model.TanamanCepat;
    import com.mycompany.post_test_2.model.TanamanLambat;
    import java.util.ArrayList;
    import java.util.Scanner;
    
    /**
     * Service class untuk mengelola operasi CRUD Tanaman Hidroponik
     * @author IRVAN
     */
    public class TanamanService {
        // Property dengan access modifier private
        private ArrayList<Tanaman> daftarTanaman;
        private Scanner input;
        
        // Constructor
        public TanamanService() {
            this.daftarTanaman = new ArrayList<>();
            this.input = new Scanner(System.in);
        }
        
        // Method untuk menambah tanaman (Create)
        public void tambahTanaman() {
            System.out.print("Nama Tanaman: ");
            String nama = input.nextLine();
            
            System.out.println("Jenis Tanaman: 1.Sayuran 2.Buah 3.Herbal 4.Tanaman Hias");
            System.out.print("Pilih jenis (1-4): ");
            int j = validasiInputInteger(1, 4);
            String jenis = (j==1)?"Sayuran":(j==2)?"Buah":(j==3)?"Herbal":(j==4)?"Tanaman Hias":"Belum ditentukan";
            
            System.out.println("Sistem Hidroponik: 1.NFT 2.DWC 3.Wick 4.Drip 5.Ebb&Flow 6.Aeroponik");
            System.out.print("Pilih sistem (1-6): ");
            int s = validasiInputInteger(1, 6);
            String sistem = (s==1)?"NFT":(s==2)?"DWC":(s==3)?"Wick":(s==4)?"Drip":(s==5)?"Ebb&Flow":(s==6)?"Aeroponik":"Belum ditentukan";
            
            System.out.print("Tanggal Tanam (dd/mm/yyyy): ");
            String tanggal = input.nextLine();
            
            System.out.println("Status Tanaman: 1.Bibit 2.Tumbuh 3.Berbunga 4.Berbuah 5.Panen 6.Mati");
            System.out.print("Pilih status (1-6): ");
            int st = validasiInputInteger(1, 6);
            String status = (st==1)?"Bibit":(st==2)?"Tumbuh":(st==3)?"Berbunga":(st==4)?"Berbuah":(st==5)?"Panen":(st==6)?"Mati":"Belum ditentukan";
            
            System.out.print("pH Air: ");
            String ph = input.nextLine();
            System.out.print("Catatan: ");
            String ctn = input.nextLine();
            
            if (jenis.equals("Sayuran") && (sistem.equals("NFT") || sistem.equals("DWC"))) {
                // Sayuran + NFT/DWC = Cepat
                TanamanCepat tanaman = new TanamanCepat(nama, jenis, sistem, tanggal, status, ph, ctn);
                daftarTanaman.add(tanaman);
            } else if (jenis.equals("Tanaman Hias") && (sistem.equals("Wick") || sistem.equals("Drip"))) {
                // Tanaman Hias + Wick/Drip = Lambat
                TanamanLambat tanaman = new TanamanLambat(nama, jenis, sistem, tanggal, status, ph, ctn);
                daftarTanaman.add(tanaman);
            } else {
                // Default: Tanaman biasa
                Tanaman tanaman = new Tanaman(nama, jenis, sistem, tanggal, status, ph, ctn);
                daftarTanaman.add(tanaman);
            }
            System.out.println("Tanaman berhasil ditambahkan!");
        }
        
        // Method untuk melihat semua tanaman (Read)
        public void lihatTanaman() {
            System.out.println("=== Daftar Tanaman ===");
            if(daftarTanaman.isEmpty()) {
                System.out.println("Belum ada tanaman.");
            } else {
                for(int i = 0; i < daftarTanaman.size(); i++){
                    System.out.println((i+1) + ". " + daftarTanaman.get(i).toString());
                }
            }
        }
        
        // Method untuk update tanaman (Update)
        public void updateTanaman() {
            if(daftarTanaman.isEmpty()) {
                System.out.println("Belum ada tanaman.");
                return;
            }
            
            System.out.print("Nomor tanaman yang ingin diupdate: ");
            int u = validasiInputInteger(1, daftarTanaman.size());
            
            if(u > 0 && u <= daftarTanaman.size()){
                int idx = u - 1;
                Tanaman tanaman = daftarTanaman.get(idx);
                
                System.out.print("Nama baru: ");
                tanaman.setNama(input.nextLine());
                System.out.print("Jenis baru: ");
                tanaman.setJenis(input.nextLine());
                System.out.print("Sistem baru: ");
                tanaman.setSistemHidroponik(input.nextLine());
                System.out.print("Tanggal baru: ");
                tanaman.setTanggalTanam(input.nextLine());
                System.out.print("Status baru: ");
                tanaman.setStatus(input.nextLine());
                System.out.print("pH baru: ");
                tanaman.setPhAir(input.nextLine());
                System.out.print("Catatan baru: ");
                tanaman.setCatatan(input.nextLine());
                
                System.out.println("Tanaman berhasil diupdate!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
        
        // Method untuk menghapus tanaman (Delete)
        public void hapusTanaman() {
            if(daftarTanaman.isEmpty()) {
                System.out.println("Belum ada tanaman.");
                return;
            }
            
            System.out.print("Nomor tanaman yang ingin dihapus: ");
            int h = validasiInputInteger(1, daftarTanaman.size());
            
            if(h > 0 && h <= daftarTanaman.size()){
                daftarTanaman.remove(h - 1);
                System.out.println("Tanaman berhasil dihapus!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
        
        // Method untuk mencari tanaman berdasarkan nama (Search - fitur tambahan)
    //    public void cariTanaman() {
    //        if(daftarTanaman.isEmpty()) {
    //            System.out.println("Belum ada tanaman.");
    //            return;
    //        }
    //        
    //        System.out.print("Masukkan nama tanaman yang dicari: ");
    //        String keyword = input.nextLine().toLowerCase();
    //        
    //        System.out.println("=== Hasil Pencarian ===");
    //        boolean found = false;
    //        for(int i = 0; i < daftarTanaman.size(); i++){
    //            if(daftarTanaman.get(i).getNama().toLowerCase().contains(keyword)){
    //                System.out.println((i+1) + ". " + daftarTanaman.get(i).toString());
    //                found = true;
    //            }
    //        }
    //        
    //        if(!found) {
    //            System.out.println("Tanaman dengan nama '" + keyword + "' tidak ditemukan.");
    //        }
    //    }
    //    
        public void cariTanaman() {
        if(daftarTanaman.isEmpty()) {
            System.out.println("Belum ada tanaman.");
            return;
        }
        
        System.out.println("=== PENCARIAN TANAMAN ===");
        System.out.println("1. Cari berdasarkan nama");
        System.out.println("2. Cari berdasarkan jenis");
        System.out.println("3. Cari berdasarkan status");
        System.out.print("Pilih jenis pencarian: ");
        
        int jenis = validasiInputInteger(1, 3);
        System.out.print("Masukkan keyword: ");
        String keyword = input.nextLine().toLowerCase();
        
        System.out.println("=== Hasil Pencarian ===");
        boolean found = false;
        
        for(int i = 0; i < daftarTanaman.size(); i++){
            Tanaman t = daftarTanaman.get(i);
            boolean match = false;
            
            switch(jenis) {
                case 1: // Nama
                    match = t.getNama().toLowerCase().contains(keyword);
                    break;
                case 2: // Jenis
                    match = t.getJenis().toLowerCase().contains(keyword);
                    break;
                case 3: // Status
                    match = t.getStatus().toLowerCase().contains(keyword);
                    break;
            }
            
            if(match) {
                System.out.println((i+1) + ". " + t.toString());
                found = true;
            }
        }
        
        if(!found) {
            System.out.println("Data tidak ditemukan untuk keyword: " + keyword);
        }
    }
    
    // Method untuk menampilkan statistik
    public void tampilkanStatistik() {
        if(daftarTanaman.isEmpty()) {
            System.out.println("Belum ada tanaman.");
            return;
        }
        
        System.out.println("\n=== STATISTIK TANAMAN ===");
        System.out.println("Total Tanaman: " + daftarTanaman.size());
        
        // Hitung berdasarkan jenis
        int sayuran = 0, buah = 0, herbal = 0, hias = 0;
        for(Tanaman t : daftarTanaman) {
            switch(t.getJenis().toLowerCase()) {
                case "sayuran": sayuran++; break;
                case "buah": buah++; break;
                case "herbal": herbal++; break;
                case "tanaman hias": hias++; break;
            }
        }
        
        System.out.println("\nBerdasarkan Jenis:");
        System.out.println("- Sayuran: " + sayuran);
        System.out.println("- Buah: " + buah);
        System.out.println("- Herbal: " + herbal);
        System.out.println("- Tanaman Hias: " + hias);
        
        // Hitung berdasarkan status
        int bibit = 0, tumbuh = 0, berbunga = 0, berbuah = 0, panen = 0, mati = 0;
        for(Tanaman t : daftarTanaman) {
            switch(t.getStatus().toLowerCase()) {
                case "bibit": bibit++; break;
                case "tumbuh": tumbuh++; break;
                case "berbunga": berbunga++; break;
                case "berbuah": berbuah++; break;
                case "panen": panen++; break;
                case "mati": mati++; break;
            }
        }
        
        System.out.println("\nBerdasarkan Status:");
        System.out.println("- Bibit: " + bibit);
        System.out.println("- Tumbuh: " + tumbuh);
        System.out.println("- Berbunga: " + berbunga);
        System.out.println("- Berbuah: " + berbuah);
        System.out.println("- Panen: " + panen);
        System.out.println("- Mati: " + mati);
    }
    // Method validasi pH
    private boolean validasiPH(String ph) {
        try {
            double nilai = Double.parseDouble(ph);
            return nilai >= 0 && nilai <= 14;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    // Method validasi tanggal (format dd/mm/yyyy)
    private boolean validasiTanggal(String tanggal) {
        if(!tanggal.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }
        
        String[] parts = tanggal.split("/");
        try {
            int hari = Integer.parseInt(parts[0]);
            int bulan = Integer.parseInt(parts[1]);
            int tahun = Integer.parseInt(parts[2]);
            
            return hari >= 1 && hari <= 31 && 
                   bulan >= 1 && bulan <= 12 && 
                   tahun >= 1900 && tahun <= 2100;
        } catch(NumberFormatException e) {
            return false;
        }
    }
        // Method untuk validasi input integer (Validasi input - fitur tambahan)
        private int validasiInputInteger(int min, int max) {
            int nilai;
            while(true) {
                try {
                    nilai = input.nextInt();
                    input.nextLine(); // consume newline
                    if(nilai >= min && nilai <= max) {
                        break;
                    } else {
                        System.out.print("Input harus antara " + min + " dan " + max + ". Coba lagi: ");
                    }
                } catch(Exception e) {
                    System.out.print("Input harus berupa angka. Coba lagi: ");
                    input.nextLine(); // consume invalid input
                }
            }
            return nilai;
        }
        
        // Method untuk mengecek apakah daftar tanaman kosong
        public boolean isDaftarTanamanEmpty() {
            return daftarTanaman.isEmpty();
        }
        
        // Method untuk mendapatkan ukuran daftar tanaman
        public int getDaftarTanamanSize() {
            return daftarTanaman.size();
        }
    }

6. TanamanService.java

    - Class service untuk mengelola logika tanaman.
    
    - Menyediakan fungsi seperti menanam, menyiram, atau mengecek status tanaman.
    
    - Tempat semua aturan/aturan main tentang tanaman dikumpulkan.
  
---

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
    
    7. UserService.java
    
        - Class service yang mengatur logika bisnis untuk User.
        
        - Menyediakan fungsi login, validasi user, atau pengelolaan data user.
        
        - Intinya penghubung antara data (User) dengan tampilan (MenuView).
      
    ---
    
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

8. MenuView.java

    - Class untuk menampilkan menu interaktif ke pengguna.
    
    - Mengatur input/output di console (misalnya pilihan menu, daftar tanaman, dll).
    
    - Jadi antarmuka sederhana untuk menjalankan semua fitur dari service.

---
