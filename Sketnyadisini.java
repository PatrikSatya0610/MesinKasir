import java.time.LocalDate;
import java.util.Scanner;

public class Sketnyadisini{
    // VARIABEL GLOBAL
    static int index_menu = 0;
    static int suhu_menu;
    static String nama_barang, pelanggan, catatan, voucher;
    static String nama_pelanggan, nomor_kontak, nama_pegawai;
    static double harga = 0, kembalian = 0, pembayaran = 0, diskon = 0, pajak1 = 0.05, pajak2 = 0.01;
    static double total_harga = 0;
    static int jml_barang = 0, harga_barang = 0, pilih;
    static int menu_item;
    static int getSuhu;
    static int konfirmasi = 0;
    static int input_menu = 0;
    static int mejaCounter = 1;
    static int pilihMeja = 0;
    static int jumlah_tamu = 0;
    
    //ARRAY GLOBAL
    static String[][] menuDanHarga = {
        {"Cappucino","20000","22000"},
        {"Coffee Latte","20000","22000"},
        {"Vanilla Latte","20000","22000"},
        {"Hazelnut Latte","20000","22000"},
        {"Strawberry Latte","20000","22000"},
        {"Americano","15000","17000"},
        {"Piccolo Latte","15000",""},
        {"Caramel Machiato","20000","22000"},
        {"Coffeemilk","","20000"},
        {"Vietnam Drip","15000",""},
        {"V60","20000",""},
        {"Japanese","20000"}
    };
    static String[] suhu = {"Hot","Ice"};
    public static String[] nama_menu = new String[15];
    static double[] harga_item = new double[10];
    static double[] total_hargaitem = new double[10];
    static int[][] nomor_meja = new int[4][8];
    static int[] harga_menu = { 20000, 22000, 17000, 15000 };
    static int[] jumlah_menu = new int[10];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        initNomorMeja();
        
        String username, password; 
        boolean stop = true;
        for (int Try = 1; Try <= 3; Try++) {
            System.out.print("Enter Username : ");
            username = sc.nextLine();
            System.out.print("Enter Password : ");
            password = sc.nextLine();
            if (loginAdmin(username, password)) {
                System.out.println("Login berhasil. Selamat datang, Admin!");
                break;
            } else if (Try < 3) {
                System.out.println("Login gagal. Silakan coba lagi.");
            } else if (Try == 3){
                System.out.println("Anda sudah mencoba sebanyak 3x. Silahkan coba lagi nanti.");
                sc.close();
            }
        }
        do {
            switch (pilihFitur(konfirmasi)) {
                case 1:
                    menampilkanMenu();
                    memilihMenu();
                    memilihPembayaran();
                    menampilkanStrukPembayaran();
                    break;
                case 2 :
                    inputDataReservasi();
                    cetakBuktiReservasi(prosesReservasi());
                    break;
                case 3 :
                
                case 0 :
                    System.out.println("----- THANK YOU !!! -----");
                    stop = false;
                    break;
                default:
                    System.out.println("Fitur tidak tersedia. Silahkan coba lagi.");
                    break;
                }
        } while (stop);
    }
    
    private static boolean loginAdmin(String username, String password) {
        return username.equals("admin") && password.equals("123");
    }
        
    public static int pilihFitur(int konfirm){
        Scanner sc = new Scanner(System.in);
            System.out.println("---------- Pilih Fitur ----------");
            System.out.println("| 1. Menu                       |");
            System.out.println("| 2. Reservasi                  |");
            System.out.println("| 3. Laporan Penjualan          |");
            System.out.println("| 0. Exit                       |");
            System.out.println("|                               |");
            System.out.println("---------------------------------");
            System.out.print("Pilih Fitur : ");
            konfirm = sc.nextInt();
            return konfirm;
    }
            
        // DISPLAY MENU
    public static void menampilkanMenu(){
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
        }
        
        // INPUT DATA
        
        static void memilihMenu(){
            int hargaPesanan;
            Scanner sc = new Scanner(System.in);
            for (String a = "Y"; a.equals("Y") || a.equals("y");) {
                System.out.print("Masukkan Nomor Pesanan : ");
                menu_item = sc.nextInt();
                    // System.out.println(menu[menu_item]);
                    String[] pesananDanHarga = pilihPesananDanHarga(menuDanHarga, menu_item);
                    String pesananTerpilih = pesananDanHarga[0];
                    System.out.println("(1) Hot / (2) Ice : ");
                    getSuhu = sc.nextInt();
                    hargaPesanan = Integer.parseInt(pesananDanHarga[getSuhu]);
                    System.out.print("Masukkan Banyak Pesanan : ");
                    jml_barang = sc.nextInt();
                    total_hargaitem[index_menu]= jml_barang * hargaPesanan;
                    System.out.println(
                            "Menu Pesanan Anda : " + pesananTerpilih + " "+suhu[getSuhu-1]+"    x" + jml_barang + "   |  Rp. " + total_hargaitem[index_menu]);
                    menyimpanPesanan(menu_item,getSuhu);
                    
                    System.out.println("Apakah anda mau memesan lagi? Y/T");
                    a = sc.next();
                }
                System.out.print("Masukkan nama pelanggan :");
                pelanggan = sc.next(); 
            }

        private static String[] pilihPesananDanHarga (String[][] daftarPesananHarga, int nomorPesanan) {
            // Indeks array dimulai dari 0, jadi kurangi nomor pesanan dengan 1
                int indexPesanan = nomorPesanan - 1;
                return daftarPesananHarga[indexPesanan];
            }

            static void menyimpanPesanan (int menu_item,int getSuhu){
            nama_menu [index_menu] = menuDanHarga[menu_item - 1][0];
            jumlah_menu[index_menu] = jml_barang;
            harga_item[index_menu] = total_hargaitem[index_menu] / jml_barang;
            total_harga += total_hargaitem[index_menu];
            index_menu++;
        }
            // RESERVASI
            static void inputDataReservasi(){
            Scanner input = new Scanner(System.in);
            // INPUT DATA
            System.out.println("*************************************************************************");
            System.out.print("Nama Kasir\t\t: ");
            nama_pegawai = input.nextLine();
            System.out.print("Nama Pelanggan\t\t: ");
            nama_pelanggan = input.nextLine();
            System.out.print("Nomor Pelanggan\t\t: ");
            nomor_kontak = input.nextLine();
        }   
        
        private static boolean prosesReservasi(){
            Scanner input = new Scanner(System.in);
            boolean mejaTersedia = false;
            int coba = 1; 
            // Tampilan nomor meja
            System.out.println(" -------------------------------------------------------- ");
            System.out.println("|________________________________________________________|");
            System.out.println("|                    MEJA RESERVASI                      |");
            System.out.println("|                    LARAVEL COFFEE                      |");
            System.out.println("|________________________________________________________|");
            for (int i = 0; i < nomor_meja.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < nomor_meja[i].length; j++) {
                    System.out.printf(" %4d |", nomor_meja[i][j]);
                }
                System.out.println("\n|________________________________________________________|");
            }
            do {
                pilihMeja = input.nextInt();
                coba++;
                for (int i = 0; i < nomor_meja.length; i++) {
                    for (int j = 0; j < nomor_meja[i].length; j++) {
                        if (nomor_meja[i][j] == pilihMeja && nomor_meja[i][j] != 0) {
                            System.out.println("Meja " + pilihMeja + " tersedia.");
                            mejaTersedia = true;
                            for (int iTamu = 1; iTamu != jumlah_tamu;) {
                                System.out.print("Jumlah Pelanggan\t: ");
                                jumlah_tamu = input.nextInt();
                                if (jumlah_tamu <= 5) {
                                    System.out.println("Jumlah Tamu Yang Akan Duduk: " + jumlah_tamu);
                                    iTamu = jumlah_tamu;
                                } else {
                                    System.out.println("Mohon Maaf Kapasitas Tempat Duduk Terlalu Banyak");
                                }
                            }
                            nomor_meja[i][j] = 0;
                            break;
                        }
                    }
                }
                if (!mejaTersedia) {
                    System.out.println("Meja " + pilihMeja + " tidak tersedia atau sudah diisi. Silahkan pilih meja lain.");
                }
            } while (!mejaTersedia || coba <= 4);
            return mejaTersedia;
        }
        
        static void cetakBuktiReservasi(boolean ketersediaanMeja){
            LocalDate date = LocalDate.now();
            if (ketersediaanMeja) {  
                System.out.println();
                System.out.println("---- BUKTI RESERVASI ----");
                System.out.println("Nama Pelanggan\t\t: " + nama_pelanggan);
                System.out.println("Nomor Pelanggan\t\t: " + nomor_kontak);
                System.out.println("Nomor Meja\t\t: " + pilihMeja);
                System.out.println("Jumlah Pelanggan\t: " + jumlah_tamu);
                System.out.println("Tanggal Reservasi\t: " + date);
                System.out.println("Nama Kasir\t\t: " + nama_pegawai);
                System.out.println("-------------------------");
            }
        }
        
        // INPUT DATA STRUK PEMBAYARAN
        
        // PROSES DATA STRUK PEMBAYARAN
        static double fiturKodeVoucher(){
            // PROSES DATA VOUCHER
            Scanner sc = new Scanner(System.in);
            System.out.println("Masukkan Kode Voucher : ");
            voucher = sc.next();
            for (int i = 1; i <= 3; i++) {                
                if (voucher.equals("LRVL03")) {
                    if (total_harga <= 100000) {
                        diskon = 0.25;
                        System.out.println("Selamat Anda mendapatkan potongan harga sebesar 25%.");
                        break;
                    } else
                    diskon = 0.1;
                    System.out.println("Selamat Anda mendapatkan potongan harga sebesar 10%.");
                    break;
                } else {
                    System.out.println("Kode Voucher Tidak Tersedia. Silahkan coba lagi.");
                }
            }
            total_harga = total_harga - (total_harga * diskon);
            System.out.print("Total Harga = " + total_harga);
            return total_harga;
        }

        // PROSES DATA LAPORAN PENJUALAN
        static void fiturLaporanPenjualan(){
            // output laporan penjualan 
        System.out.println("\n\n---- LAPORAN PENJUALAN ----");
        System.out.printf("%-4s%-20%-16%-18%s\n", "NO. \tMenu\t\tJumlah Terjual\tTotal Penjualan");
        
        for (int k = 0; k < nama_menu.length; k++) {
            if (nama_menu[k] != null) {
                System.out.printf("%-4d%-20s%-16Rp. %18.2f\n",
                    (k+1), nama_menu[k], jumlah_menu[k], total_hargaitem[k]);
            }
        }
        System.out.printf("\n%-40sRp. %18.2f\n", "\nTotal Penjualan Semua Menu: " + total_harga);
        System.out.println("---- LAPORAN PENJUALAN SELESAI ----");
    }
        
        static void memilihPembayaran(){
            Scanner sc = new Scanner(System.in);
            for (int iBayar = 0; iBayar < 1;) {
                // PROSES DATA JENIS PEMBAYARAN
                System.out.println();
                System.out.println("*********************************");
                System.out.println("---------------------------------");
                System.out.println("Jenis Pembayaran");
                System.out.println("1. Tunai    ");
                System.out.println("2. Debit    ");
                System.out.println("3. E-Money  ");
                System.out.println("---------------------------------");
                System.out.println("*********************************");
                System.out.print(" Pilih Jenis Pembayaran : ");
                pilih = sc.nextInt();
                
                switch (pilih) {
                    // TUNAI
                    case 1:
                    System.out.print("Masukkan jumlah yang dibayar : ");
                        pembayaran = sc.nextDouble();
                        kembalian = pembayaran - (fiturKodeVoucher());
                        iBayar++;
                        break;
                        // DEBIT
                        case 2:
                        System.out.print("Masukkan jumlah yang dibayar : ");
                        pembayaran = sc.nextDouble();
                        prosesKembalian(prosesPembayaran(fiturKodeVoucher(), pajak1),pembayaran );
                        iBayar++;
                        break;
                        // E-Money
                        case 3:
                        System.out.print("Masukkan jumlah yang dibayar : ");
                        pembayaran = sc.nextDouble();
                        prosesKembalian(prosesPembayaran(fiturKodeVoucher(), pajak2),pembayaran );
                        iBayar++;
                        break;
                        default:
                        System.out.println("Maaf, Silahkan pilih angka yang sesuai.");
                        break;
                }
            }
        }
        private static double prosesPembayaran(double totHarga, double ppn ){
            totHarga = ((totHarga * ppn) + totHarga);
            return totHarga;
        }

        private static double prosesKembalian(double totHarga, double pembayaran){
            kembalian = pembayaran - totHarga;
            return kembalian;
        }

        static void menampilkanStrukPembayaran(){
            // OUTPUT STRUK PEMBAYARAN
            Scanner sc = new Scanner(System.in);
            LocalDate date = LocalDate.now();
            
            System.out.println("");
            System.out.println("\n\n---- STRUK PEMBELIAN ----");
            System.out.println("Tanggal Pembelian\t: " + date);
            System.out.println("Nama Pelanggan\t\t: " + pelanggan + "\n");
            for (int j = 0; j < index_menu; j++) {
                System.out.println("Nama Barang\t\t: " + nama_menu[j]);
                System.out.println("Harga per Item\t\t: " + harga_item[j]);
                System.out.println("Jumlah Barang\t\t: " + jumlah_menu[j]);
                System.out.println("Total Harga\t\t: " + total_hargaitem[j]);
                System.out.println(" ");
            }
            System.out.println("Diskon\t\t\t: " + diskon);
            System.out.println("Total Harga\t\t: " + total_harga);
            System.out.println("Uang yang dibayarkan\t: " + pembayaran);
            System.out.println("Kembalian\t\t: " + kembalian);
            System.out.println("\n---- TERIMA KASIH ----");
        }
        static void initNomorMeja(){
            for (int i = 0; i < nomor_meja.length; i++) {
                for (int j = 0; j < nomor_meja[i].length; j++) {
                    nomor_meja[i][j] = mejaCounter++;
                }
            }
        }
}

        // Tambahan note atau request
        // Biaya Charge/Penalty
        // Menyimpan pesanan dalam 2 dimensi