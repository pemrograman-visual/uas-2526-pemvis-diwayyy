//Cyndi Cyahti Manullang - 12S25040
//Dewi Natasya Sitorus - 12S25042
import java.util.*;
import java.lang.Math;

public class SOAL1UAS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a, rr;

        n = Integer.parseInt(input.nextLine());
        int[] reviewer = new int[n];
        int[] rating = new int[n];
        double rt, max, min, total;

        total = 0;
        for (a = 0; a <= n - 1; a++) {
            rating[a] = Integer.parseInt(input.nextLine());
            if (rating[a] > 5) {
                System.out.println("INVALID");
                System.out.println("silahkan input ulang");
                rating[a] = Integer.parseInt(input.nextLine());
            } else {
                if (rating[a] < 0) {
                    System.out.println("INVALID");
                    System.out.println("silahkan input ulang");
                    rating[a] = Integer.parseInt(input.nextLine());
                }
            }
            total = total + rating[a];
        }
        rt = total / n;
        max = rating[0];
        for (a = 0; a <= n - 1; a++) {
            if (max < rating[a]) {
                max = rating[a];
            }
        }
        min = rating[0];
        for (a = 0; a <= n - 1; a++) {
            if (min > rating[a]) {
                min = rating[a];
            }
        }
        rr = 0;
        for (a = 0; a <= n - 1; a++) {
            if (rating[a] >= 4) {
                rr = rr + 1;
            }
        }
        System.out.println("Daftar rating: " + rating[0] + " " + rating[1] + " " + rating[2] + " " + rating[3] + " " + rating[4] + " " + rating[5]);
        System.out.println("Rata-rata: " + toFixed(rt,2));
        System.out.println("Tertinggi: " + max);
        System.out.println("Terendah: " + min);
        System.out.println("Reviewer rating>=4: " + rr + " orang");
        if (rt >= 4) {
            System.out.println("Kantin dalam kondisi baik.");
        } else {
            if (rt >= 3 && rt < 4) {
                System.out.println("Kondisi cukup, masih perlu peningkatan.");
            } else {
                if (rt < 3) {
                    System.out.println("Kantin perlu evaluasi manajemen!");
                }
            }
        }
    }
    
    public static void rat(double rating, double[] uk) {
        if (rating > 6) {
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
