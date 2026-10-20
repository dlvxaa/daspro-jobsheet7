import java.util.Scanner;

public class TugasBioskop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0;
        double bayar, totalPenjualan = 0;

    do {
        System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk keluar): ");
        jumlahTiket = sc.nextInt();

    if (jumlahTiket < 0) {
        System.out.println("Input tidak valid. Masukkan lagi!");
        continue;
    }
    if (jumlahTiket == 0) {
        break;
    }

    bayar = jumlahTiket * hargaTiket;
    if (jumlahTiket > 10) {
        bayar = bayar * 0.85;
    } else if (jumlahTiket > 4) {
        bayar = bayar * 0.90;
    }

    totalTiket += jumlahTiket;
    totalPenjualan += bayar;
    System.out.println("Total yang harus dibayar: Rp " + bayar);
    } while (true);

System.out.println("Total tiket terjual: " + totalTiket);
System.out.println("Total penjualan: Rp " + totalPenjualan);
}

    }