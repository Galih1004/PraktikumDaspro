Pertanyaan Percobaan 1 ;

1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan 
operator relasional? 
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya? 
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka 
terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi 
program tersebut dengan menambahkan struktur ELSE!
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi 
Percobaan 1” 

Pertanyaan Percobaan 2 ;

1. Apa fungsi dari sintaks break? 
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE? 
3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil 
transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah 
dibuat ke dalam bentuk IF-ELSE IF-ELSE.
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi 
Percobaan 2”  

Pertanyaan Percobaan 3 ;

1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? 
Mengapa demikian? 
2. Jelaskan maksud dari potongan kode berikut! 
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara 
runtut untuk semua kondisi! 

Jawaban Pertanyaan Percobaan 1 ;

1. karena struktur IF menggunakan tipe data boolean
2. akan langsung muncul pesan pada "else" kode program
3. else { System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu"); }
4. have done

Jawaban Pertanyaan Percobaan 2;

1. menghentikan program pada switch-case
2. syntax default memiliki fungsi yang sama seperti else pada IF-ELSE
3. sudah
4. sudah

Jawaban Pertanyaan Percobaan 3;

1. Jika kita memilih "Tidak" pada pertanyaan "Apakah mahasiswa bebas kompen (Ya/Tidak)", maka program akan langsung menampilkan pesan "Mahasiswa tidak bebas kompen" 
2. Jika bimbingan p1 lebih dari sama dengan 8 dan bimbingan p2 lebih dari sama dengan 4 maka
3. Alur pemeriksaan syarat mahasiswa dimulai dari pengecekan status bebas kompen, jika mahasiswa tidak bebas kompen maka program langsung berhenti dengan menampilkan pesan “Mahasiswa tidak bebas kompen”, tetapi jika mahasiswa bebas kompen maka dilanjutkan dengan pemeriksaan jumlah bimbingan pembimbing 1 dan pembimbing 2. Syarat yang harus dipenuhi adalah pembimbing 1 minimal 8 kali bimbingan dan pembimbing 2 minimal 4 kali bimbingan. Dari sini terdapat empat kemungkinan hasil, yaitu: jika pembimbing 1 ≥ 8 dan pembimbing 2 ≥ 4 maka semua syarat terpenuhi dan mahasiswa diperbolehkan mengikuti ujian skripsi, jika pembimbing 1 < 8 dan pembimbing 2 < 4 maka syarat keduanya belum terpenuhi, jika pembimbing 1 < 8 sedangkan pembimbing 2 ≥ 4 maka hanya syarat pembimbing 1 yang belum terpenuhi, dan jika pembimbing 1 ≥ 8 tetapi pembimbing 2 < 4 maka hanya syarat pembimbing 2 yang belum terpenuhi. Setelah menampilkan salah satu hasil tersebut, program selesai dijalankan.
