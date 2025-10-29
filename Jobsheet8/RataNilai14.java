import java.util.Scanner;

public class RataNilai14 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int i,j;
            float nilai,totalNilai,rataNilai;

            for (i = 1; i <= 5; i++) {
                System.out.println ("Input mahasiswa ke-" + i + " : ");
                totalNilai = 0;
                j= 1;
                while (j <= 5) {
                    System.out.print ("Nilai mata kuliah ke-" + j + " : ");
                    nilai = input.nextFloat();
                    totalNilai += nilai;
                    j++;
                }
                rataNilai = totalNilai / 5;
                System.out.println ("Rata-rata nilai mahasiswa ke-" + i + " : " + rataNilai);
            }
        }
    }
}
