
package Praktikkum_2;

import java.util.Scanner;

public class QueueMain {
        public static void menu(){
        System.out.println("pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. cek antrian paling belakang");
        System.out.println("--------------------------------------");
        
        
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();
        Penumpang antri = new Penumpang(jumlah);
            int pilih;

        do{
            menu();
            pilih = sc.nextInt();
          switch(pilih)  {
              case 1 : 
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kota asal: ");
        String asal = sc.nextLine();
        System.out.print("Kota tujuan: ");
        String tujuan = sc.nextLine();
        System.out.print("Jumlah tiket: ");
        int jml = sc.nextInt();
        System.out.print("Harga: ");
        int hrg = sc.nextInt();
        Penumpang p = new Penumpang(nama, asal, tujuan, jml, hrg);
                  sc.nextLine();
                  antri.Enqueue(p);
                  break;
              case 2 :
                  Penumpang data = antri.Dequeue();
                  if(!"".equals(data.nama) && !"".equals(data.kotaAsal) && !"".equals(data.kotaTujuan) && data.jmlTiket !=0 && data.harga != 0){
                      System.out.println("Antrian yang keluar : "+ data.nama +" "+ data.kotaAsal +" "+ data.kotaTujuan +" "+ data.jmlTiket +" "+ data.harga);
                      break;
                  }
              case 3 :
                  antri.Peek();
                  break;
              case 4 :
                  antri.Print();
                  break;
              case 5 :
                  antri.peekrear();
                  break;
          }
          
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
  
}

