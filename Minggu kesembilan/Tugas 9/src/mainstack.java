
import java.util.Scanner;

public class mainstack {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nomor_2 nm = new nomor_2(8);
            char pilih;
        do{ 
            System.out.print("nomor transaksi : ");
            String no_transaksi = sc.nextLine();
            System.out.print("Tanggal pembelian : ");
            String tgl_pembelian = sc.nextLine();
            System.out.print("jumlah barang : ");
            int jml_barang = sc.nextInt();
            System.out.print("total harga : ");
            int total_harga = sc.nextInt();
            
            nomor_2 bk = new nomor_2(no_transaksi, tgl_pembelian, jml_barang, total_harga);
            System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            nm.push(bk);
            
        } while (pilih == 'y');

          nm.pop();
          nm.print();
          nm.peek();

}
}
