import java.util.Scanner;
import java.time.LocalDate;

public class Reservasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        
        // VARIABEL DAN TIPE DATA
        String nama_pelanggan, nomor_kontak, nama_pegawai;
        int jumlah_tamu = 0;

        // mendefinisikan array untuk nomor meja
        int[] nomor_meja = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        // boolean konfirmasi;

        //INPUT DATA
        System.out.println("*************************************************************************");
        System.out.print("Nama Kasir\t\t: ");
        nama_pegawai = input.nextLine();
        System.out.print("Nama Pelanggan\t\t: ");
        nama_pelanggan = input.nextLine();
        System.out.print("Nomor Pelanggan\t\t: ");
        nomor_kontak = input.nextLine();

        System.out.println(" ------------------------------------------------------- ");
        System.out.println("|_______________________________________________________|");
        System.out.println("|                    MEJA RESERVASI                     |");
        System.out.println("|                    LARAVEL COFFEE                     |");
        System.out.println("|_______________________________________________________|");
        System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___   ___  |");
        System.out.println("| | 1 | | 2 | | 3 | | 4 | | 5 | | 6 | | 7 | | 8 | | 9 | |");
        System.out.println("|  ____   ____   ____   ____   ____   ____   ____   ____|");
        System.out.println("| | 10 | | 11 | | 12 | | 13 | | 14 | | 15 | | 16 | | 17 |");
        System.out.println("|_______________________________________________________|");
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.print("Pilih Nomor Meja :");

        int pilihMeja = input.nextInt();

        // memeriksa ketersediaan meja 
        if (pilihMeja >= 1 && pilihMeja <= nomor_meja.length) {
            System.out.println("Meja " + pilihMeja);
        } else {
            System.out.println("Silahkan Pilih Nomor Meja Yang Tersedia");
        }

        System.out.print("Jumlah Pelanggan\t: ");
        jumlah_tamu = input.nextInt();
        if (jumlah_tamu<= 5) {
            System.out.println("Jumlah Tamu Yang akan duduk :"+jumlah_tamu);      
        }else{
            System.out.println("Mohon Maaf Kapasistas Tempat duduk Terlalu banyak");
        }
    
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