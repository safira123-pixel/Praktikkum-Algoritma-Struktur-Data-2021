package Array_Bangun;


public class tabung {
    public int jari_jari;
    public int tinggi;
    
    public tabung (int j, int tt){
        jari_jari = j;
        tinggi = tt;
    }
    
    public double volumeTabung (){
        return 3.14 * jari_jari* jari_jari* tinggi;
    }
    
    public double luasPermukaanTabung (){
        return 2*3.14*jari_jari*(jari_jari+tinggi);
    }
}
