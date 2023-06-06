package latihanMath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class contohQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//      Contoh 1:
//      Terdapat 5 orang yang sedang mengantri di sebuah restoran dengan atas nama mereka,
//      Maka program akan membuat urutan pelayanan sehingga yang datang pertama akan dilayani terlebih dahulu/ FIFO (First In First Out)

        System.out.println("= PROGRAM PERTAMA =");
        Queue<String> antrian = new LinkedList<>();
        System.out.println("=== DATA ANTRIAN RESTORAN ===");
        antrian.add("Budi");
        System.out.println(antrian);
        antrian.add("Samsul");
        System.out.println(antrian);
        antrian.add("Herman");
        System.out.println(antrian);
        antrian.add("Susi");
        System.out.println(antrian);
        antrian.add("Dani");
        System.out.println(antrian);
        System.out.println();

        System.out.println("= URUTAN PELAYANAN = ");
        while(!antrian.isEmpty()) {
            System.out.println(antrian.remove() + " sudah dilayani");
            System.out.println("Panjang antrian saat ini: " + antrian.size());
        }
        System.out.println();

//      Contoh 2:
//      Kasir yang dapat mengatur antrian dengan menggunakan nomor antrian,
//      Maka program akan melakukan menu yang dipilih oleh kasir sehingga dapat mengatur antrian dengan baik

        System.out.println("= PROGRAM KEDUA =");
        int menu, no;
        Queue<Integer> loket = new LinkedList<>();
        System.out.println("=== MENU ===");
        System.out.println("1. Tambah antrian");
        System.out.println("2. Keluarkan 1 antrian");
        System.out.println("3. Tampilkan panjang antrian");
        System.out.println("4. Tampilkan seluruh data dalam antrian");
        System.out.println("5. Hapus seluruh antrian");
        System.out.println("6. Keluar dari Program");

        do {
            System.out.println();
            System.out.print("Pilih menu : ");
            menu = Integer.parseInt(br.readLine());
            if (menu==1){
                System.out.print("Masukkan nomor antrian : ");
                no = Integer.parseInt(br.readLine());
                loket.add(no);
            } else if (menu==2){
                System.out.println("Antrian nomor " + loket.remove() + " telah dikeluarkan");
            } else if (menu==3){
                System.out.println("Panjang antrian : " + loket.size() + " antrian");
            } else if (menu==4){
                System.out.println("Nomor yang sedang mengantri : " + loket);
            } else if (menu==5){
                while (!loket.isEmpty()){
                    System.out.println("Nomor " + loket.remove() + " sudah dihapus");
                }
            } else{
                System.out.println("Inputan bukan 1-5, Program Selesai");
                menu = 6;
            }
        } while (menu != 6);
    }
}