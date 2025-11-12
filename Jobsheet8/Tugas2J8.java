import java.util.Scanner;

public class Tugas2J8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] CABOR = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"}; 
     int jumlahAtlitPerCabor = 5;
     
     System.out.println("==== Pendaftaran Atlit Porseni ====");
        System.out.print("Masukkan jumlah politeknik yang daftar :");
        int jmlPoliteknik = sc.nextInt();
        sc.nextLine(); 

        System.out.println ("\n--- Data Atlit ---");

        int i = 1;
        while (i <= jmlPoliteknik) {
            System.out.print("Masukkan nama politeknik ke-" + i + ": ");
            String namaPoliteknik = sc.nextLine();
            for (int j = 0; j < CABOR.length; j++) {
                String namaCabor = CABOR[j];
                System.out.println("Cabang Olahraga: " + namaCabor);
                for (int k = 1; k <= jumlahAtlitPerCabor; k++) {
                    System.out.print("Masukkan nama atlit ke-" + k + ": ");
                    String namaAtlit = sc.nextLine();
                    System.out.println("Atlit ke-" + k + " dari " + namaPoliteknik + " untuk cabang " + namaCabor + " adalah " + namaAtlit);

                 }
            }
        }
        i++;
        sc.close();
    }
}
