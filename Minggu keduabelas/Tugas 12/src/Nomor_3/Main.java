
package Nomor_3;

import java.util.Scanner;

public class Main {
    public static void isiMenu() {
        System.out.println("**********");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("**********");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Peneima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("**********");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QNode queue = new QNode();
        int pilih, index;
        do {
            isiMenu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    int no = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc.nextLine();
                    queue.enqueue(no, nama);
                    break;
                case 2:
                    queue.dequeue();
                    queue.displayQueue();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}

