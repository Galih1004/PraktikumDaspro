
import java.util.Scanner;

public class Tugas3J9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

            System.out.print("Masukkan menu yang dicari =");
            String menuDicari = sc.nextLine();
            int index = -1;

            for (int i = 0; i < menu.length; i++) {
                if (menuDicari.equalsIgnoreCase(menu[i])) {
                    index = i;
                    System.out.println("Menu yang anda cari tersedia");
                    System.out.println("Menu yang dicari adalah: " + menu[index]);
                    break;
                }
            }
            if (index == -1) {
                System.out.println("Menu tidak ditemukan");
            }
        sc.close();
    }
}
