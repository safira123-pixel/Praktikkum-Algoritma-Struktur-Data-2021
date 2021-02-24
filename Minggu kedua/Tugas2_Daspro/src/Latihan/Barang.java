 
package Latihan;

public class Barang {
    String nama;
    int hargaSatuan;
    int jumlah;
    
    int hitungHargaTotal(){
        int hargaTotal = hargaSatuan*jumlah;
       return hargaTotal; 
    }
    int hitungDiskon(){
        double diskon = 0;
        int hargaTotal = 0;
        if (hargaTotal > 100000){
            diskon = hargaTotal*1.0;
        } else if ((hargaTotal >= 50000) && (hargaTotal == 100000)) {
            diskon = hargaTotal*0.05;    }              
        else {  
                }
        return (int) diskon;
    }
    int hitungHargaBarang (){
       int hargaTotal = 0;
        int hargaTotalBarang = 0;
        int hargaDiskon = 0;
        return hargaTotalBarang = hargaTotal - hargaDiskon;
    }
    public static void main(String[] args) {
        Barang br = new Barang();
        br.nama = "Buku Gambar";
        br.jumlah = 13;
        br.hargaSatuan = 3000;
        br.hitungHargaTotal();
        br.hitungDiskon();
        br.hitungHargaBarang();
       
        System.out.println("Nama barang: " +br.nama);
        System.out.println("jumlah barang: "+br.jumlah);
        System.out.println("Harga satuan: "+br.hargaSatuan);
        System.out.println("Harga total pembayaran: "+br.hitungHargaTotal());
    }
}
