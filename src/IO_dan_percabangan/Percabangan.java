package IO_dan_percabangan;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // if-else
        // cek syarat pembuatan KTP

        int usia = 0;
        System.out.print("Masukkan usia anda : ");
        usia = Integer.parseInt(br.readLine());


        if (usia >= 17) {
            System.out.println("Sudah memenuhi syarat");
        } else {
            System.out.println("Belum memenuhi syarat");
        }


        // if-else-if
        // cek status kelulusan MK
        String nim;
        int nilaiUAS;
        System.out.print("Masukkan nim anda : ");
        nim = br.readLine();
        System.out.print("Masukkan nilai UAS anda : ");
        nilaiUAS = Integer.parseInt(br.readLine());

        // jika nilai 80, 70, 65 = lulus, di bawah 65 tidak lulus
        if (nim.equalsIgnoreCase("22410100047") && nilaiUAS == 80){
            System.out.println("Lulus");
        } else if (nim.equalsIgnoreCase("22410100047") && nilaiUAS == 70){
            System.out.println("Lulus");
        } else if (nim.equalsIgnoreCase("22410100047") && nilaiUAS == 65){
            System.out.println("Lulus");
        } else if (nim.equalsIgnoreCase("22410100047") && nilaiUAS < 65){
            System.out.println(" Tidak Lulus");
        } else {
            System.out.println("Nilai tidak ditemukan");
        }




        // equals : memperhatikan detail besar-kecilnya huruf (case sensitive)
        // equalsIgnoreCase : non-sensitive


        // nested-if
        // cek menu yang akan dipilih (makanan/minuman)
        // makanan = snack, nasi bungkus
        // minuman = kopi, teh, air mineral

        String menu, jenis;
        System.out.print("Masukkan menu (makanan/minuman) : ");
        menu = br.readLine();
        System.out.print("Masukkan jenis menu \nMakanan: Snack, Nasi bungkus \n" + "Minuman: kopi, teh, air mineral \nPilih : ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("makanan")) {
            if (jenis.equalsIgnoreCase("snack")) {
                System.out.println("harga 2000");
            } else {
                System.out.println("harga 7000");
            }
        } else if (menu.equalsIgnoreCase("minuman")){
            if (jenis.equalsIgnoreCase("kopi")) {
                System.out.println("harga 3000");
            } else if (jenis.equalsIgnoreCase("teh")) {
                System.out.println("harga 4000");
            } else {
                System.out.println("harga 2000");
            }
        }

    }
}