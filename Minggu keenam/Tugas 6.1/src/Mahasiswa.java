
public class Mahasiswa {
    String Nama;
    int Thnmasuk, Umur;
    double Ipk;
    
    Mahasiswa(String n, int t, int u, double i){
        Nama = n;
        Thnmasuk = t;
        Umur = u;
        Ipk = i;
    }
    
    void tampil(){
        System.out.println("Nama: "+Nama);
        System.out.println("Tahun masuk: "+Thnmasuk); 
        System.out.println("umur: "+Umur);
        System.out.println("Ipk: "+Ipk);
    }
}
