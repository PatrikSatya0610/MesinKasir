
import java.util.Scanner;

public class MesinKasir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIABEL DAN JENIS DATA
        // String nama_barang, pelanggan, catatan, voucher;
        // int jml_barang, harga_barang,pilih;
        // double total_harga,kembalian=0,pajak,pembayaran=0, diskon=0;

        // String nama_barang, catatan, konfirmasi;
        // int jml_barang=0, harga_barang=0;
        // double pembayaran,total_harga=0,kembalian;

        String nama_barang = "", pelanggan, catatan,konfirmasi,voucher;
        int jml_barang=0, harga_barang=0,pilih;
        double total_harga,kembalian=0,pajak1,pajak2,pembayaran=0, diskon=0;
        pajak1= 0.05;
        pajak2= 0.01;

        String username, password, secretUsername = "admin", secretPassword = "123456";
        for (int Try = 1; Try <= 3; Try++) {
             System.out.print("Enter Username : ");
            username = sc.nextLine();
            System.out.print("Enter Password : ");
            password = sc.nextLine();
            if (username.equals(secretUsername) && password.equals(secretPassword)) {
                System.out.println("Login sukses");
                break;
            }else if (Try == 3){
                System.out.println("Maaf Silahkan Coba Lagi Nanti");
                System.exit(0);
            }else if (Try <= 3){
                System.out.println("Login Gagal");
            }
        }
           
        //MENU
        System.out.println(" ------------------------------------------------------- ");
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
        int i = 1;
        do{
            System.out.println("---------- Pilih Fitur ----------");
            System.out.println("| 1. Menu                       |");
            System.out.println("| 2. Reservasi                  |");
            System.out.println("| 9. Exit                       |");
            System.out.println("|                               |");
            System.out.println("---------------------------------");
            konfirmasi = sc.next();
            if (konfirmasi.equalsIgnoreCase("1")) {
            
                System.out.print("Masukkan nama barang :");
                nama_barang = sc.next();
                System.out.print("Masukkan catatan pelanggan :");
                catatan = sc.next();
                System.out.print("Masukkan harga per item : ");
                harga_barang = sc.nextInt();
                System.out.print("Masukkan jumlah barang yang dibeli :");
                jml_barang = sc.nextInt();
                System.out.println("");
            }else if(konfirmasi.equalsIgnoreCase("9")){
                break;
            }
            
            total_harga = harga_barang * jml_barang;
        }while (i>0) ;

        //  PROSES DATA

        // INPUT DATA STRUK PEMBAYARAN
         System.out.print("Masukkan nama pelanggan :");
         pelanggan = sc.next();

        //  System.out.print("Masukkan nama barang : ");
        //  nama_barang = sc.nextLine();
        //  System.out.print("Masukkan harga per item : ");
        //  harga_barang = sc.nextInt();
        //  System.out.print("Masukkan jumlah barang yang dibeli : ");
        //  jml_barang = sc.nextInt();
        //  System.out.println("Masukkan catatan pelanggan : ");
        //  catatan = sc.nextLine();

        //  PROSES DATA STRUK PEMBAYARAN
        total_harga = harga_barang * jml_barang;
        System.out.println("Total Harga : " + total_harga);

         // PROSES DATA VOUCHER
        System.out.println("Masukkan Kode Voucher : ");
        voucher = sc.next();
            if (voucher.equals("LRVL03")){
                if (total_harga >= 100000){
                    diskon = 0.25;
                    System.out.println("Selamat Anda mendapatkan potongan harga sebesar 25%");
                }else 
                    diskon = 0.1;
                    System.out.println("Selamat Anda mendapatkan potongan harga sebesar 10%");
            }else{
                System.out.println("Kode Voucher Tidak Tersedia");
            }

        total_harga = total_harga - (total_harga * diskon);
        System.out.print("Total Harga = " + total_harga);
       
        // PROSES DATA JENIS PEMBAYARAN
        System.out.println("\n\n*********************************");
        System.out.println("---------------------------------");
        System.out.println("Jenis Pembayaran");
        System.out.println("1. Tunai    ");
        System.out.println("2. Debit    ");
        System.out.println("3. E-Money  ");
        System.out.println("---------------------------------");
        System.out.println("*********************************");
        System.out.println(" Pilih Jenis Pembayaran : ");
        pilih = sc.nextInt();

        switch (pilih) {
            // TUNAI 
            case 1:
                System.out.print("Masukkan jumlah yang dibayar : ");
                pembayaran = sc.nextDouble();
                total_harga = total_harga;
                kembalian = pembayaran - total_harga;
                break;
            // DEBIT
            case 2 :
                System.out.print("Masukkan jumlah yang dibayar : ");
                pembayaran = sc.nextDouble();
                total_harga = (harga_barang * pajak1)+harga_barang;
                kembalian = pembayaran - total_harga;
                break;
            // E-Money
            case 3 :
                System.out.print("Masukkan jumlah yang dibayar : ");
                pembayaran = sc.nextDouble();
                total_harga = total_harga + (total_harga*0.1);
                total_harga =(harga_barang * pajak2)+harga_barang;
                kembalian = pembayaran - total_harga;
                break;
            default:
                System.out.println("Maaf, Silahkan pilih angka yang sesuai.");
                break;
        }
         
        // OUTPUT STRUK PEMBAYARAN
        System.out.println("");
        System.out.println("\n\n---- STRUK PEMBELIAN ----");
        System.out.println("Nama Pelanggan\t: " + pelanggan);
        System.out.println("Nama Barang\t: " + nama_barang);
        // System.out.println("Catatan\t\t: " + catatan);
        System.out.println("Harga per Item\t: " + harga_barang);
        System.out.println("\nJumlah Barang\t: " + jml_barang);
        System.out.println("Total Harga\t: " + total_harga);
        // System.out.println("Tunai\t\t: " + pembayaran);
        System.out.println("Kembalian\t: " + kembalian);
        System.out.println("\n---- TERIMA KASIH ----");

 
    }
    
}
       // Tambahan note atau request
        // Diskon & Voucher
        // Biaya Charge/Penalty
