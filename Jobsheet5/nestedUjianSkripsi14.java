import java.util.Scanner;


public class nestedUjianSkripsi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.println("---Syarat Ujian Skripsi---");
        System.out.print("Apakah mahasiswa bebas kompen (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();

        if (!bebasKompen.equalsIgnoreCase("Ya")) {
              pesan = "Mahasiswa tidak bebas kompen.";
                System.out.println(pesan);
              sc.close();
              return;
            

        }
        System.out.print("Jumlah bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Jumlah bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

   
            if (bimbinganP1 >= 8 && bimbinganP2  >= 4)  {
                pesan = "Semua Syarat terpenuhi, silakan mengikuti ujian skripsi.";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Syarat bimbingan pembimbing 1 dan pembimbing 2 belum terpenuhi.";
            } else if (bimbinganP1 < 8) {
                pesan = "Syarat bimbingan pembimbing 1 belum terpenuhi.";
            } else {
                pesan = "Syarat bimbingan pembimbing 2 belum terpenuhi.";
            }
        System.out.println(pesan);
        sc.close();
    }
}