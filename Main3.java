package PS1no3;

import java.util.Scanner;

public class Main3 {

 public static void main(String[] args) {

     Mahasiswa3[] daftar = new Mahasiswa3[5];

     daftar[0] = new Mahasiswa3("Andi Pratama",   "2440001", "Teknik Informatika", 3.75);
     daftar[1] = new Mahasiswa3("Budi Santoso",   "2440002", "Sistem Informasi",   3.40);
     daftar[2] = new Mahasiswa3("Citra Lestari",  "2440003", "Teknik Informatika", 3.90);
     daftar[3] = new Mahasiswa3("Joni Suhartono", "2440004", "Teknik Industri",    3.00);
     daftar[4] = new Mahasiswa3("Bulan Suci",     "2440005", "Akuntansi",          3.20);

     System.out.println("=== Data Mahasiswa ===");
     System.out.println();

     for (int i = 0; i < daftar.length; i++) {
         daftar[i].tampilkanInfo();
         System.out.println("Status  : " + daftar[i].cekKelulusan());
         System.out.println("Predikat: " + daftar[i].hitungPredikat()); // method baru soal 3
         System.out.println(); 
     }

     Scanner scanner = new Scanner(System.in);

     System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
     String nimCari = scanner.nextLine();

     System.out.print("Masukkan IPK baru: ");
     double ipkBaru = scanner.nextDouble();

     System.out.println();

     boolean ditemukan = false;

     for (int i = 0; i < daftar.length; i++) {
         if (daftar[i].nim.equals(nimCari)) {
             daftar[i].updateIpk(ipkBaru);
             ditemukan = true;
             break;
         }
     }

     if (!ditemukan) {
         System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
     }

     scanner.close();
 }
}