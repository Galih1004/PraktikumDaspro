
import java.util.Scanner;

public class ArrayRataNilai14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        int nilaiMhs[] = new int[jumlahMhs];
        double total = 0;
        double rata2;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i= 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        
        rata2 = total / nilaiMhs.length;
        System.out.println();
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rata2);
        System.out.println();
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);

        
        sc.close();
    }
}
