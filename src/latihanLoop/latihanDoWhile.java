package latihanLoop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class latihanDoWhile {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        //error handling ada throws IOEexception dan try catch (bisa memberi pesan)
//        int nim, i=0;
//        String nama;
//        //letakkan variabel sebelum blok try agar terbaca di semua blok try catch
//        try {
//            do {
//                System.out.print("Entry NIM : ");
//                nim = Integer.parseInt(br.readLine());
//                System.out.print("Entry Nama : ");
//                nama = br.readLine();
//                i++;
//            } while (i<5);
//        } catch (Exception e) {
//
//        }

        String nimMhs = null, namaMhs = "", prodi = "", mk = "", cari = "";
        int uts, uas, tugas, menu, nilaiAkhir = 0;

        try {
            /*membuat program dengan menu
            1. Entry mahasiswa (nim, nama, prodi, mk)
            2. Hitung nilai mahasiswa (UTS, UAS, tugas)
            3. Lihat rapor mahasiswa
            4. Keluar program
             */
            do {
                System.out.println("===Program Akademik Mahasiswa===");
                System.out.println("1. Entry mahasiswa");
                System.out.println("2. Hitung nilai mahasiswa");
                System.out.println("3. Lihat rapor mahasiswa");
                System.out.println("4. Keluar program");
                menu = Integer.parseInt(br.readLine());
                // mengisi logika setiap menu (percabangan: if, switch case)
                switch (menu){
                    /*
                    if (menu == 1) {
                    } else if (menu == 2) {
                    } else { (else dalam if-else-if = default)
                    }
                     */
                    case 1:
                        System.out.println("===Menu Entry Mahasiswa===");
                        System.out.print("Entry NIM : ");
                        nimMhs = br.readLine();
                        System.out.print("Entry Nama : ");
                        namaMhs = br.readLine();
                        System.out.print("Entry Program Studi : ");
                        prodi = br.readLine();
                        System.out.print("Entry Mata Kuliah : ");
                        mk = br.readLine();
                        System.out.println();
                        break; // artinya berhenti proses case 1, dan mengembalikan ke perulangan awal (menu di awal)
                    case 2:
                        System.out.println("===Menu Hitung Nilai Mahasiswa===");
                        //hitung nilai akhir (30% * uts, 30% * uas, 40% * tugas)
                        System.out.print("Cari berdasarkan NIM : ");
                        cari = br.readLine();
                        //kalo string sama dengan, berarti pake ignoreequalscase (tidak memperhatikan besar kecil huruf) maupun equalscase (harus plek besar kecil hurufnya)
                        if (cari.equalsIgnoreCase(nimMhs)) {
                            //jika sesuai maka entry nilai, jika tidak maka ada pesan "data tidak ditemukan"
                            System.out.print("Entry Nilai UAS : ");
                            uas = Integer.parseInt(br.readLine());
                            System.out.print("Entry Nilai UTS : ");
                            uts = Integer.parseInt(br.readLine());
                            System.out.print("Entry Nilai Tugas : ");
                            tugas = Integer.parseInt(br.readLine());

                            nilaiAkhir = (uts * 30/100) + (uas * 30/100) + (tugas * 40/100);

                            //cetak nilaiAkhir
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            System.out.println();

                        } else {
                            System.out.println("Data tidak ditemukan");
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.println("===Menu Lihat Rapor===");
                        //menampilkan semua data (termasuk nilai akhir dan nilai huruf)
                        System.out.print("Cari berdasarkan NIM : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)) {
                            System.out.println(nimMhs + " " + namaMhs);
                            System.out.println("Nilai Akhir MK " + mk + ": " + nilaiAkhir);

                        /*
                        A = 80-100
                        B+ = 75-79
                        B = 65-74
                        C+ = 60-64
                        C = 55-59
                        nilai <55 == D/E
                         */
                            if (nilaiAkhir >=80 && nilaiAkhir <=100){
                                System.out.println("Nilai huruf : A");
                            } else if (nilaiAkhir >=75 && nilaiAkhir <80) {
                                System.out.println("Nilal huruf : B+");
                            } else if (nilaiAkhir >=65 && nilaiAkhir <75) {
                                System.out.println("Nilai huruf : B");
                            } else if (nilaiAkhir >=60 && nilaiAkhir <65) {
                                System.out.println("Nilai huruf : C+");
                            } else if (nilaiAkhir >=55 && nilaiAkhir <60) {
                                System.out.println("Nilai huruf : C");
                            } else {
                                System.out.println("Nilai huruf : D/E");
                            }
                            System.out.println();
                        } else {
                            System.out.println("Data tidak ditemukan");
                            System.out.println();
                        }

                        break;
                    default: //jika yang dipilih di luar 1-3 maka menjalankan apa
                        System.out.println("Berhasil keluar program");
                        System.exit(0);
                }

            } while (menu < 4); //boleh diisi true
        } catch (Exception e) {
            System.out.println("Terdapat kesalahan -> " + e.getMessage());

        }
    }
}
