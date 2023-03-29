import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lingkaran {
    public static void main(String[] args) throws IOException {
        //inputan
        int r;
        double luas;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Masukkan jari-jari :");
        r = Integer.parseInt(br.readLine());

        //proses
        luas = 3.14 * r * r;

        //output
        System.out.println("Luas lingkaran = " + luas);


    }
}