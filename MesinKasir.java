
import java.util.Scanner;

public class MesinKasir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIABEL DAN JENIS DATA
        String nama_barang;
        int jml_barang, harga_barang;
        double pembayaran,total_harga,kembalian;

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

        // INPUT DATA
         System.out.println("Masukkan nama barang : ");
         nama_barang = sc.nextLine();
         System.out.println("Masukkan harga per item : ");
         harga_barang = sc.nextInt();
         System.out.println("Masukkan jumlah barang yang dibeli :");
         jml_barang = sc.nextInt();

        //  PROSES DATA
            total_harga = harga_barang * jml_barang;
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
