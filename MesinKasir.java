
import java.util.Scanner;

public class MesinKasir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIABEL DAN JENIS DATA
        String nama_barang, pelanggan, catatan;
        int jml_barang, harga_barang;
        double total_harga,kembalian;
        
        // VARIABEL DAN JENIS DATA JENIS PEMBAYARAN
        double pajak;
        int pilih, pembayaran;

        //MENU
        System.out.println(" -------------------------------------------------------");
        System.out.println("|                     LARAVEL COFFEE                    |");
        System.out.println("|                          MENU                         |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|COFFEE :                    HOT            ICE         |");
        System.out.println("|   CAPPUCINO           : Rp 20.000     Rp 22.000       |");
        System.out.println("|   COFFEE LATTE        : Rp 20.000     Rp 22.000       |");
        System.out.println("|   VANILLA LATTE       : Rp 20.000     Rp 22.000       |");
        System.out.println("|   HAZELNUT LATTE      : Rp 20.000     Rp 22.000       |");
        System.out.println("|   STRAWBERY LATTE     : Rp 20.000     Rp 22.000       |");
        System.out.println("|   AMERICANO           : Rp 15.000     Rp 17.000       |");
        System.out.println("|   PICCOLO LATTE       : Rp 15.000                     |");
        System.out.println("|   CARAMEL MACHIATO    : Rp 20.000     Rp 22.000       |");
        System.out.println("|   COFFEEMILK          :               Rp 20.000       |");
        System.out.println("|                                                       |");
        System.out.println("|MANUAL BREW :                                          |");
        System.out.println("|   VIETNAM DRIP        : Rp 22.000                     |");
        System.out.println("|   V60                 : Rp 22.000                     |");
        System.out.println("|   JAPANESE            : Rp 22.000                     |");
        System.out.println(" ------------------------------------------------------- ");

        // INPUT DATA STRUK PEMBAYARAN
         System.out.println("Masukkan nama pelanggan :");
         pelanggan = sc.nextLine();
         System.out.print("Masukkan nama barang : ");
         nama_barang = sc.nextLine();
         System.out.print("Masukkan harga per item : ");
         harga_barang = sc.nextInt();
         System.out.print("Masukkan jumlah barang yang dibeli :");
         jml_barang = sc.nextInt();
         System.out.println("Masukkan catatan pelanggan :");
         catatan = sc.nextLine();

        //  PROSES DATA STRUK PEMBAYARAN
        total_harga = harga_barang * jml_barang;
        System.out.print("Total Harga : " + total_harga);
       
        // PROSES DATA JENIS PEMBAYARAN
        System.out.println("*********************************");
        System.out.println("---------------------------------");
        System.out.println("Jenis Pembayaran");
        System.out.println("1. Tunai    ");
        System.out.println("2. Debit    ");
        System.out.println("3. E-Money  ");
        System.out.println("---------------------------------");
        System.out.println("*********************************");
        System.out.println(" Pilih Jenis Pembayaran ");
        pilih = sc.nextInt();

        switch (pilih) {
            // TUNAI 
            case 1:
                System.out.print("Masukkan jumlah yang akan dibayar : ");
                pembayaran = sc.nextInt();
                kembalian = pembayaran - total_harga;
                break;
            // DEBIT
            case 2 :
                System.out.print("Masukkan jumlah yang akan dibayar : ");
                pembayaran = sc.nextInt();
                total_harga += 2500;
                kembalian = pembayaran - total_harga;
            // E-Money
            case 3 :
                System.out.print("Masukkan jumlah yang akan dibayar : ");
                pembayaran = sc.nextInt();
                total_harga *= 0.1;
                kembalian = pembayaran - total_harga;
                break;
            default:
                System.out.println("Maaf, Silahkan pilih angka yang sesuai.");
                break;
        }

        // OUTPUT STRUK PEMBAYARAN
        System.out.println("\n\n---- STRUK PEMBELIAN ----");
        System.out.println("Nama Pelanggan\t: " + pelanggan);
        System.out.println("Nama Barang\t: " + nama_barang);
        System.out.println("Catatan\t: " + catatan);
        System.out.println("Harga per Item\t: " + harga_barang);
        System.out.println("\nJumlah Barang\t: " + jml_barang);
        System.out.println("Total Harga\t: " + total_harga);
        System.out.println("Tunai\t\t: " + pembayaran);
        System.out.println("Kembalian\t: " + kembalian);
        System.out.println("\n---- TERIMA KASIH ----");

        // Tambahan note atau request
        // Diskon & Voucher
        // Biaya Charge/Penalty
    }
    
}

