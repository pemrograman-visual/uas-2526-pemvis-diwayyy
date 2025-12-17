//Cyndi Cyahti Manullang - 12S25040
//Dewi Natasya Sitorus - 12S25042
import java.util.*;
import java.lang.Math;

public class soal3UAS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a, b;

        n = Integer.parseInt(input.nextLine());
        String[] nama = new String[n];
        int[] jp = new int[n], total = new int[n];
        int[] kp = new int[jp[a]];

        total = 0;
        for (a = 0; a <= n - 1; a++) {
            nama[a] = input.nextLine();
            jp[a] = Integer.parseInt(input.nextLine());
            for (b = 0; b <= jp[a] - 1; b++) {
                kp[b] = Integer.parseInt(input.nextLine());
                if (kp[b] < 0) {
                    System.out.println("INVALID");
                    kp[b] = Integer.parseInt(input.nextLine());
                }
                total[a] = total + kp[b];
            }
        }
    }
}
