
package Array2D;

import java.util.Scanner;

public class MainArray {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        PencarianArray2D data = new PencarianArray2D();
        int jumlah1 = 4;
        int jumlah2 = 2;
        
        System.out.println("--------------------------------------");
        System.out.println("Masukkan data dari yang terkecil");
        for(int i = 0; i < jumlah1; i++){
            for(int k =0; k < jumlah2; k++){
        
            System.out.println("----------------");
            System.out.print("Nim/t : ");
            int nilai = s.nextInt();
            
            Array2D A = new Array2D(nilai);
            data.Tambah(A);
        }
        }
        
        System.out.println("______________________________________");
        System.out.println("______________________________________");
        System.out.println("Pencarian data : ");
        System.out.println("Masukkan Nilai : ");
        int cari = s.nextInt();
        System.out.println("Pencarian dengan sequential search");
        int posisi = data.FindSeqSearch(cari);
        

}
}
