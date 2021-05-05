

package Nomor_1;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            DLL dll = new DLL();
            int pilih;
            
            do {
            System.out.println("-------------------------------------------");
            System.out.println("PROGRAM PENGOLAHAN ANGKA DOUBLE LINKED LIST");
            System.out.println("-------------------------------------------");
            System.out.println("1.Tambah Head");
            System.out.println("2.Tambah Tail");
            System.out.println("3.Tambah Data");
            System.out.println("4.Hapus Data Pertama");
            System.out.println("5.Hapus Data Terakhir");
            System.out.println("6.Hapus Data Tertentu");
            System.out.println("7.Cetak");
            System.out.println("8.Cari");
            System.out.println("9.Urut Data");
            System.out.println("10.Keluar");
            System.out.print("Pilih(1-10): ");
            pilih = sc.nextInt();
            
            switch (pilih) {
                
            case 1:
            System.out.print("Masukkan Data Posisi Head: ");
            int head = sc.nextInt();
            dll.addFirst(head);
            break;
                
            case 2:
            System.out.print("Masukkan Data Posisi Tail: ");
            int tail = sc.nextInt();
            dll.addLast(tail);
            break;
                
            case 3:
            System.out.print("Masukkan Data : ");
            int data = sc.nextInt();
            System.out.print("Alamat Pointer: ");
            int pointer = sc.nextInt();
            dll.add(data, pointer);
            break;
                
            case 4:
            dll.removeFirst();
            break;
                
            case 5:
            dll.removeLast();
            break;
                
            case 6:
            System.out.print("Masukkan Index: ");
            int idx = sc.nextInt();
            dll.remove(idx);
            break;
                
            case 7:
            dll.print();
            break;
                
            case 8:
            System.out.print("Masukkan Data yang dicari: ");
            int cari = sc.nextInt();
            int seq = dll.seqSearch(cari);
            if (seq != -1) {
            System.out.println("Data " + cari + "berada pada node ke-" + seq);
            } else {
            System.out.println("Tidak diketemukan");
            }
            break;
                
            case 9:
            System.out.println("Data:");
            dll.bubbleSort();
            dll.print();
            break;
                
            default:
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9);
    }
}
