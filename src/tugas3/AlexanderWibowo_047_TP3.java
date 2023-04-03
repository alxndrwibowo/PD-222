package tugas3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlexanderWibowo_047_TP3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nama, nim, prodi, huruf1, huruf2, huruf3, huruf4, huruf5 , huruf6;
        int sks, matkul, sksMaks;
        double nilai1, bobot1, nilai2, bobot2, nilai3, bobot3, nilai4, bobot4, nilai5, bobot5, nilai6, bobot6, IPS;

        sks = 3;
        matkul = 6;

        try {
            System.out.println("--Masukkan Data Di Bawah Ini--");
            System.out.print("NIM : ");
            nim = br.readLine();
            System.out.print("Nama : ");
            nama = br.readLine();
            System.out.print("Prodi : ");
            prodi = br.readLine();
            System.out.print("Masukkan Nilai Akhir (0-100)\nNilai Bahasa Indonesia : ");
            nilai1 = Integer.parseInt(br.readLine());
            if (nilai1>=80) {
                bobot1 = 4.0;
                huruf1 = "A";
            } else if (nilai1>=75 && nilai1<80) {
                bobot1 = 3.5;
                huruf1 = "B+";
            } else if (nilai1>=65 && nilai1<75) {
                bobot1 = 3.0;
                huruf1 = "B";
            } else if (nilai1>=60 && nilai1<65) {
                bobot1 = 2.5;
                huruf1 = "C+";
            } else if (nilai1>=55 && nilai1<60) {
                bobot1 = 2.0;
                huruf1 = "C";
            } else if (nilai1>=40 && nilai1<55) {
                bobot1 = 1.0;
                huruf1 = "D";
            } else {
                bobot1 = 0;
                huruf1 = "E";
            }
            System.out.println("Nilai Huruf Bahasa Indonesia : " + huruf1);

            System.out.print("Nilai Dasar Infrastruktur Teknologi Informasi : ");
            nilai2 = Integer.parseInt(br.readLine());
            if (nilai2>=80) {
                bobot2 = 4.0;
                huruf2 = "A";
            } else if (nilai2>=75 && nilai2<80) {
                bobot2 = 3.5;
                huruf2 = "B+";
            } else if (nilai2>=65 && nilai2<75) {
                bobot2 = 3.0;
                huruf2 = "B";
            } else if (nilai2>=60 && nilai2<65) {
                bobot2 = 2.5;
                huruf2 = "C+";
            } else if (nilai2>=55 && nilai2<60) {
                bobot2 = 2.0;
                huruf2 = "C";
            } else if (nilai2>=40 && nilai2<55) {
                bobot2 = 1.0;
                huruf2 = "D";
            } else {
                bobot2 = 0;
                huruf2 = "E";
            }
            System.out.println("Nilai Huruf Dasar Infrastruktur Teknologi Informasi : " + huruf2);

            System.out.print("Nilai Logika Dan Algoritma Pemrograman : ");
            nilai3 = Integer.parseInt(br.readLine());
            if (nilai3>=80) {
                bobot3 = 4.0;
                huruf3 = "A";
            } else if (nilai3>=75 && nilai3<80) {
                bobot3 = 3.5;
                huruf3 = "B+";
            } else if (nilai3>=65 && nilai3<75) {
                bobot3 = 3.0;
                huruf3 = "B";
            } else if (nilai3>=60 && nilai3<65) {
                bobot3 = 2.5;
                huruf3 = "C+";
            } else if (nilai3>=55 && nilai3<60) {
                bobot3 = 2.0;
                huruf3 = "C";
            } else if (nilai3>=40 && nilai3<55) {
                bobot3 = 1.0;
                huruf3 = "D";
            } else {
                bobot3 = 0;
                huruf3 = "E";
            }
            System.out.println("Nilai Huruf Logika Dan Algoritma Pemrograman : " + huruf3);

            System.out.print("Nilai Matematika Dasar : ");
            nilai4 = Integer.parseInt(br.readLine());
            if (nilai4>=80) {
                bobot4 = 4.0;
                huruf4 = "A";
            } else if (nilai4>=75 && nilai4<80) {
                bobot4 = 3.5;
                huruf4 = "B+";
            } else if (nilai4>=65 && nilai4<75) {
                bobot4 = 3.0;
                huruf4 = "B";
            } else if (nilai4>=60 && nilai4<65) {
                bobot4 = 2.5;
                huruf4 = "C+";
            } else if (nilai4>=55 && nilai4<60) {
                bobot4 = 2.0;
                huruf4 = "C";
            } else if (nilai4>=40 && nilai4<55) {
                bobot4 = 1.0;
                huruf4 = "D";
            } else {
                bobot4 = 0;
                huruf4 = "E";
            }
            System.out.println("Nilai Huruf Matematika Dasar : " + huruf4);

            System.out.print("Nilai Organisasi Dan Manajemen : ");
            nilai5 = Integer.parseInt(br.readLine());
            if (nilai5>=80) {
                bobot5 = 4.0;
                huruf5 = "A";
            } else if (nilai5>=75 && nilai5<80) {
                bobot5 = 3.5;
                huruf5 = "B+";
            } else if (nilai5>=65 && nilai5<75) {
                bobot5 = 3.0;
                huruf5 = "B";
            } else if (nilai5>=60 && nilai5<65) {
                bobot5 = 2.5;
                huruf5 = "C+";
            } else if (nilai5>=55 && nilai5<60) {
                bobot5 = 2.0;
                huruf5 = "C";
            } else if (nilai5>=40 && nilai5<55) {
                bobot5 = 1.0;
                huruf5 = "D";
            } else {
                bobot5 = 0;
                huruf5 = "E";
            }
            System.out.println("Nilai Huruf Organisasi Dan Manajemen : " + huruf5);

            System.out.print("Nilai Statistik Dan Probabilitas : ");
            nilai6 = Integer.parseInt(br.readLine());
            if (nilai6>=80) {
                bobot6 = 4.0;
                huruf6 = "A";
            } else if (nilai6>=75 && nilai6<80) {
                bobot6 = 3.5;
                huruf6 = "B+";
            } else if (nilai6>=65 && nilai6<75) {
                bobot6 = 3.0;
                huruf6 = "B";
            } else if (nilai6>=60 && nilai6<65) {
                bobot6 = 2.5;
                huruf6 = "C+";
            } else if (nilai6>=55 && nilai6<60) {
                bobot6 = 2.0;
                huruf6 = "C";
            } else if (nilai6>=40 && nilai6<55) {
                bobot6 = 1.0;
                huruf6 = "D";
            } else {
                bobot6 = 0;
                huruf6 = "E";
            }
            System.out.println("Nilai Huruf Statistik Dan Probabilitas : " + huruf6);

            IPS = ((sks*bobot1)+(sks*bobot2)+(sks*bobot3)+(sks*bobot4)+(sks*bobot5)+(sks*bobot6))/(sks*matkul);
            System.out.println("Nilai Indeks Prestasi Semester Anda : " + IPS);

            if (IPS>=3.5) {
                System.out.println("Sks Maksimal Yang Dapat Diambil : 24 sks");
            } else if (IPS<3.5 && IPS>=3) {
                System.out.println("Sks Maksimal Yang Dapat Diambil : 22 sks");
            } else if (IPS<3 && IPS>=2) {
                System.out.println("Sks Maksimal Yang Dapat Diambil : 20 sks");
            } else {
                System.out.println("Sks Maksimal Yang Dapat Diambil : 18 sks");
            }

        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println("Isian NIM dan nilai harus angka");
        }
    }
}