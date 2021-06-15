
package Tugas_1;

import java.util.Scanner;
import java.util.Stack;

public class MainBuku {
    static void menu(){
System.out.println("======================");
System.out.println("DATA BUKU PERPUSTAKAAN");
System.out.println("======================");
System.out.println("1. ENTRY JUDUL BUKU");
System.out.println("2. AMBIL JUDUL BUKU TERATAS");
System.out.println("3. CEK JUDUL BUKU TERATAS RAK");
System.out.println("4. INFO SEMUA JUDUL BUKU");
System.out.println("5. KELUAR");
System.out.println("***********************");
System.out.println();
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Scanner scs = new Scanner(System.in);
int pilihan;
Stack<Buku> stack = new Stack<Buku>();
String isbn;
String judul;
int terbit;
String penerbit;
Buku b1 = new Buku("001", "3D Computer Vision", 2010, "Magna PC");
Buku b2 = new Buku("002", "Understanding Software", 2011, "Est Foundtion");
Buku b3 = new Buku("003", "Algoritma Notes For Professional", 2012, "Turpis Nec LLC");
Buku b4 = new Buku("004", "Getting Started with C++ Audio Programming for game Developer", 2013, "Est Foundaation");
Buku b5 = new Buku("005", "Practical digital Forencis", 2014,"Eu LLC");
stack.push(b1);
stack.push(b2);
stack.push(b3);
stack.push(b4);
stack.push(b5);
do{
menu();
System.out.print("Masukkan Pilihan Anda : ");
pilihan = sc.nextInt();
System.out.println("");
switch (pilihan){
case 1:
System.out.print("ISBN : ");
isbn = scs.nextLine();
System.out.print("JUDUL : ");
sc.nextLine();
judul = sc.nextLine();
System.out.print("TAHUN TERBIT : ");
terbit = sc.nextInt();
System.out.print("PENERBIT : ");
sc.nextLine();
penerbit = sc.nextLine();
Buku bNew = new Buku(isbn, judul, terbit, penerbit);
stack.push(bNew);
break;
case 2 :
Buku bukuPop = stack.pop();
System.out.println("Buku {isbn = " + bukuPop.isbn + ", judul = " + bukuPop.judul + ", terbit = " +bukuPop.terbit + ", penerbit = " + bukuPop.penerbit + "}");
break;
case 3 :
Buku bukuPeek = stack.peek();
System.out.println("Buku{isbn = " +bukuPeek.isbn + ", judul = " + bukuPeek.penerbit + "}");
break;
case 4 :
for (Buku buku : stack){
System.out.println("Buku{isbn = " +buku.isbn + ", judul = " +buku.judul + ", terbit = " + buku.terbit + ", penerbit = " + buku.penerbit + "}");
}
break;
default :
break;
}
}
while (pilihan != 5);
}
}
