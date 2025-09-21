## Irvan Alif
## 2409116071
## kelas B


---

Project ini bertema aplikasi manajemen data tanaman dan user sederhana berbasis console di Java. Program ini dibuat untuk latihan konsep OOP, di mana ada class untuk merepresentasikan tanaman dan user, lalu ada service untuk mengelola datanya. Semua fitur dijalankan lewat menu interaktif di console, seperti menambah, melihat, atau menghapus data. Aplikasi ini bisa jadi contoh dasar sistem manajemen data sederhana yang nantinya bisa dikembangkan lebih lanjut.

---

<img width="468" height="474" alt="image" src="https://github.com/user-attachments/assets/4b4e0182-18a2-414c-b151-ffea3b12a3c8" />



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

Program Sistem Manajemen Tanaman Hidroponik ini awalnya nunjukin dua pilihan, login atau keluar. Kalau pilih login, kita diminta masukin username sama password. Di contoh ini dipakai username admin dan password admin123. Karena bener, sistem langsung ngasih info kalau login berhasil dan nyambut kita sebagai Administrator.

---
2.Login sebagai user

<img width="601" height="204" alt="image" src="https://github.com/user-attachments/assets/4536de61-ed60-458e-96be-2835a260c408" />

Di tampilan ini, program juga nunjukin menu awal dengan pilihan login atau keluar. Waktu pilih login, pengguna masukin username user sama password user123. Karena data cocok, sistem langsung nerima login dan nyapa kita sebagai Regular User.

---

### Menu user

---
3.Tambah tanaman

<img width="908" height="726" alt="image" src="https://github.com/user-attachments/assets/7a59d47b-f7b8-4d60-af25-1d3139754995" />


Di bagian ini, pengguna berhasil login sebagai Regular User dan memilih menu Tambah Tanaman. Pengguna kemudian mengisi data tanaman baru mulai dari nama tanaman (bayam), jenis tanaman (sayuran), sistem hidroponik yang dipakai (NFT), tanggal tanam, status tanaman (bibit), pH air, sampai catatan tambahan. Karena tanaman ini termasuk kategori tanaman cepat (jenis sayuran dengan sistem hidroponik NFT), maka sistem otomatis menambahkan informasi tambahan di bagian catatan dengan format: "(Sayuran sistem NFT – cepat tumbuh)". Setelah semua data dimasukkan, sistem memberikan konfirmasi bahwa tanaman berhasil ditambahkan ke database. Contoh lain, saat pengguna menambahkan tanaman kangkung dengan sistem hidroponik Wick, data tetap berhasil disimpan, tetapi karena tidak memenuhi kriteria tanaman cepat, catatan hanya menampilkan isi yang dimasukkan pengguna tanpa tambahan otomatis.

---
4. Melihat semua tanaman dalam tabel
   
<img width="1328" height="103" alt="image" src="https://github.com/user-attachments/assets/28861ac0-ad17-4d04-9752-a179f9ced136" />


Tampilan ini nunjukin saat pengguna milih menu Lihat Semua Tanaman. Sistem langsung nampilin daftar tanaman yang udah ditambah sebelumnya, lengkap dengan detailnya. Contohnya ada tanaman bayam dengan jenis sayuran, sistem hidroponik NFT, tanggal tanam 12/2/2025, status Bibit, pH air 12, dan catatan efgggdgd. Karena tanaman ini termasuk kategori tanaman cepat (sayuran dengan sistem NFT atau DWC), maka sistem otomatis menambahkan keterangan tambahan pada catatan: "(Sayuran sistem NFT – cepat tumbuh)". Sedangkan tanaman kangkung dengan sistem hidroponik Wick tidak termasuk kategori cepat, sehingga catatannya hanya menampilkan isi yang dimasukkan pengguna, yaitu oke.

---
5. update tanaman

<img width="587" height="520" alt="image" src="https://github.com/user-attachments/assets/1dd9ef7b-9790-4e0c-b803-d6a647fabe0a" />

Tampilan ini nunjukin saat pengguna milih menu **Update Tanaman**. Sistem minta nomor tanaman yang mau diubah, lalu pengguna masukin data baru untuk memperbarui informasi. Contohnya, tanaman dengan nomor 1 diupdate jadi nama **baymmmmm** dengan jenis **sayur**, sistem hidroponik **NFT**, tanggal tanam **11/9/2024**, status **tumbuh**, pH air **15**, dan catatan **okeeee**. Setelah semua data baru dimasukin, sistem nampilin konfirmasi kalau tanaman berhasil diupdate.


---
6. Mencari tanaman

<img width="513" height="556" alt="image" src="https://github.com/user-attachments/assets/82b9f1de-56f7-4a9e-99da-b66cf12965b0" />

Tampilan ini nunjukin saat pengguna milih menu Cari Tanaman. Sistem ngasih pilihan pencarian berdasarkan nama, jenis, atau status. Pada percobaan pertama, pengguna pilih pencarian berdasarkan nama dan masukin keyword bayammm, tapi hasilnya kosong karena data dengan keyword itu nggak ditemukan. Setelah kembali ke menu utama, pengguna coba lagi cari tanaman dengan cara yang sama, kali ini keyword yang dimasukin baymmmmm. Proses ini memperlihatkan kalau sistem hanya bakal menampilkan data kalau keyword yang dimasukin sesuai persis dengan data yang tersimpan.

---
7. Statistik tanaman

<img width="676" height="677" alt="image" src="https://github.com/user-attachments/assets/48dfdeb5-98b6-4cff-823b-4b7b77ab1e4a" />

Tampilan ini nunjukin saat pengguna milih menu Statistik Tanaman. Sistem langsung nampilin jumlah total tanaman yang tercatat, yaitu 1 tanaman. Tapi, kalau dilihat dari detailnya, data statistik berdasarkan jenis (sayuran, buah, herbal, dan tanaman hias) maupun berdasarkan status (bibit, tumbuh, berbunga, berbuah, panen, mati) semuanya masih bernilai 0. Hal ini berarti data tanaman yang ada belum terklasifikasi dengan benar ke dalam kategori jenis maupun status, jadi meskipun totalnya ada, statistik rinciannya belum muncul.

---
8. Menghapus tanaman di menu user

<img width="960" height="430" alt="image" src="https://github.com/user-attachments/assets/3fc83b53-b674-44ef-817c-a74f644c9072" />

Tampilan ini nunjukin saat pengguna dengan role Regular User coba pilih menu Hapus Tanaman. Begitu opsi nomor 4 dipilih, sistem langsung nampilin pesan Akses ditolak! Hanya admin yang dapat menghapus data. Artinya, fitur hapus tanaman dibatasi khusus untuk admin saja, sedangkan user biasa nggak punya izin buat melakukan penghapusan data.

---
9. Keluar

<img width="798" height="417" alt="image" src="https://github.com/user-attachments/assets/42a6f845-5260-4f35-b04e-6a97e3668561" />

Tampilan ini nunjukin saat pengguna dengan role Regular User milih menu Logout. Setelah memilih opsi nomor 8, sistem langsung nampilin pesan Logout berhasil!, yang berarti sesi pengguna sudah diakhiri dan akses ke dalam sistem ditutup(tampilan ini juga sama dengan admin).

---
10. Menghapus tanaman di menu admin

<img width="843" height="456" alt="image" src="https://github.com/user-attachments/assets/64d22d49-3f76-47c2-82e3-7d3811b0d1f5" />


Tampilan ini nunjukin saat pengguna dengan role Administrator (admin) milih menu Hapus Tanaman. Setelah memilih opsi nomor 4, sistem minta nomor tanaman yang mau dihapus, lalu admin masukin angka 1. Sistem kemudian nampilin pesan Tanaman berhasil dihapus!, yang berarti data tanaman dengan nomor tersebut sudah berhasil dihapus dari sistem. Berbeda dengan user biasa, admin punya akses penuh untuk melakukan penghapusan data.

---








