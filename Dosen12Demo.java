import java.util.Scanner;

public class  Dosen12Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen12[] arrayOfDosen = new Dosen12[jumlah];

        // FOR loop untuk input
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true=Pria/false=Wanita): ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia          : ");
            usia = Integer.parseInt(sc.nextLine());
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen12(kode, nama, jenisKelamin, usia);
        }

        // FOREACH loop untuk cetak
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

        DataDosen12 dataDosen = new DataDosen12();

    System.out.println("===== DATA SEMUA DOSEN =====");
    dataDosen.dataSemuaDosen(arrayOfDosen);

    System.out.println("===== JUMLAH DOSEN PER JENIS KELAMIN =====");
    dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);

    System.out.println("===== RERATA USIA PER JENIS KELAMIN =====");
    dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

    System.out.println("===== DOSEN PALING TUA =====");
    dataDosen.infoDosenPalingTua(arrayOfDosen);

    System.out.println("===== DOSEN PALING MUDA =====");
    dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}