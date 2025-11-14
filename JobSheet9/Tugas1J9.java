import java.util.Scanner;

public class Tugas1J9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = scanner.nextInt();
        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        double rataRata = (double) total / jumlah;

        System.out.println("\nNilai para mahasiswa: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("\nNilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + rataRata);

        scanner.close();
    }
}
