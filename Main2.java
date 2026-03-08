package PS1no2;

import java.util.Scanner; 

public class Main2 {

 public static void main(String[] args) {


     Mahasiswa2[] daftar = new Mahasiswa2[5];

     daftar[0] = new Mahasiswa2("Andi Pratama",   "2440001", "Teknik Informatika", 3.75);
     daftar[1] = new Mahasiswa2("Budi Santoso",   "2440002", "Sistem Informasi",   3.40);
     daftar[2] = new Mahasiswa2("Citra Lestari",  "2440003", "Teknik Informatika", 3.90);
     daftar[3] = new Mahasiswa2("Joni Suhartono", "2440004", "Teknik Industri",    3.00);
     daftar[4] = new Mahasiswa2("Bulan Suci",     "2440005", "Akuntansi",          3.20);

     System.out.println("=== Data Mahasiswa ===");
     System.out.println();

     for (int i = 0; i < daftar.length; i++) {
         daftar[i].tampilkanInfo();
         System.out.println("Status  : " + daftar[i].cekKelulusan());
         System.out.println(); // baris kosong pemisah
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