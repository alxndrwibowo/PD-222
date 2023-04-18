package latihanLoop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihanWhile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //while
        //menjumlahkan setiap angka yang akan dientrykan
        //kondisi: pengulangan dan penjumlahan akan dilakukan apabila angka yang diinputkan >=0
        //output angka hasil jumlah
        int number=0, jumlah=0;
        while (number>=0) {
            jumlah += number; //utk penjumlahan setiap angka yang diinputkan
            //jumlah += angka adalah jumlah = jumlah + angka
            System.out.print("Entry angka : ");
            number = Integer.parseInt(br.readLine());
        }
        System.out.println("Jumlah : " + jumlah);

        //mengentrykan nim dan nama apabila kondisinya true (dua data diisi dengan benar, dimana tipe datanya sesuai)
        //khusus boolean sama dengannya satu aja di kondisinya (=), kalo angka baru pake dua sama dengana (==)
        boolean b;
        while (b=true) {
            System.out.print("Entry NIM : ");
            int nim = Integer.parseInt(br.readLine());
            System.out.print("Entry Nama : ");
            String nama = br.readLine();
        }

//        int i = 0;
//        while (i<5) {
//            System.out.print("Entry NIM : ");
//            int nim = Integer.parseInt(br.readLine());
//            System.out.print("Entry Nama : ");
//            String nama = br.readLine();
//            i++;
        // i++ adalah i + 1
//        }
    }
}
