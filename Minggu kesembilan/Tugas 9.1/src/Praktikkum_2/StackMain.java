
package Praktikkum_2;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Buku st = new Buku(8);
        
        for (int i = 1; i >= 1 ; i++) {        
        System.out.println("Menu Stack");
        System.out.println("1. push");
        System.out.println(" 2. Pop");
        System.out.println(" 3. Print");
        System.out.println(" 4. peek");
        System.out.print("Pilih Menu : ");
        int menu = sc.nextInt();
         if (menu == 1) {
            System.out.println("push :");
            char pilih;
        do{ 
            System.out.print("Judul : ");
            String judul = sc.nextLine();
            System.out.print("Nama Pengarang : ");
            String namaPengarang = sc.nextLine();
            System.out.print("Tahun terbit : ");
            int tahunTerbit = sc.nextInt();
            System.out.print("Jumlah halaman : ");
            int jmlHalaman = sc.nextInt();
            System.out.print("Harga : ");
            int harga = sc.nextInt();
            
            Buku bk = new Buku(judul, namaPengarang, tahunTerbit, jmlHalaman, harga);
            System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);
            
        } while (pilih == 'y');
        
        } else if (menu == 2){
          st.pop();
        } else if (menu == 3){
          st.print();
        } else if (menu == 4 ){
            st.peek();
        } else 
        break; 
            } 
    }
  
}
