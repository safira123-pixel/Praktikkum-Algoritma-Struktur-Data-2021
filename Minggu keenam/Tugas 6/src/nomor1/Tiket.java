
package nomor1;
 class Tiket {
    String maskapai, asal, tujuan;
    int harga;
    
    Tiket(String m, String a, String t, int h){
        maskapai = m;
        asal = a;
        tujuan = t;
        harga = h;
    }
    void tampil(){
       System.out.println(" maskapai : "+maskapai);
       System.out.println("Asal : "+asal);
       System.out.println("Tujuan : "+tujuan);
       System.out.println("Harga : "+harga);
   }
}
