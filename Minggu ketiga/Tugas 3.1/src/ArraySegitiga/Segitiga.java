
package ArraySegitiga;
public class Segitiga {
   public int alas;
   public int tinggi;
   
   public Segitiga(){
       
   }
   
   public Segitiga(int a, int t) {
    alas = a;
    tinggi = t;
}
   public double hitungLuas(){
       return alas*tinggi*1.2;
   }
   public double hitungKeliling(){
        double miring = Math.sqrt((alas*alas)+(tinggi*tinggi));
        return miring+alas+tinggi;
   }
}
