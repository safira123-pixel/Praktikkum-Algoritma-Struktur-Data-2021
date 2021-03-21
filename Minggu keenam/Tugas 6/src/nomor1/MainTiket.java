
package nomor1;

public class MainTiket {
    public static void main(String[] args) {
        TiketService ts = new TiketService();
        Tiket t1 = new Tiket("Garuda","Surabaya", "Jakarta", 19000000);
        Tiket t2 = new Tiket("Lion air", "Surabaya", "Jakarta", 10000000);
        Tiket t3 = new Tiket("Citilink","Surabaya", "Jakarta", 12000000);
        Tiket t4 = new Tiket("Adam air","Surabaya", "Jakarta", 15000000);
        Tiket t5 = new Tiket("Air Asia","Surabaya", "Jakarta", 14000000);
        
        ts.tambah(t1);
        ts.tambah(t2);
        ts.tambah(t3);
        ts.tambah(t4);
        ts.tambah(t5);
        
        System.out.println("Data Maskapai sebelum disorting: ");
        ts.tampilAll();
        
        System.out.println("Data Maskapai setelah disorting asc berdasarkan harga: ");
        ts.Bubbleshort();
        ts.tampilAll();
        
        System.out.println("Data Maskapai setelah disorting asc berdasarkan harga: ");
        ts.Selectionshort();
        ts.tampilAll();
    }   
}
