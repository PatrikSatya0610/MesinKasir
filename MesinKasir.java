
import java.time.LocalDate;
import java.util.Scanner;

public class MesinKasir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        // VARIABEL DAN TIPE DATA UTAMA
        String nama_barang = "", pelanggan, catatan="",konfirmasi,voucher;
        int jml_barang=0, harga_barang=0,pilih;
        double total_harga=0,kembalian=0,pajak1,pajak2,pembayaran=0, diskon=0;
        pajak1= 0.05;
        pajak2= 0.01;

        // VARIABEL DAN TIPE DATA MENU
        String menu= "";
        int menu_item ;
        String suhu="";
        int input_menu=0;
        int harga_menu[] ={20000,22000,17000,15000};
        
        // VARIABEL DAN TIPE DATA RESERVASI
        String nama_pelanggan, nomor_kontak, nama_pegawai;
        int jumlah_tamu = 0;
        int[] nomor_meja = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

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
           
        //DISPLAY MENU
        System.out.println(" ------------------------------------------------------- ");
        System.out.println("|                     LARAVEL COFFEE                    |");
        System.out.println("|                          MENU                         |");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|COFFEE :                    HOT            ICE         |");
        System.out.println("|   1.CAPPUCINO           : Rp 20.000     Rp 22.000     |");
        System.out.println("|   2.COFFEE LATTE        : Rp 20.000     Rp 22.000     |");
        System.out.println("|   3.VANILLA LATTE       : Rp 20.000     Rp 22.000     |");
        System.out.println("|   4.HAZELNUT LATTE      : Rp 20.000     Rp 22.000     |");
        System.out.println("|   5.STRAWBERY LATTE     : Rp 20.000     Rp 22.000     |");
        System.out.println("|   6.AMERICANO           : Rp 15.000     Rp 17.000     |");
        System.out.println("|   7.PICCOLO LATTE       : Rp 15.000                   |");
        System.out.println("|   8.CARAMEL MACHIATO    : Rp 20.000     Rp 22.000     |");
        System.out.println("|   9.COFFEEMILK          :               Rp 20.000     |");
        System.out.println("|                                                       |");
        System.out.println("|MANUAL BREW :                                          |");
        System.out.println("|   10.VIETNAM DRIP        : Rp 22.000                  |");
        System.out.println("|   11.V60                 : Rp 22.000                  |");
        System.out.println("|   12.JAPANESE            : Rp 22.000                  |");
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
            
                // System.out.print("Masukkan nama barang :");
                // nama_barang = sc.next();
                // System.out.print("Masukkan catatan pelanggan :");
                // catatan = sc.next();
                // sc.next();
                // System.out.print("Masukkan harga per item : ");
                // harga_barang = sc.nextInt();
                // System.out.print("Masukkan jumlah barang yang dibeli :");
                // jml_barang = sc.nextInt();
                // System.out.println("");
                for (String a = "Y"; a.equals("Y")||a.equals("y"); )
                {
                    System.out.print ("Masukkan Nomor Pesanan : ");
                    menu_item = sc.nextInt();
        
                    System.out.print("Masukkan Banyak Pesanan : ");
                    jml_barang = sc.nextInt();
                    if (menu_item == 1)
                    {
                        menu = "Cappucino";
                        System.out.println("Ingin Hot / Ice?");
                        suhu = sc.next();
                        if (suhu.equalsIgnoreCase("hot")) {
                            System.out.println("Cappucino Hot");
                            total_harga= harga_menu[0] * jml_barang;
                        }else if (suhu.equalsIgnoreCase("ice")){
                            System.out.println("Cappucino Ice");
                            total_harga= harga_menu[1] * jml_barang;
                        }
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else if(menu_item == 2){
                        menu = "Coffe Latte";
                        System.out.println("Ingin Hot / Ice?");
                        suhu = sc.next();
                        if (suhu.equalsIgnoreCase("hot")) {
                            System.out.println("Coffee Latte Hot");
                            total_harga= harga_menu[0] * jml_barang;
                        }else if (suhu.equalsIgnoreCase("ice")){
                            System.out.println("Coffee latte Ice");
                            total_harga= harga_menu[1] * jml_barang;
                        }
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else{
                        System.out.println("Maaf Menu Yang Anda Pilih Tidak Tersedia.");
                    }
                        System.out.println("Apakah anda mau memesan lagi? Y/T");
                        a = sc.next();
                }
            }else if(konfirmasi.equalsIgnoreCase("2")){

                System.out.print("Nama Kasir\t\t: ");
                nama_pegawai = sc.nextLine();
                System.out.print("Nama Pelanggan\t\t: ");
                nama_pelanggan = sc.nextLine();
                System.out.print("Nomor Pelanggan\t\t: ");
                nomor_kontak = sc.nextLine();
        
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
        
                int pilihMeja = sc.nextInt();
        
                // memeriksa ketersediaan meja 
                if (pilihMeja >= 1 && pilihMeja <= nomor_meja.length) {
                    System.out.println("Meja " + pilihMeja);
                } else {
                    System.out.println("Silahkan Pilih Nomor Meja Yang Tersedia");
                }
        
                System.out.print("Jumlah Pelanggan\t: ");
                jumlah_tamu = sc.nextInt();
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
            }else if(konfirmasi.equalsIgnoreCase("9")){
                break;
            }
            
            total_harga = harga_barang * jml_barang;
        }while (i>0) ;

        //  PROSES DATA

        // INPUT DATA STRUK PEMBAYARAN
         System.out.print("Masukkan nama pelanggan :");
         pelanggan = sc.next();

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
        System.out.println("\n\n*****************************");
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
                total_harga = harga_barang * jml_barang;
                kembalian = pembayaran - total_harga;
                break;
            // DEBIT
            case 2 :
                System.out.print("Masukkan jumlah yang dibayar : ");
                pembayaran = sc.nextDouble();
                total_harga = (total_harga * pajak1)+total_harga;
                kembalian = pembayaran - total_harga;
                break;
            // E-Money
            case 3 :
                System.out.print("Masukkan jumlah yang dibayar : ");
                pembayaran = sc.nextDouble();
                total_harga =(total_harga * pajak2)+total_harga;
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
        System.out.println("Catatan\t\t: " + catatan);
        System.out.println("Harga per Item\t: " + harga_barang);
        System.out.println("\nJumlah Barang\t: " + jml_barang);
        System.out.println("Total Harga\t: " + total_harga);
        System.out.println("Kembalian\t: " + kembalian);
        System.out.println("\n---- TERIMA KASIH ----");

 
    }
    
}
       // Tambahan note atau request
        // Diskon & Voucher
        // Biaya Charge/Penalty
