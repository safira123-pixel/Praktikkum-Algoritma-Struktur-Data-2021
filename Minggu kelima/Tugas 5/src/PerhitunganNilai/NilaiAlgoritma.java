
package PerhitunganNilai;

public class NilaiAlgoritma {
   String namaMhs;
   int nilaiTugas;
   int nilaiKuis;
   int nilaiUTS;
   int nilaiUAS;
   public int elemen;
   public double keseluruhan[];
   public double ttl;
   
   NilaiAlgoritma (int elemen){
       this.elemen = elemen;
       this.keseluruhan = new double[elemen];
       this.ttl = 0;
   }
   double TotalBF(double arr[]){
        for(int i = 0; i < elemen; i++ ){
          ttl = ttl + arr[i];
        }
        return ttl;
           }
   
   double hitungTotalNilai(){
       double total;
       double Tugas = nilaiTugas*0.30;
       double Kuis = nilaiKuis*0.20;
       double UTS = nilaiUTS*0.20;
       double UAS = nilaiUAS*0.30;
       return total = Tugas+Kuis+UTS+UAS ;
   }
   
   void Tampil(){
       System.out.println("Nama : "+namaMhs);
       System.out.println("Nilai tugas : "+nilaiTugas);
       System.out.println("Nilai kuis : "+nilaiKuis);
       System.out.println("Nilai UTS : "+nilaiUTS);
       System.out.println("Nilai UAS : "+nilaiUAS);
    
       }
}
   
   

