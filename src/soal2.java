//Cyndi Cyahti Manullang - 12S25040
//Dewi Natasya Sitorus - 12S25042
import java.util.*;
import java.lang.Math;

public class soal2UAS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a;

        n = Integer.parseInt(input.nextLine());
        String[] nama = new String[n], status = new String[n];
        int[] stok = new int[n], terjual = new int[n], sisa = new int[n];

        for (a = 0; a <= n - 1; a++) {
            nama[a] = input.nextLine();
            stok[a] = Integer.parseInt(input.nextLine());
            if (stok[a] < 0) {
                System.out.println("INVALID");
                System.out.println("STOK MINIMAL 0");
                stok[a] = Integer.parseInt(input.nextLine());
            }
            terjual[a] = Integer.parseInt(input.nextLine());
            if (terjual[a] > stok[a]) {
                System.out.println("INVALID");
                System.out.println("TERJUAL TIDAK BOLEH LEBIH BANYAK DARI STOK");
                terjual[a] = Integer.parseInt(input.nextLine());
            }
            sisa[a] = stok[a] - terjual[a];
        }
        for (a = 0; a <= n - 1; a++) {
            if (sisa[a] == 0) {
                status[a] = "Habis, segera restok!";
            } else {
                if (sisa[a] < 5) {
                    status[a] = "Stok menipis.";
                } else {
                    if (sisa[a] >= 5) {
                        status[a] = "Stok aman.";
                    }
                }
            }
        }
        System.out.println("Nama    " + "StokAwal  " + "Terjual  " + "Sisa   " + "Status   ");
        System.out.println(nama[0] + "    " + stok[0] + "  " + terjual[0] + "  " + sisa[0] + "   " + status[0] + "   ");
        System.out.println(nama[1] + "    " + stok[1] + "  " + terjual[1] + "  " + sisa[1] + "   " + status[1] + "   ");
        System.out.println(nama[2] + "    " + stok[2] + "  " + terjual[2] + "  " + sisa[2] + "   " + status[2] + "   ");
        System.out.println(nama[3] + "    " + stok[3] + "  " + terjual[3] + "  " + sisa[3] + "   " + status[3] + "   ");
    }
}
