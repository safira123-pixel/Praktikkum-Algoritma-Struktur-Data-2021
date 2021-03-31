
package Array1D;

import java.util.Scanner;

public class MainArray1D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        PencarianArray1D data = new PencarianArray1D();
        int jum = 10;
        
        System.out.println("--------------------------------------");
        System.out.println("Masukkan data secara urut dari yang terkecil");
        for(int i = 0; i < jum; i++){
            System.out.println("----------------");
            System.out.print("Nilai : ");
            int nilai = s.nextInt();
            
             Array1D a = new Array1D(nilai);
            data.Tambah(a);
}
        
         System.out.println("--------------------------------------");
        System.out.println("Data keseluruhan: ");
        data.Tampil();
        
        
        System.out.println("______________________________________");
        System.out.println("______________________________________");
        System.out.println("Pencarian data : ");
        System.out.println("Masukkan Nilai yang dicari : ");
        System.out.println("Nilai : ");
        int cari = s.nextInt();
        
        System.out.println("=====================================");
        System.out.println("menggunakan binary search");
        int posisi = data.FindBinarySearch(cari, 0, jum - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
