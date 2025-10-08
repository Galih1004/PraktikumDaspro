import java.util.Scanner;

public class CaseMethod1 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Input Data Mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();

    // Input Nilai Mata Kuliah 1
        System.out.println("=== Mata Kuliah 1 (Algoritma Dan Pemrograman) ===");
        System.out.print("Masukkan Nilai UTS anda: ");
        int uts1 = sc.nextInt();
        System.out.print("Masukkan Nilai UAS anda: ");
        int uas1 = sc.nextInt();
        System.out.print("Masukkan Nilai Tugas anda: ");
        int tugas1 = sc.nextInt();

    // Input Nilai Mata Kuliah 2
        System.out.println("=== Mata Kuliah 2 (Struktur Data) ===");
        System.out.print("Masukkan Nilai UTS anda: ");
        int uts2 = sc.nextInt();
        System.out.print("Masukkan Nilai UAS anda: ");
        int uas2 = sc.nextInt();
        System.out.print("Masukkan Nilai Tugas anda: ");
        int tugas2 = sc.nextInt();


    // Output Data Mahasiswa, Nilai Mata Kuliah 1
        System.out.println("\n=== Hasil Mahasiswa ===");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa: " + nim);

        System.out.println("Mata Kuliah 1: Algoritma Dan Pemrograman");
        System.out.println("Nilai UTS: " + uts1);
        System.out.println("Nilai UAS: " + uas1);
        System.out.println("Nilai Tugas: " + tugas1);

        System.out.println("Mata Kuliah 2: Struktur Data");
        System.out.println("Nilai UTS: " + uts2);
        System.out.println("Nilai UAS: " + uas2);
        System.out.println("Nilai Tugas: " + tugas2);

        
     sc.close();
    } 
}