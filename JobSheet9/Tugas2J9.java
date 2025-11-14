import java.util.Scanner;

public class Tugas2J9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman pesanan ke-" + (i+1) + ": ");
            namaPesanan[i] = scanner.nextLine();
            scanner.nextLine();
        } 
            for (int i = 0; i < jumlahPesanan; i++) {
                System.out.print("Masukkan harga pesanan " + namaPesanan[i] + ": Rp ");
                hargaPesanan[i] = scanner.nextInt();
        }
    
        int totalBiaya = 0;
        for (int harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i+1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total biaya semua pesanan: Rp " + totalBiaya);

        scanner.close();
        
    }
}