
import java.util.Scanner;


public class MenghitungLuas {
    public static void main(String[] args) {
        int menu = 0;
    MenuPerhitungan(menu);   
    }
    
    static int MenuPerhitungan(int menu){
        int X = 0;
            Scanner pilih = new Scanner(System.in);
        for (int i = 1; i >= 1 ; i++) {
System.out.println("Menu Perhitungan Luas");
System.out.println("1. Luas Segitiga");
System.out.println("2. Luas Persegi Panjang");
System.out.println("3. Luas Lingkaran");
System.out.print("Pilih Menu : ");
menu = pilih.nextInt();
   if (menu == 1) {
       double perhitungan1 = 0;
       LuasSegitiga(perhitungan1);
   } else if (menu == 2){
    double perhitungan2 = 0;
       LuasPersegiPanjang(perhitungan2);
   } else if (menu == 3){
    double perhitungan3 = 0;
       LuasLingkaran(perhitungan3);
   } else 
     break;
  }
        return X;
    }
    
      static double LuasSegitiga( double perhitungan1){
      int Ls = 0;  
      int alas;
      int tinggi;
      double luas;
       Scanner masukkan = new Scanner(System.in);
       System.out.print("Masukkan alas: ");
       alas = masukkan.nextInt();
       System.out.print("Masukkan tinggi: ");
       tinggi = masukkan.nextInt();
       luas = (double)(alas * tinggi * 0.5);
       System.out.println("Luas Segitiga adalah: " +luas);
        return Ls;
    }
      static double LuasPersegiPanjang(double perhitungan2) {
          int Lpp = 0;
          int panjang;
          int lebar;
          double Luas;
          Scanner masukkan = new Scanner(System.in);
          System.out.print("Masukkan Panjang: ");
          panjang = masukkan.nextInt();
          System.out.print("Masukkan Lebar: ");
          lebar = masukkan.nextInt();
          Luas = (double)(panjang * lebar);
          System.out.println("Luas Persegi Panjang adalah: " +Luas);
        return Lpp;
      }
      static double LuasLingkaran(double perhitungan3){
          int Ll = 0;
          double phi = 3.14;
          int jari_jari;
          double Luas;
          Scanner masukkan = new Scanner(System.in);
          System.out.println("Masukkan jari - jari: ");
          jari_jari = masukkan.nextInt();
          Luas = (double)(phi * jari_jari * jari_jari);
          System.out.println("Luas lingkaran adalah: " +Luas);
          return Ll;
      }
}
