package latihanLoop;

public class latihan1 {
    public static void main(String[] args) {

        //mencetak angka 1-10
        // kondisi harus true untuk dicetak (jika false maka end)
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }

        //mencetak kata sebanyak 100 kali
        // cetak tak hingga (infinite loop) jika kondisi selalu true, tidak ada falsenya
//        for (int i = 0; i < 4; i--) {
//            System.out.println("I Love You");
//        }

        for (int i = 0; i < 4; i++) {
            System.out.println("I Love You");
        }

        //mencetak penjumlahan angka dari 1-10
//        int n = 11;
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            sum += i;
//            //(sum = sum+i)
//        }
        //cetak hasil akhir diluar looping, kalo didalam cetak keseluruhan
//        System.out.println("Hasil : " + sum);

//        //coba penjumlahan 10-1, cetak semuanya
//        int n = 0;
//        int sum = 0;
//        for (int i = 10; i > n ; i--) {
//            sum += i;
//            System.out.println(sum);
//        }

        //cara2
        int x = 10;
        int sum = 0 ;
        for (int i = x; i > 0; i--) {
            sum += i;
        }
        System.out.println(sum);

        //nested loop

        // outer loop = baris
        // inner loop = kolom
    }
}
