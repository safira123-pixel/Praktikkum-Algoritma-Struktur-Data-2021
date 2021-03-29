
package Perhitungansuara;

import java.util.Scanner;

public class SuaraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("==================================");
        System.out.println("Program jumlah suara");
        System.out.print("Masukkan jumlah suara: ");
        int suara = sc.nextInt();
        
        SuaraKandidat sm = new SuaraKandidat(suara);
        System.out.println("==================================");
        for(int i =0; i < sm.elemen; i++){
            System.out.println("Masukkan Nama ke "+(i+1)+" : ");
            sm.Nama[i] = sc.nextLine();
        }
        
        System.out.println("===================================");
        System.out.println("algoritma Divide Conquer");
        System.out.println("total suara terbanyak dengan jumlah suara "+sm.elemen+" adalah = "+sm.TotalDC(sm.Nama, 0, sm.elemen-1));
        }
   
}


