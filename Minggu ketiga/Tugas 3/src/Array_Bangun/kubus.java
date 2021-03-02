package Array_Bangun;


public class kubus {
    public int sisi;
    
    public kubus (int s){
        sisi = s;
    }
   public int hitungVolumeKubus (){
       return sisi*sisi*sisi;
   }
   public int hitungLuasPermukaanKubus () {
       return 6*sisi^2;
   }
}
