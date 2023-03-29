import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nominal {
    public static void main(String[] args) throws IOException {
        int n;
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nominal :");
        n = Integer.parseInt(br.readLine());

        a = n/20000;
        System.out.println("Dua puluh ribuan : " + a);

        b = (n%20000)/10000;
        System.out.println("Sepuluh ribuan : " + b);

        c = (n%10000)/1000;
        System.out.println("Seribuan : " + c);

        d = (n%1000)/500;
        System.out.println("Lima ratusan : " + d);

        e = (n%500)/200;
        System.out.println("Dua ratusan : " + e);

        f = (n%200)/100;
        System.out.println("Seratusan : " + f);

        g = (n%100)/1;
        System.out.println("Sisa uang : " + g + " Tidak mungkin dipecah");

    }
}
