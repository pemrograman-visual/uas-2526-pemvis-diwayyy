//Cyndi Cyahti Manullang - 12S25040
//Dewi Natasya Sitorus - 12S25042
import java.util.*;
import java.lang.Math;

public class soal5UAS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a;

        n = Integer.parseInt(input.nextLine());
        String[] nama = new String[n], status = new String[n];
        double[] ipk = new double[n];
        int[] pendapatan = new int[n];
        int[] tanggung = new int[n];
        int count;

        count = 0;
        for (a = 0; a <= n - 1; a++) {
            nama[a] = input.nextLine();
            ipk[a] = Double.parseDouble(input.nextLine());
            pendapatan[a] = Integer.parseInt(input.nextLine());
            tanggung[a] = Integer.parseInt(input.nextLine());
            if (ipk[a] >= 3.0) {
                if (pendapatan[a] <= 3000000) {
                    if (tanggung[a] >= 3) {
                        status[a] = "Lolos";
                        count = count + 1;
                    } else {
                        status[a] = "Tidak Lolos";
                    }
                } else {
                    status[a] = "Tidak Lolos";
                }
            } else {
                status[a] = "Tidak Lolos";
            }
        }
        for (a = 0; a <= n - 1; a++) {
            System.out.println(nama[a] + " = " + status[a]);
        }
        System.out.println("Total Lolos: " + count);
    }
}
