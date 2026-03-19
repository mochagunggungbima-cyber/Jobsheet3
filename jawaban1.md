  2. MahasiswaDemo berperan sebagai driver/main class — bertugas menjalankan program, membuat objek, mengisi data, dan menampilkan output.
Dengan pemisahan ini, kode menjadi lebih terorganisir, mudah dipelihara, dan dapat digunakan kembali (class Mahasiswa bisa dipakai di program lain tanpa harus mengubah logika utama).

Pertanyaan 3.3.3
1.  Done.
2. new Mahasiswa09[3] hanya membuat array dengan 3 slot kosong (null). Setiap elemennya belum menunjuk ke objek manapun, sehingga saat langsung mengakses .nim akan error karena objeknya belum ada.