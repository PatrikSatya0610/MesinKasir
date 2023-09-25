import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PelayananCoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input =new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss: ");
        LocalTime localTime = LocalTime.now();

        // VARIABEL DAN TIPE DATA
        String nama_pelanggan, nomor_kontak, status_reservasi, nama_pegawai, metode_pembayaran, catatan;
        int nomor_meja, jumlah_tamu, kapasitas, total_harga;
        DateTimeFormatter tanggal, waktu;
        boolean konfirmasi;

        System.out.println(" ------------------------------------------------------- ");
        System.out.println(" _______________________________________________________|");
        System.out.println("|                    MEJA RESERVASI                     |");
        System.out.println("|                     LARAVEL COFFEE                    |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___   ___  |");
        System.out.println("| | 1 | | 2 | | 3 | | 4 | | 5 | | 6 | | 7 | | 8 | | 9 | |");
        System.out.println("|  ____   ____   ____   ____   ____   ____   ____   ____|");
        System.out.println("| | 10 | | 11 | | 12 | | 13 | | 14 | | 15 | | 16 | | 17 |");
        System.out.println("|_______________________________________________________|");
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
    }
}