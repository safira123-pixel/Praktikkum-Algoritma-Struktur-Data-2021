
package Sum;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int p = 1; p >= 1 ; p++) {
        System.out.println("program menghitung keuntungan total perusahaan");
        System.out.println("Menu : 1. perhitungan total perusahaan, 2. selesai");
        System.out.println("pilih menu : ");
        int menu = sc.nextInt();
        if (menu == 1){
            
        String angka = null;
        System.out.print(" perhitungan keuntungan perusahaan ke -");
        angka = sc.nextLine();
        
        System.out.println("==================================");
        System.out.println("Program menghitung keuntungan total(Satuan juta. misal 5.9)");
        System.out.print("Masukkan jumlah bulan: ");
        int elm = sc.nextInt();
        
        Sum sm = new Sum(elm);
        System.out.println("==================================");
        for(int i =0; i < sm.elemen; i++){
            System.out.println("Masukkan keuntungan bulan"+(i+1)+" : ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        
        System.out.println("===================================");
        System.out.println("algoritma Brute force");
        System.out.println("total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.TotalBF(sm.keuntungan));
        System.out.println("===================================");
        System.out.println("algoritma Divide Conquer");
        System.out.println("total keuntungan prusahaan selama "+sm.elemen+" bulan adalah = "+sm.TotalDC(sm.keuntungan, 0, sm.elemen-1));
    } else {
            System.out.println("Selesai");
        }
   
}
}
}
    

