Pertanyaan 3.2.3

Tidak. Sebuah class tidak harus memiliki keduanya sekaligus. Class bisa hanya memiliki atribut saja (seperti class Mahasiswa pada percobaan ini), hanya method saja, atau kombinasi keduanya. Yang terpenting adalah class tersebut valid secara sintaks Java. Array of object hanya membutuhkan class sebagai tipe datanya, tidak peduli apakah class tersebut punya method atau tidak.
Kode ini mendeklarasikan dan menginstansiasi sebuah array bertipe Mahasiswa dengan nama arrayOfMahasiswa yang berkapasitas 3 elemen. Namun pada tahap ini, setiap elemen array masih bernilai null — objek Mahasiswa-nya belum dibuat. Array hanya menyiapkan "wadah" untuk 3 referensi objek bertipe Mahasiswa.
Class Mahasiswa tidak memiliki konstruktor yang ditulis secara eksplisit. Namun, Java secara otomatis menyediakan default constructor (konstruktor tanpa parameter) pada setiap class yang tidak mendefinisikan konstruktor sendiri. Itulah mengapa pemanggilan new Mahasiswa() tetap bisa dilakukan — Java menggunakan default constructor bawaan tersebut untuk membuat objek baru.
Kode ini melakukan dua hal:
Membuat objek Mahasiswa baru menggunakan default constructor, lalu menyimpan referensinya ke elemen indeks ke-0 dari array arrayOfMahasiswa.
Mengisi nilai atribut dari objek tersebut — nim, nama, kelas, dan ipk — secara langsung melalui akses atribut publik (dot notation).
Pemisahan ini menerapkan prinsip Separation of Concerns dalam OOP:
Mahasiswa berperan sebagai model/blueprint — hanya mendefinisikan struktur data (atribut) dari entitas Mahasiswa.
MahasiswaDemo berperan sebagai driver/main class — bertugas menjalankan program, membuat objek, mengisi data, dan menampilkan output. Dengan pemisahan ini, kode menjadi lebih terorganisir, mudah dipelihara, dan dapat digunakan kembali (class Mahasiswa bisa dipakai di program lain tanpa harus mengubah logika utama).