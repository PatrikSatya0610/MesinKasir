import java.util.Scanner;
//import java.util.Calendar;
//import java.util.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;

public class Reservasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        
        // VARIABEL DAN TIPE DATA
        String nama_pelanggan, nomor_kontak, nama_pegawai;
        int nomor_meja, jumlah_tamu;
        // boolean konfirmasi;

        System.out.println(" ------------------------------------------------------- ");
        System.out.println("|_______________________________________________________|");
        System.out.println("|                    MEJA RESERVASI                     |");
        System.out.println("|                     LARAVEL COFFEE                    |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___   ___  |");
        System.out.println("| | 1 | | 2 | | 3 | | 4 | | 5 | | 6 | | 7 | | 8 | | 9 | |");
        System.out.println("|  ____   ____   ____   ____   ____   ____   ____   ____|");
        System.out.println("| | 10 | | 11 | | 12 | | 13 | | 14 | | 15 | | 16 | | 17 |");
        System.out.println("|_______________________________________________________|");
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

        //INPUT DATA
        System.out.print("Nama Kasir\t\t:");
        nama_pegawai = input.nextLine();
        System.out.print("Nama Pelanggan\t\t:");
        nama_pelanggan = input.nextLine();
        System.out.print("Nomor Pelanggan\t\t:");
        nomor_kontak = input.nextLine();
        System.out.print("Nomor Meja\t\t:");
        nomor_meja = input.nextInt();
        System.out.print("Jumlah Pelanggan\t:");
        jumlah_tamu = input.nextInt();
        
        System.out.println();
        System.out.println("***Bukti Reservasi***");
        System.out.println("Nama Pelanggan\t\t:"+nama_pelanggan);
        System.out.println("Nomor Pelanggan\t\t:"+nomor_kontak);
        System.out.println("Nomor Meja\t\t:"+nomor_meja);
        System.out.println("Jumlah Pelanggan\t:"+jumlah_tamu);
        System.out.println("Tanggal Reservasi\t:" + date);
        System.out.print("Nama Kasir\t\t:"+nama_pegawai);
    }
}