
package Praktikkum_1;

import java.util.Scanner;

public class QueueMain {
    public static void menu(){
        System.out.println("masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue : ");
        int n = sc.nextInt();
        
        Queue Q = new Queue(n);
        int pilih;
        
        do{
            menu();
            pilih = sc.nextInt();
          switch(pilih)  {
              case 1 : 
                  System.out.print("Masukkan data baru : ");
                  int DataMasuk = sc.nextInt();
                  Q.Enqueue(DataMasuk);
                  break;
              case 2 :
                  int DataKeluar = Q.Dequeue();
                  if(DataKeluar!= 0){
                      System.out.println("Data yang dikeluarkan : "+DataKeluar);
                      break;
                  }
              case 3 :
                  Q.Print();
                  break;
              case 4 :
                  Q.Peek();
                  break;
              case 5 :
                  Q.clear();
                  break;
          }
          
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
  
}
