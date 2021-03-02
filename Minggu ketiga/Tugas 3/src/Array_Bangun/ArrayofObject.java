package Array_Bangun;


import Array_Bangun.balok;
import Array_Bangun.kubus;
import Array_Bangun.tabung;
import java.util.Scanner;


public class ArrayofObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        balok[] bkArray = new balok[2];
        kubus[] kbArray = new kubus[2];
        tabung[] tbArray = new tabung[2];
       
        for (int i = 0;i < 2; i++){
            bkArray[i] = new balok(0,0,0);
            System.out.println("Masukkan panjang: ");
            bkArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan lebar: ");
            bkArray[i].lebar = sc.nextInt();
            System.out.println("Masukkan tinggi: ");
            bkArray[i].tinggi = sc.nextInt();
            
            kbArray[i] = new kubus(0);
            System.out.println("Masukkan sisi: ");
            kbArray[i].sisi = sc.nextInt();
            
            tbArray[i] = new tabung(0,0);
            System.out.println("Masukkan jari - jari: ");
            tbArray[i].jari_jari = sc.nextInt();
            System.out.println("Masukkan tinggi: ");
            tbArray[i].tinggi = sc.nextInt();
    }
        for(int i = 0; i < 2; i++){
            System.out.println("Balok ke- :"+i);
            System.out.println("Luas permukaan: "+bkArray[i].hitungLuasPermukaanBalok()+ "Volume: "+bkArray[i].hitungVolumeBalok());
            System.out.println("Kubus ke- :"+i);
            System.out.println("Luas permukaan: "+kbArray[i].hitungLuasPermukaanKubus()+ "Volume: "+kbArray[i].hitungVolumeKubus());
            System.out.println("Tabung ke- :"+i);
            System.out.println("Luas permukaan: "+tbArray[i].luasPermukaanTabung()+ "Volume: "+tbArray[i].volumeTabung());
        }
    }
}
