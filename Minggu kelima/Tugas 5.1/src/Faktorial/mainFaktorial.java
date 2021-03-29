package Faktorial;


import Faktorial.Faktorial;
import java.util.Scanner;


public class mainFaktorial {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("====================================");
    System.out.print("MAsukkan jumlah elemen yang akan dihitung : ");
    int elemen = sc.nextInt();
    
    Faktorial[] fk = new Faktorial[elemen];
    for(int i = 0; i < elemen; i++){
        fk[i] = new Faktorial();
        System.out.print("Masukkan nilai data ke-"+(i+1)+": ");
        fk[i].nilai = sc.nextInt();
    }
    
    System.out.println("======================================");
    System.out.println("Hasil faktorial dengan brute force");
    for(int i = 0; i < elemen; i++){
        System.out.println(" Faktorial dari nilai "+fk[i].nilai+" adalah: "+fk[i].faktorialBF(fk[i].nilai));
    }
    
    System.out.println("======================================");
    System.out.println("Hasil faktorial dengan Divide and Conquer");
    for(int i = 0; i < elemen; i++){
        System.out.println(" Faktorial dari nilai "+fk[i].nilai+" adalah: "+fk[i].faktorialDC(fk[i].nilai));
}
    
    double start = System.nanoTime();
        int l = 0;
        for(int i=0; i<1000; i++){
            for(int j=0; j<1000; j++){
                for(int k=0; k<1000; k++){
                    l++;
                }
            }
        }
        double finish = System.nanoTime();
        System.out.println("waktu eksekusi program: "+(finish-start));
    }
}



