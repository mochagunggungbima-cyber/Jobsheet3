import java.util.Scanner;

public class MataKuliahDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah12[] arrayOfMataKuliah12 = new MataKuliah12[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i<3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));
            System.out.print("Kode: ");
            kode = sc.nextLine();   
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("SKS: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMataKuliah12[i] = new MataKuliah12(kode, nama, sks, jumlahJam);

        }
    }
}