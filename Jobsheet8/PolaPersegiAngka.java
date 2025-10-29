import java.util.Scanner;

public class PolaPersegiAngka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        do {
            System.out.print("Masukkan nilai N (minimal 3): ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N < 3) {
                    System.out.println("Nilai N harus minimal 3. Silakan coba lagi.");
                }
            } else {
                System.out.println("Input tidak valid. Masukkan bilangan bulat.");
                scanner.next();
                N = 0; 
            }
        } while (N < 3);

        System.out.println("\n--- Tampilan untuk N = " + N + " ---");

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // Syarat untuk mencetak angka N
                // Angka N dicetak jika:
                // 1. i adalah baris pertama (i == 1) ATAU
                // 2. i adalah baris terakhir (i == N) ATAU
                // 3. j adalah kolom pertama (j == 1) ATAU
                // 4. j adalah kolom terakhir (j == N)
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}