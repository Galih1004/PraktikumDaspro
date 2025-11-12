import java.util.Scanner;

public class Tugas2J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Masukkan Angka ---");
        int angka = sc.nextInt();
           if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap");
              } else {
            System.out.println(angka + " adalah bilangan ganjil");
              }
            
            
        
        sc.close();
    }
    
}