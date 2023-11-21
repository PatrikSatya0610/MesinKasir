import java.time.LocalDate;
import java.util.Scanner;

public class MesinKasir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        // VARIABEL DAN TIPE DATA UTAMA
        String nama_barang, pelanggan, catatan,konfirmasi,voucher;
        int jml_barang=0, harga_barang = 0,pilih;
        double harga=0,kembalian=0,pajak1,pajak2,pembayaran=0, diskon=0;
        pajak1 = 0.05;
        pajak2 = 0.01;

        // VARIABEL DAN TIPE DATA MENU
        String menu= "";
        int menu_item ;
        String suhu="";
        int input_menu =0;
        int harga_menu[] ={20000,22000,17000,15000};
        
        // VARIABEL DAN TIPE DATA RESERVASI
        String nama_pelanggan, nomor_kontak, nama_pegawai;
        int jumlah_tamu = 0;
        int[] nomor_meja = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        // Variabel untuk kebutuhan struk pembelian
        String[] nama_menu = new String[10];
        int[] jumlah_menu = new int[10];
        double[] harga_item = new double[10];
        double total_harga = 0;
        int index_menu = 0;

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
        System.out.println("|   10.VIETNAM DRIP        : Rp 15.000                  |");
        System.out.println("|   11.V60                 : Rp 20.000                  |");
        System.out.println("|   12.JAPANESE            : Rp 20.000                  |");
        System.out.println(" ------------------------------------------------------- ");

        // INPUT DATA
        System.out.println("Silahkan Pilih Fitur Dibawah");
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
                            harga= harga_menu[0] * jml_barang;
                        }else if (suhu.equalsIgnoreCase("ice")){
                            System.out.println("Cappucino Ice");
                            harga= harga_menu[1] * jml_barang;
                        }
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ harga);
                        nama_menu[index_menu] = menu;
                        jumlah_menu[index_menu] = jml_barang;
                        harga_item[index_menu] = harga/jml_barang;
                        total_harga += harga;
                        index_menu++;
                        System.out.println(index_menu);
                    }else if(menu_item == 2){
                        menu = "Coffee Latte";
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
                        nama_menu[index_menu] = menu;
                        jumlah_menu[index_menu] = jml_barang;
                        harga_item[index_menu] = total_harga/jml_barang;
                        total_harga += harga;
                        index_menu++;
                        System.out.println(index_menu);

                    }else if(menu_item == 3){
                        menu = "Vanilla Latte";
                        System.out.println("Ingin Hot / Ice?");
                        suhu = sc.next();
                        if (suhu.equalsIgnoreCase("hot")) {
                            System.out.println("Vanilla Latte Hot");
                            total_harga= harga_menu[0] * jml_barang;
                        }else if (suhu.equalsIgnoreCase("ice")){
                            System.out.println("Vanilla latte Ice");
                            total_harga= harga_menu[1] * jml_barang;
                        }
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else if(menu_item == 4){
                        menu = "Hazelnut Latte";
                        System.out.println("Ingin Hot / Ice?");
                        suhu = sc.next();
                        if (suhu.equalsIgnoreCase("hot")) {
                            System.out.println("Hazelnut Latte Hot");
                            total_harga= harga_menu[0] * jml_barang;
                        }else if (suhu.equalsIgnoreCase("ice")){
                            System.out.println("Hazelnut latte Ice");
                            total_harga= harga_menu[1] * jml_barang;
                        }
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else if(menu_item == 5){
                        menu = "Strawbery Latte";
                        System.out.println("Ingin Hot / Ice?");
                        suhu = sc.next();
                        if (suhu.equalsIgnoreCase("hot")) {
                            System.out.println("Strawbery Latte Hot");
                            total_harga= harga_menu[0] * jml_barang;
                        }else if (suhu.equalsIgnoreCase("ice")){
                            System.out.println("Strawbery latte Ice");
                            total_harga= harga_menu[1] * jml_barang;
                        }
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else if(menu_item == 6){
                        menu = "Americano";
                        System.out.println("Ingin Hot / Ice?");
                        suhu = sc.next();
                        if (suhu.equalsIgnoreCase("hot")) {
                            System.out.println("Americano Hot");
                            total_harga= harga_menu[2] * jml_barang;
                        }else if (suhu.equalsIgnoreCase("ice")){
                            System.out.println("Americano Ice");
                            total_harga= harga_menu[3] * jml_barang;
                        }
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else if(menu_item == 7){
                        menu = "Picolo Latte";
                        total_harga= harga_menu[2] * jml_barang;
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else if(menu_item == 8){
                        menu = "Caramel Machiato";
                        System.out.println("Ingin Hot / Ice?");
                        suhu = sc.next();
                        if (suhu.equalsIgnoreCase("hot")) {
                            System.out.println("Caramel Machiato Hot");
                            total_harga= harga_menu[0] * jml_barang;
                        }else if (suhu.equalsIgnoreCase("ice")){
                            System.out.println("Caramel Machiato Ice");
                            total_harga= harga_menu[1] * jml_barang;
                        }
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else if(menu_item == 9){
                        menu = "Coffeemilk";
                        total_harga= harga_menu[1] * jml_barang;
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else if(menu_item == 10){
                        menu = "Vietnam Drip";
                        total_harga= harga_menu[2] * jml_barang;
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else if(menu_item == 11){
                        menu = "V60";
                        total_harga= harga_menu[0] * jml_barang;
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else if(menu_item == 12){
                        menu = "Japanese";
                        total_harga= harga_menu[0] * jml_barang;
                        System.out.println("Menu Pesanan Anda : " + menu +"    x"+ jml_barang+"   |  Rp. "+ total_harga);
                    }else{
                        System.out.println("Maaf Menu Yang Anda Pilih Tidak Tersedia.");
                    }
                        System.out.println("Apakah anda mau memesan lagi? Y/T");
                        a = sc.next();
                }
            }else if(konfirmasi.equalsIgnoreCase("2")){

                System.out.print("Nama Kasir\t\t: ");
                nama_pegawai = sc.next();
                System.out.print("Nama Pelanggan\t\t: ");
                nama_pelanggan = sc.next();
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
        }while (i>0) ;

        //  PROSES DATA

        // INPUT DATA STRUK PEMBAYARAN
         System.out.print("Masukkan nama pelanggan :");
         pelanggan = sc.next();

        //  PROSES DATA STRUK PEMBAYARAN
        System.out.println("Total Harga : " + total_harga);

         // PROSES DATA VOUCHER
        System.out.println("Masukkan Kode Voucher : ");
        voucher = sc.next();
            if (voucher.equals("LRVL03")){
                if (total_harga <= 100000){
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
                kembalian = pembayaran - total_harga;
                break;
            // DEBIT
            case 2 :
                System.out.print("Masukkan jumlah yang dibayar : ");
                pembayaran = sc.nextDouble();
                kembalian = pembayaran - total_harga;
                break;
            // E-Money
            case 3 :
                System.out.print("Masukkan jumlah yang dibayar : ");
                pembayaran = sc.nextDouble();
                kembalian = pembayaran - total_harga;
                break;
            default:
                System.out.println("Maaf, Silahkan pilih angka yang sesuai.");
                break;
        }
         
        // OUTPUT STRUK PEMBAYARAN
        System.out.println("");
        System.out.println("\n\n---- STRUK PEMBELIAN ----");
        System.out.println("Nama Pelanggan\t: " + pelanggan + "\n");
        for (int j = 0; j < index_menu; j++) {
            System.out.println("Nama Barang\t: " + nama_menu[j]);
            System.out.println("Harga per Item\t: " + harga_item[j]);
            System.out.println("Jumlah Barang\t: " + jumlah_menu[j]);
            System.out.println(" ");
        }
        System.out.println("Diskon\t\t: " + diskon);
        System.out.println("Total Harga\t: " + total_harga);
        System.out.println("Uang yang dibayarkan\t: " + pembayaran);
        System.out.println("Kembalian\t: " + kembalian);
        System.out.println("\n---- TERIMA KASIH ----");

 
    }
    
    
}
       // Tambahan note atau request
        // Diskon & Voucher
        // Biaya Charge/Penalty