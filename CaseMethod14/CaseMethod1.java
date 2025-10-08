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

    // Menghitung Nilai Akhir Mata Kuliah 
        double nilaiAkhir1 = (double) (0.3 * uts1 + 0.4 * uas1 + 0.3 * tugas1);
        double nilaiAkhir2 = (double) (0.3 * uts2 + 0.4 * uas2 + 0.3 * tugas2);

        String huruf1 = getNilaiHuruf(nilaiAkhir1);
        String status1 = nilaiAkhir1 >= 79 ? "LULUS" : "TIDAK LULUS";
        String huruf2 = getNilaiHuruf(nilaiAkhir2);
        String status2 = nilaiAkhir2 >= 79 ? "LULUS" : "TIDAK LULUS";

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

        System.out.println("Memunculkan Nilai Akhir:");
        System.out.println("Nilai Akhir Mata Kuliah 1: " + nilaiAkhir1);
        System.out.println("Nilai Akhir Mata Kuliah 2: " + nilaiAkhir2);
        System.out.println("Nilai Huruf Mata Kuliah 1: " + huruf1);
        System.out.println("Status Mata Kuliah 1: " + status1);
        System.out.println("Nilai Huruf Mata Kuliah 2: " + huruf2);
        System.out.println("Status Mata Kuliah 2: " + status2);    

        
     sc.close();
    } 
    // Method untuk mengubah nilai akhir menjadi nilai huruf
    public static String getNilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 85) {
            return "A";
        } else if (nilaiAkhir >= 80) {
            return "A-";
        } else if (nilaiAkhir >= 75) {
            return "B+";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 65) {
            return "B-";
        } else if (nilaiAkhir >= 60) {
            return "C+";
        } else if (nilaiAkhir >= 55) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}     


