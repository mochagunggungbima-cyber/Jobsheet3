public class DataDosen12 {

    // a. Menampilkan data semua dosen
    public void dataSemuaDosen(Dosen12[] arrayOfDosen) {
        int no = 1;
        for (Dosen12 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("------------------------------");
            no++;
        }
    }

    // b. Menampilkan jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria  : " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
        System.out.println("------------------------------");
    }

    // c. Menampilkan rata-rata usia dosen per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        double rerataUsiaPria = jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0;
        double rerataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;
        System.out.println("Rata-rata Usia Dosen Pria  : " + rerataUsiaPria);
        System.out.println("Rata-rata Usia Dosen Wanita: " + rerataUsiaWanita);
        System.out.println("------------------------------");
    }

    // d. Menampilkan data dosen paling tua
    public void infoDosenPalingTua(Dosen12[] arrayOfDosen) {
        Dosen12 palingTua = arrayOfDosen[0];
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia > palingTua.usia) {
                palingTua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        System.out.println("Kode          : " + palingTua.kode);
        System.out.println("Nama          : " + palingTua.nama);
        System.out.println("Jenis Kelamin : " + (palingTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + palingTua.usia);
        System.out.println("------------------------------");
    }

    // e. Menampilkan data dosen paling muda
    public void infoDosenPalingMuda(Dosen12[] arrayOfDosen) {
        Dosen12 palingMuda = arrayOfDosen[0];
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia < palingMuda.usia) {
                palingMuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        System.out.println("Kode          : " + palingMuda.kode);
        System.out.println("Nama          : " + palingMuda.nama);
        System.out.println("Jenis Kelamin : " + (palingMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + palingMuda.usia);
        System.out.println("------------------------------");
    }
}