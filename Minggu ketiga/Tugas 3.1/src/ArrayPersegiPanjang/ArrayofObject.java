package ArrayPersegiPanjang;

import java.util.Scanner;
public class ArrayofObject {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("Berapa banyak persegi panjang yang ada: ");
        int jumlah = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[jumlah];
        for(int i = 0; i < 3; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Pesegi panjang ke -"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        
       for(int i = 0; i < 3; i++){
           System.out.println("Persegi panjang ke -"+i);
           System.out.println("Panjang: "+ppArray[i].panjang+ "Lebar: "+ppArray[i].lebar);
       }
    }
    }
