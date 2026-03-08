package PS1no3;


public class Mahasiswa3 {

 String nama;
 String nim;
 String jurusan;
 private double ipk; 

 public Mahasiswa3(String nama, String nim, String jurusan, double ipk) {
     this.nama    = nama;
     this.nim     = nim;
     this.jurusan = jurusan;
     this.ipk     = ipk;
 }

 public double getIpk() {
     return ipk;
 }

 public void setIpk(double ipk) {
     this.ipk = ipk;
 }

 public void tampilkanInfo() {
     System.out.println("Nama    : " + nama);
     System.out.println("NIM     : " + nim);
     System.out.println("Jurusan : " + jurusan);
     System.out.println("IPK     : " + getIpk());
 }

 public String cekKelulusan() {
     if (getIpk() >= 3.00) {
         return "Lulus";
     } else {
         return "Belum Lulus";
     }
 }

 public String hitungPredikat() {
     if (getIpk() >= 3.75) {
         return "Dengan Pujian";
     } else if (getIpk() >= 3.50) {
         return "Sangat Memuaskan";
     } else if (getIpk() >= 3.00) {
         return "Memuaskan";
     } else {
         return "Perlu Perbaikan";
     }
 }

 public void updateIpk(double ipkBaru) {
     setIpk(ipkBaru);

     System.out.println("Data berhasil diperbarui!");
     System.out.println();
     System.out.println("=== Data Mahasiswa ===");
     tampilkanInfo();
     System.out.println("Status  : " + cekKelulusan());
     System.out.println("Predikat: " + hitungPredikat());
 }
}