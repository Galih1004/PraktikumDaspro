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
        String status1 = nilaiAkhir1 >= 60 ? "LULUS" : "TIDAK LULUS";
        String huruf2 = getNilaiHuruf(nilaiAkhir2);
        String status2 = nilaiAkhir2 >= 60 ? "LULUS" : "TIDAK LULUS";

    // Menghitung Rata Rata dan Status Semester
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        String statusSemester;
        String pesan = ".";
            if (nilaiAkhir1 < 60 || nilaiAkhir2 < 60) {
    
                    statusSemester = "TIDAK LULUS";
                } else if (rataRata >= 70) {
                    statusSemester = "LULUS";
            } else {
                    statusSemester = "TIDAK LULUS";
                    
            }

    // Output Data Mahasiswa dan Hasil Penilaian
        System.out.println("\n=== Hasil Mahasiswa ===");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println();
        System.out.println("Mata Kuliah 1: Algoritma Dan Pemrograman");
        System.out.println("Nilai UTS: " + uts1);
        System.out.println("Nilai UAS: " + uas1);
        System.out.println("Nilai Tugas: " + tugas1);
        System.out.println();
        System.out.println("Mata Kuliah 2: Struktur Data");
        System.out.println("Nilai UTS: " + uts2);
        System.out.println("Nilai UAS: " + uas2);
        System.out.println("Nilai Tugas: " + tugas2);
        System.out.println();
        System.out.println("=============== Hasil Penilaian Akademik ===============");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println();
        System.out.println("Mata kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\t\tStatus");
        System.out.println("=============================================================================================================");
        System.out.println("Algoritma Dan Pemrograman:\t" + uts1 + "\t" + uas1 + "\t" + tugas1 + "\t" + nilaiAkhir1 + "\t\t" + huruf1 + "\t\t\t" + status1);
        System.out.println("Struktur Data:\t\t\t" + uts2 + "\t" + uas2 + "\t" + tugas2 + "\t" + nilaiAkhir2 + "\t\t" + huruf2 + "\t\t\t" + status2);
        System.out.println();
        System.out.println("Rata-rata Nilai Akhir:" + rataRata );
        System.out.println("Status Semester: " + statusSemester + pesan );

     sc.close();
    } 
    // Method untuk menyingkronkan nilai akhir dan nilai huruf menggunakan if else dan nested if
    public static String getNilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            return "A";
            } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
                return "B+";
                } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
                    return "B";
                    } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
                        return "C+";
                        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
                            return "C";
                             } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
                                return "D";
                                } else {
                                    return "E";
                                    }
    }
}     
