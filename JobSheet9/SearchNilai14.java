
import java.util.Scanner;

public class SearchNilai14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int key;
        int hasil = 0;

        System.out.print("Isi nilai pada array adalah:");
        int jumlahNilai = sc.nextInt();
        int[] arrNilai = new int[jumlahNilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari: ");
        key = sc.nextInt();
        
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        if (key == arrNilai[hasil]) { 
            System.out.println("Nilai " + key + " ditemukan pada nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam array");
        } 
        sc.close();
    } 
}
