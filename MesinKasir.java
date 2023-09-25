
import java.util.Scanner;

public class MesinKasir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIABEL DAN JENIS DATA
        String nama_barang, pelanggan;
        int jml_barang, harga_barang;
        double pembayaran,total_harga,kembalian;

        //MENU
        System.out.println(" ------------------------------------------------------------ ");
        System.out.println("|                     LARAVEL COFFEE                         |");
        System.out.println("|                          MENU                              |");
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|   COFFEE :                    HOT            ICE           |");
        System.out.println("|    1  CAPPUCINO           : Rp 20.000     Rp 22.000        |");
        System.out.println("|    2  COFFEE LATTE        : Rp 20.000     Rp 22.000        |");
        System.out.println("|    3  VANILLA LATTE       : Rp 20.000     Rp 22.000        |");
        System.out.println("|    4  HAZELNUT LATTE      : Rp 20.000     Rp 22.000        |");
        System.out.println("|    5  STRAWBERY LATTE     : Rp 20.000     Rp 22.000        |");
        System.out.println("|    6  AMERICANO           : Rp 15.000     Rp 17.000        |");
        System.out.println("|    7  PICCOLO LATTE       : Rp 15.000                      |");
        System.out.println("|    8  CARAMEL MACHIATO    : Rp 20.000     Rp 22.000        |");
        System.out.println("|    9  COFFEEMILK          :               Rp 20.000        |");
        System.out.println("|                                                            |");
        System.out.println("|   MANUAL BREW :                                            |");
        System.out.println("|    10  VIETNAM DRIP        : Rp 22.000                     |");
        System.out.println("|    11  V60                 : Rp 22.000                     |");
        System.out.println("|    12  JAPANESE            : Rp 22.000                     |");
        System.out.println("--------------------------------------------------------------");

        // INPUT DATA
         System.out.println("Masukkan nama pelanggan :");
         pelanggan = sc.nextLine();
         System.out.print("Masukkan nama barang : ");
         nama_barang = sc.nextLine();
         System.out.print("Masukkan harga per item : ");
         harga_barang = sc.nextInt();
         System.out.print("Masukkan jumlah barang yang dibeli :");
         jml_barang = sc.nextInt();

        //  PROSES DATA
        total_harga = harga_barang * jml_barang;
        System.out.print("Total Harga : " + total_harga);
        System.out.print("\nMasukkan total pembayaran : ");
        pembayaran = sc.nextDouble();
        kembalian = pembayaran - total_harga;

        // OUTPUT
        System.out.println("\n\n---- STRUK PEMBELIAN ----");
        System.out.println(pelanggan);
        System.out.print("Nama Barang\t: " + nama_barang);
        System.out.println("Harga per Item\t: " + harga_barang);
        System.out.println("\nJumlah Barang\t: " + jml_barang);
        System.out.println("Total Harga\t: " + total_harga);
        System.out.println("Tunai\t\t: " + pembayaran);
        System.out.println("Kembalian\t: " + kembalian);
        System.out.println("\n---- TERIMA KASIH ----");


    }
    
}
