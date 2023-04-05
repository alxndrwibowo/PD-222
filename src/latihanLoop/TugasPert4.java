package latihanLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TugasPert4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int baris;
        System.out.print("Masukkan jumlah baris : ");
        baris = Integer.parseInt(br.readLine());

        for (int i = baris; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}