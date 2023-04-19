package Tugas6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlexanderWibowo_047_TP6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] struk = new String[5][4];
        int[] j = new int[5];
        int[] h = new int[5];
        int total, grandTotal=0, uang, kembali;

        for (int i = 0; i < struk.length; i++) {
            System.out.print("Nama Barang : ");
            struk[i][0] = br.readLine();
            System.out.print("Jumlah Barang : ");
            struk[i][1] = br.readLine();
            j[i] = Integer.parseInt(struk[i][1]);
            System.out.print("Harga Barang : ");
            struk[i][2] = br.readLine();
            h[i] = Integer.parseInt(struk[i][2]);
            total = j[i]*h[i];
            struk[i][3] = String.valueOf(total);
            System.out.println("Total : " + struk[i][3]);

            grandTotal = grandTotal + total;
            System.out.println("----------------------");

        }

        System.out.println("Grand Total : " + grandTotal);

        System.out.print("Masukkan Uang Yang Dibayarkan : ");
        uang = Integer.parseInt(br.readLine());

        kembali = uang-grandTotal;

        System.out.println("Kembali : " + kembali);
        if (kembali<0) {
            System.out.println("Belum Lunas");
        }
    }
}
