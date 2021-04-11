
package Praktikkum_2;

public class Buku {
    String judul, namaPengarang;
    int tahunTerbit, jmlHalaman, harga;   
   int size;
   int top;
   Buku data[];
    
    Buku(String jd, String nm, int thn, int hal, int hg){
        judul = jd;
        namaPengarang = nm;
        tahunTerbit = thn;
        jmlHalaman = hal;
        harga = hg;
    }
    
   public Buku(int size){
       this.size = size;
       data = new Buku[size];
       top = - 1;
   }
   
   public boolean IsEmpty(){
       if(top == -1){
           return true;
       } else {
           return false;
       }
   }
   
   public boolean IsFull(){
       if(top == size - 1){
           return true;
       } else {
           return false;
       }
   }
   
   public void push(Buku bk){
       if(!IsFull()){
           top++;
           data[top] = bk;
       } else {
           System.out.println("isi stack penuh!");
       }
   }
   
   public void pop(){
       if(!IsEmpty()){
           Buku x = data[top];
           top--;
           System.out.println("Data yang keluar: "+ x.judul + " " + x.namaPengarang + " " + x.tahunTerbit + " " + x.jmlHalaman + " " + x.harga);
       } else {
           System.out.println("Stack masih kosong");
       }
   }
   
   public void peek(){
        System.out.println("Data yang keluar: "+ data[top].judul + " " + data[top].namaPengarang + " " + data[top].tahunTerbit + " " + data[top].jmlHalaman + " " + data[top].harga);
   }
   
   public void print(){
       System.out.println("Isi stack : ");
       for(int i = top; i>= 0; i--){
         System.out.println("Data yang keluar: "+ data[i].judul + " " + data[i].namaPengarang + " " + data[i].tahunTerbit + " " + data[i].jmlHalaman + " " + data[i].harga);   
       } System.out.println(" ");
   }
   
   public void clear(){
       if(!IsEmpty()){
           for(int i = top; i >= 0; i--){
               top--;
           } System.out.println("Stack sudah dikosongkan");
       } else {
           System.out.println("Gagal! stack masih kosong");
       }
   }
}

