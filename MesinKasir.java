package Minggu3;

import java.util.Scanner;

public class MesinKasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VARIABEL DAN JENIS DATA
        String nama_barang;
        int jml_barang, harga_barang;
        double pembayaran,total_harga,kembalian;

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
