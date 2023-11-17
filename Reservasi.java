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
        int jumlah_tamu = 0;

        // mendefinisikan array untuk nomor meja
        // int[] nomor_meja = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int[][] nomor_meja = new int[4][4];
        int mejaCounter = 1;
        // boolean konfirmasi;

        // Inisialisasi nomor meja
        for (int i = 0; i < nomor_meja.length; i++) {
            for (int j = 0; j < nomor_meja[i].length; j++) {
                nomor_meja[i][j] = mejaCounter++;
            }
        }

        // System.out.println(" ------------------------------------------------------- ");
        // System.out.println("|_______________________________________________________|");
        // System.out.println("|                    MEJA RESERVASI                     |");
        // System.out.println("|                    LARAVEL COFFEE                     |");
        // System.out.println("|_______________________________________________________|");
        // System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___   ___  |");
        // System.out.println("| | 1 | | 2 | | 3 | | 4 | | 5 | | 6 | | 7 | | 8 | | 9 | |");
        // System.out.println("|  ____   ____   ____   ____   ____   ____   ____   ____|");
        // System.out.println("| | 10 | | 11 | | 12 | | 13 | | 14 | | 15 | | 16 | | 17 |");
        // System.out.println("|_______________________________________________________|");
        // System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");

        //INPUT DATA
        System.out.println("*************************************************************************");
        System.out.print("Nama Kasir\t\t: ");
        nama_pegawai = input.nextLine();
        System.out.print("Nama Pelanggan\t\t: ");
        nama_pelanggan = input.nextLine();
        System.out.print("Nomor Pelanggan\t\t: ");
        nomor_kontak = input.nextLine();

        // Tampilan nomor meja
        System.out.println(" ------------------------------------------------------- ");
        System.out.println("|_______________________________________________________|");
        System.out.println("|                    MEJA RESERVASI                     |");
        System.out.println("|                    LARAVEL COFFEE                     |");
        System.out.println("|_______________________________________________________|");
     // System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___   ___  |");
     // System.out.println("| | 1 | | 2 | | 3 | | 4 | | 5 | | 6 | | 7 | | 8 | | 9 | |");
     // System.out.println("|  ____   ____   ____   ____   ____   ____   ____   ____|");
     // System.out.println("| | 10 | | 11 | | 12 | | 13 | | 14 | | 15 | | 16 | | 17 |");
     // System.out.println("|_______________________________________________________|");
     // System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
     // System.out.print("Pilih Nomor Meja :");
        // nomor_meja = input.nextInt();

        for (int i = 0; i < nomor_meja.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < nomor_meja[i].length; j++) {
                System.out.printf(" %2d |", nomor_meja[i][j]);
            }
            System.out.println("\n\t|____|____|____|____|");
        }

        // int pilihMeja = input.nextInt();

        // switch (nomor_meja) {
            // case 1:
                // System.out.println("Meja 1");
                // break;
            // case 2:
                // System.out.println("Meja 2");
                // break;
            // case 3:
                // System.out.println("Meja 3");
                // break;
            // case 4:
                // System.out.println("Meja 4");
                // break;
            // case 5:
                // System.out.println("Meja 5");
                // break;
            // case 6:
                // System.out.println("Meja 6");
                // break;
            // case 7:
                // System.out.println("Meja 7");
                // break;
            // case 8:
                // System.out.println("Meja 8");
                // break;
            // case 9:
                // System.out.println("Meja 9");
                // break;
            // case 10:
                // System.out.println("Meja 10");
                // break;
            // case 11:
                // System.out.println("Meja 11");
                // break;
            // case 12:
                // System.out.println("Meja 12");
                // break;
            // case 13:
                // System.out.println("Meja 13");
                // break;
            // case 14:
                // System.out.println("Meja 14");
                // break;
            // case 15:
                // System.out.println("Meja 15");
                // break;
            // case 16:
                // System.out.println("Meja 16");
                // break;
            // case 17:
                // System.out.println("Meja 17");
                // break;
            // default:
            // System.out.println("Silahkan Pilih Nomor Meja Yang Tersedia");
                // break;
        // }

        System.out.print("Pilih Nomor Meja : ");
        int pilihMeja = input.nextInt();

    // memeriksa ketersediaan meja 
        // if (pilihMeja >= 1 && pilihMeja <= nomor_meja.length) {
            // System.out.println("Meja " + pilihMeja);
        // } else {
            // System.out.println("Silahkan Pilih Nomor Meja Yang Tersedia");
        // }

        // System.out.print("Jumlah Pelanggan\t: ");
        // jumlah_tamu = input.nextInt();
        // if (jumlah_tamu<= 5) {
            // System.out.println("Jumlah Tamu Yang akan duduk :"+jumlah_tamu);      
        // }else{
            // System.out.println("Mohon Maaf Kapasistas Tempat duduk Terlalu banyak");
        // }

        boolean mejaTersedia = false;
        for (int i = 0; i < nomor_meja.length; i++) {
            for (int j = 0; j < nomor_meja[i].length; j++) {
                if (nomor_meja[i][j] == pilihMeja) {
                    mejaTersedia = true;
                    break;
                }
            }
        }

        if (mejaTersedia) {
            System.out.println("Meja " + pilihMeja + " tersedia.");
        } else {
            System.out.println("Silahkan Pilih Nomor Meja Yang Tersedia");
            return;
        }

        System.out.print("Jumlah Pelanggan\t: ");
        jumlah_tamu = input.nextInt();
    
        if (jumlah_tamu <= 5) {

            System.out.println("Jumlah Tamu Yang Akan Duduk: " + jumlah_tamu);
        } else {
            System.out.println("Mohon Maaf Kapasitas Tempat Duduk Terlalu Banyak");
            return;
        }

        // Bukti Reservasi
        System.out.println();
        System.out.println("---- BUKTI RESERVASI ----");
        System.out.println("Nama Pelanggan\t\t: "+nama_pelanggan);
        System.out.println("Nomor Pelanggan\t\t: "+nomor_kontak);
        System.out.println("Nomor Meja\t\t: "+ pilihMeja);
        System.out.println("Jumlah Pelanggan\t: "+jumlah_tamu);
        System.out.println("Tanggal Reservasi\t: " + date);
        System.out.print("Nama Kasir\t\t: "+nama_pegawai);

        // Info Book
        // Booking + Pesan
    }
}