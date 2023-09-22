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
        String nama_pelanggan, nomor_kontak, status_reservasi, nama_pegawai, metide_pembayaran, catatan;
        int nomor_meja, jumlah_tamu, kapasitas, total_harga;
        DateTimeFormatter tanggal, waktu;
        boolean konfirmasi;
        
    }
}