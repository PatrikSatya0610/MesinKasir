
import java.util.Scanner;

public class MesinKasir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIABEL DAN JENIS DATA
        String nama_barang, catatan, konfirmasi;
        int jml_barang=0, harga_barang=0;
        double pembayaran,total_harga=0,kembalian;

        //MENU
        System.out.println(" ------------------------------------------------------- ");
        System.out.println("|                     LARAVEL COFFEE                    |");
        System.out.println("|                          MENU                         |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| COFFEE :                    HOT            ICE        |");
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
        System.out.println("| MANUAL BREW :                                         |");
        System.out.println("|   VIETNAM DRIP        : Rp 22.000                     |");
        System.out.println("|   V60                 : Rp 22.000                     |");
        System.out.println("|   JAPANESE            : Rp 22.000                     |");
        System.out.println(" ------------------------------------------------------- ");

        // INPUT DATA
        do{
            System.out.println("---------- Pilih Fitur ----------");
            System.out.println("| 1. Menu                       |");
            System.out.println("| 2. Reservasi                  |");
            System.out.println("|                               |");
            System.out.println("|                               |");
            System.out.println("---------------------------------");
            konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("1")) {
            
                System.out.print("Masukkan nama barang :\n");
                    nama_barang = sc.nextLine();
                    System.out.println("Masukkan catatan pelanggan :");
                    catatan = sc.nextLine();
                    System.out.print("Masukkan harga per item :");
                    harga_barang = sc.nextInt();
                    System.out.print("Masukkan jumlah barang yang dibeli :");
                    jml_barang = sc.nextInt();
                    System.out.println("");
            }
            
            total_harga = harga_barang * jml_barang;
        }while ();

        //  PROSES DATA
        System.out.print("Total Harga : " + total_harga);
        System.out.print("\nMasukkan total pembayaran : ");
        pembayaran = sc.nextDouble();
        kembalian = pembayaran - total_harga;

        // OUTPUT
        System.out.println("\n\n---- STRUK PEMBELIAN ----");
        System.out.println("Nama Barang\t: " + nama_barang);
        System.out.println("Harga per Item\t: " + harga_barang);
        System.out.println("Jumlah Barang\t: " + jml_barang);
        System.out.println("Total Harga\t: " + total_harga);
        System.out.println("Tunai\t\t: " + pembayaran);
        System.out.println("Kembalian\t: " + kembalian);
        System.out.println("\n---- TERIMA KASIH ----");


    }
    
}

