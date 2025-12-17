//Cyndi Cyahti Manullang - 12S25040
//Dewi Natasya Sitorus - 12S25042
import java.util.*;
import java.lang.Math;

public class soal4UAS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a;

        n = Integer.parseInt(input.nextLine());
        int[] shift = new int[n];
        String[] nama = new String[n];
        int total, max, min;
        String nm, nmk;
        double rt;

        total = 0;
        for (a = 0; a <= n - 1; a++) {
            nama[a] = input.nextLine();
            shift[a] = Integer.parseInt(input.nextLine());
            if (shift[a] < 0) {
                System.out.println("INVALID");
                shift[a] = Integer.parseInt(input.nextLine());
            }
            total = total + shift[a];
        }
        max = shift[0];
        for (a = 0; a <= n - 1; a++) {
            if (max < shift[a]) {
                max = shift[a];
                nm = nama[a];
            }
        }
        min = shift[0];
        for (a = 0; a <= n - 1; a++) {
            if (min > shift[a]) {
                min = shift[a];
                nmk = nama[a];
            }
        }
        for (a = 0; a <= n - 1; a++) {
            System.out.println(nama[a] + " = " + shift[a]);
        }
        rt = (double) total / n;
        System.out.println("Total shift = " + total);
        System.out.println("Rata-rata = " + rt);
        System.out.println("Shift terbanyak: " + nm + " (" + max + ")");
        System.out.println("Shift tersedikit: " + nmk + " (" + min + ")");
        if (rt >= 5) {
            System.out.println("Shift terlalu padat.");
        } else {
            if (rt >= 3 && rt < 5) {
                System.out.println("Distribusi tidak merata, beberapa asisten terbebani.");
            } else {
                if (rt < 3) {
                    System.out.println("Distribusi tidak merata.");
                }
            }
        }
    }
}
