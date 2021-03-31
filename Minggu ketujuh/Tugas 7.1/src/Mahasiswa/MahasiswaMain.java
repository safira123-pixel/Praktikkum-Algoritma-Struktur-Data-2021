
package Mahasiswa;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        PencarianMahasiswa data = new PencarianMahasiswa();

        System.out.println("--------------------------------------");
        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumMhs = s.nextInt();
        System.out.println("--------------------------------------");
        System.out.println("Masukkan data mashasiswa secara urut dari Nim terkecil");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("----------------");
            System.out.print("Nim/t : ");
            int nim = s.nextInt();
            System.out.print("Nama/t : ");
            String nama = sl.nextLine();
            System.out.print("Umur/t : ");
            int umur = s.nextInt();
            System.out.print("Ipk/t : ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.Tambah(m);
        }
        
        System.out.println("--------------------------------------");
        System.out.println("Data keseluruhan mahasiswa: ");
        data.Tampil();
      
        System.out.println("______________________________________");
        System.out.println("______________________________________");
        System.out.println("Pencarian data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
        System.out.println("=Nim : ");
        int cari = s.nextInt();
        System.out.println("Pencarian dengan sequential search");
        int posisi = data.FindSeqSearch(cari);
        
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        
        System.out.println("=====================================");
        System.out.println("menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        //data.bubleShort();
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
   
}
