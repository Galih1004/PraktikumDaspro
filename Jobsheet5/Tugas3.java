import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Dosen = "dosen", Mahasiswa = "mahasiswa";
        
        System.out.print("Masukkan Jenis User (Mahasiswa/Dosen): ");
        String user = sc.nextLine().toLowerCase();

            if (user.equals(Dosen)) {
                System.out.println("Akses Dosen Diberikan");
            } else if (user.equals(Mahasiswa)) {
                System.out.print("Masukkan jumlah SKS yang diambil: ");
                int sks = sc.nextInt();
                if (sks >= 12) {
                    System.out.println("Akses Wifi diberikan kepada mahasiswa");
                } else {
                    System.out.println("Akses Wifi tidak diberikan kepada mahasiswa karena jumlah SKS kurang dari 12");
                }
            } else {
                System.out.println("User tidak valid / Akses ditolak");
            }
        sc.close();
    }
    
}
