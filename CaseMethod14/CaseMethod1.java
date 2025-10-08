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

        // Output Data Mahasiswa
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa: " + nim);
        
     sc.close();
    } 
}