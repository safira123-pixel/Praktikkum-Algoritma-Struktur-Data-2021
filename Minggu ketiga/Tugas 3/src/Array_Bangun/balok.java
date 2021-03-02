package Array_Bangun;


public class balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    

    public balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolumeBalok (){
        return panjang*lebar*tinggi;
    }
    public int hitungLuasPermukaanBalok (){
        return (panjang*lebar + panjang*tinggi + lebar*tinggi)*2;
    }
}
