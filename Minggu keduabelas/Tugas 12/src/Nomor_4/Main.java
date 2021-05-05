
package Nomor_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL dll = new DLL();
        int pilih;
        
        do {
        System.out.println("--------------------------------");
        System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
        System.out.println("--------------------------------");
        System.out.println("1.Tambah Data Awal");
        System.out.println("2.Tambah Data Akhir");
        System.out.println("3.Tambah Data Index Tertentu");
        System.out.println("4.Hapus Data Pertama");
        System.out.println("5.Hapus Data Terakhir");
        System.out.println("6.Hapus Data Tertentu");
        System.out.println("7.Cetak");
        System.out.println("8.Cari NIM");
        System.out.println("9.Urut Data IPK");
        System.out.println("10.Keluar");
        System.out.print("Pilih(1-10): ");
        pilih = sc.nextInt();
        
        switch (pilih) {
        case 1:
        System.out.println("Masukkan Data Mahasiswa Awal");
        System.out.println("Masukkan NIM : ");
        String nim = sc.next();
        System.out.println("Masukkan Nama: ");
        String nama = sc.next();
        System.out.println("Masukkan IPK : ");
        double ipk = sc.nextDouble();
        dll.addFirst(nim, nama, ipk);
        break;
        case 2:
        System.out.println("Masukkan Data Mahasiswa Akhir");
        System.out.println("Masukkan NIM : ");
        String nimA = sc.next();
        System.out.println("Masukkan Nama: ");
        String namaA = sc.next();
        System.out.println("Masukkan IPK : ");
        double ipkA = sc.nextDouble();
        dll.addLast(nimA, namaA, ipkA);
        break;
        case 3:
        System.out.println("Masukkan Index: ");
        int idx = sc.nextInt();
        System.out.println("Masukkan Data Mahasiswa");
        System.out.println("Masukkan NIM : ");
        String nimM = sc.next();
        System.out.println("Masukkan Nama: ");
        String namaM = sc.next();
        System.out.println("Masukkan IPK : ");
        double ipkM = sc.nextDouble();
        dll.add(namaM, namaM, ipkM, idx);
        break;
        case 4:
        dll.removeFirst();
        break;
        case 5:
        dll.removeLast();
        case 6:
        System.out.println("Masukkan Data yang dihapus: ");
        int hapus = sc.nextInt();
        dll.remove(hapus);
        break;
        case 7:
        dll.print();
        break;
        case 8:
        System.out.println("Masukkan NIM yang dicari: ");
        String cari = sc.next();
        dll.seqSearch(cari);
        break;
        case 9:
        dll.bubbleSort();
        dll.print();
        break;
        default:
        }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5
        || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9);
        }
}
