package PS1no1;

public class Mahasiswa1 {


 String nama;
 String nim;
 String jurusan;
 double ipk;

 public Mahasiswa1(String nama, String nim, String jurusan, double ipk) {
	 
     this.nama    = nama;
     this.nim     = nim;
     this.jurusan = jurusan;
     this.ipk     = ipk;
 }


 public void tampilkanInfo() {
     System.out.println("Nama    : " + nama);
     System.out.println("NIM     : " + nim);
     System.out.println("Jurusan : " + jurusan);
     System.out.println("IPK     : " + ipk);
     System.out.println(); 
 }
}