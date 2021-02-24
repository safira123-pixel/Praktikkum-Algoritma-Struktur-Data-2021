
package Latihan;

public class Lingkaran {
    double Phi;
    double r;
      
    double hitungLuas(){
       double luas = r*r*Phi;
       return luas;
    }
    double hitungKeliling( ){
        double keliling = (r*2.0)*Phi;
        return keliling;
    }
   
    public static void main(String[] args) {
        Lingkaran lkn = new Lingkaran();
        lkn.Phi = 3.14;
        lkn. r = 14;
        
        System.out.println("nilai phi: " +lkn.Phi);
        System.out.println("nilai jari - jari: " +lkn.r);
        
        lkn.hitungLuas();
        System.out.println("Luas lingkaran: " +lkn.hitungLuas()+ "cm");
        
        lkn.hitungKeliling();
        System.out.println("Keliling lingkaran: " +lkn.hitungKeliling()+ "cm");
        
        
    }
}
