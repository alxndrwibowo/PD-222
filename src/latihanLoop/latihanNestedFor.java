package latihanLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanNestedFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //variabel
        int minggu, hari;

        //input
        System.out.print("Jumlah minggu : ");
        minggu = Integer.parseInt(br.readLine());
        System.out.print("Jumlah hari : ");
        hari = Integer.parseInt(br.readLine());

        //perulangan + output
        //outer loop: baris
        for (int i = 1; i <= minggu; i++) {
            System.out.println("Minggu ke - " + i);

            //inner loop: kolom
            for (int j = 1; j <= hari; j++) {
                if (i==4) {
                    break;
                }
                //tidak menampilkan hari pada minggu ke - 4
                //break untuk menyatakan bahwa kondisi akan berhenti

                System.out.println("Hari ke - " + j);
            }

        }

//        // pattern persegi panjang
//        int b, k;
//        System.out.print("Masukkan jumlah baris * : ");
//        b = Integer.parseInt(br.readLine());
//        System.out.print("Masukkan jumlah kolom * : ");
//        k = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < b; i++) {
//            for (int j = 0; j < k; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //outer loop
        int n = 0;
        System.out.print("Masukkan jumlah baris : ");
        n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n ; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
