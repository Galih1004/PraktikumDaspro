import java.util.Scanner;

public class Tugas1J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cetak KRS Siakad ===");
        System.out.print("Apakah UKT sudah lunas (true/false)? ");
        boolean lunas = sc.nextBoolean();

        // IF-ELSE
        if (lunas) {
            System.out.println("Pembayaran UKT telah terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("UKT belum lunas, silakan lunasi UKT terlebih dahulu");
        }

        System.out.println("---- Versi Ternary Operator ----");

        // Ternary Operator
        System.out.println(
            lunas 
            ? "Pembayaran UKT telah terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
            : "UKT belum lunas, silakan lunasi UKT terlebih dahulu"
        );

        sc.close();
    }
}
