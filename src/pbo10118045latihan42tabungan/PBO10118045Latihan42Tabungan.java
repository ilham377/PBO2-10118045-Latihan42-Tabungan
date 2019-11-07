/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan42tabungan;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : Muhammad Ilham Apriyadi
 * Kelas    : if 2
 * NIM      : 10118045
 * Deskripsi Program : Tabungan
 */
public class PBO10118045Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("====Program Penarikan Uang====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int ambil = scanner.nextInt();
        System.out.println("Saldo Anda Sekarang : "+tabungan.ambilUang(ambil));
        
    }
    
}
