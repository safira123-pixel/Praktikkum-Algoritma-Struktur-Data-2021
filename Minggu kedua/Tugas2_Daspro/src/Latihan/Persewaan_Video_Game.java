
package Latihan;

public class Persewaan_Video_Game {
    String id;
    String namaMember;
    String namaGame;
    int lamaPinjam;
    int hargaSewa;
    
    void peminjaman (){
        System.out.println(" id : "+id);
    System.out.println(" Nama member : "+namaMember);
    System.out.println(" Nama game : "+namaGame);
    System.out.println(" lama pinjam : "+lamaPinjam);
    System.out.println(" harga sewa : "+hargaSewa);
    }
    int uangSewa () {
        if (lamaPinjam < 10){
            hargaSewa = 10000;
        } else{
            hargaSewa = 20000;
        }
        return hargaSewa;
    }
    
    public static void main(String[] args) {
        Persewaan_Video_Game pvg = new Persewaan_Video_Game();
        pvg.id = "23451";
        pvg.namaMember = "Mujaidi";
        pvg.namaGame = "GTA 5";
        pvg.lamaPinjam = 13;
        pvg.uangSewa();
        pvg.peminjaman();
    }
}
