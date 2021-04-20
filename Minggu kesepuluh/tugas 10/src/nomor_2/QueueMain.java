
package nomor_2;

import java.util.Scanner;

public class QueueMain {
     public static void menu(){
        System.out.println("pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. cek antrian paling belakang");
         System.out.println("6. peek position");
        System.out.println("7. peek at");
        System.out.println("--------------------------------------");
        
        
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();
        Mahasiswa mhs = new Mahasiswa(jumlah);
            int pilih;
            int jum = 0;
            int posisi;   

        do{
            menu();
            pilih = sc.nextInt();
          switch(pilih)  {
              case 1 : 
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Nim: ");
        String nim = sc.nextLine();
        System.out.print("Absen : ");
        String absen = sc.nextLine();
        System.out.print("Ipk : ");
        int ipk = sc.nextInt();
     
        Mahasiswa m;
            m = new Mahasiswa(nama, nim, absen, ipk);
                  sc.nextLine();
                  mhs.Enqueue(m);
                  break;
              case 2 :
                  Mahasiswa data = mhs.Dequeue();
                  if(!"".equals(data.nama) && !"".equals(data.nim) && data.absen !=0 && data.ipk != 0){
                      System.out.println("Antrian yang keluar : "+ data.nama +" "+ data.nim +" "+ data.absen +" "+ data.ipk);
                      break;
                  }
              case 3 :
                  mhs.Peek();
                  break;
              case 4 :
                  mhs.PrintMahasiswa();
                  break;
              case 5 :
                  mhs.peekrear();
                  break;
              case 6 :
                  System.out.println("Masukkan Nilai yang dicari : ");
                  System.out.println("Nilai : ");
                  int cari = sc.nextInt();
                  posisi = mhs.FindBinarySearch(cari, 0, jum -1);
                  mhs.peekPosition(cari, posisi);
              case 7 :
                  System.out.println("Masukkan Nilai yang dicari : ");
                  System.out.println("Nilai : ");
                  cari = sc.nextInt();
                  posisi = mhs.FindBinarySearch(cari, 0, jum - 1);
                  mhs.peekAt(cari, posisi);
          }
          
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
  
}
