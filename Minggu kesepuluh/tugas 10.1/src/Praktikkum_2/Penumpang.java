
package Praktikkum_2;

public class Penumpang {
    String nama, kotaAsal, kotaTujuan;
    int jmlTiket, harga;
    
    Penumpang (String nama, String kotaAsal, String kotaTujuan, int jml, int harga){
        this.nama = nama;
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
        this.harga = harga;
        jmlTiket = jml;
    }
    
    int max;
    int size;
    int front;
    int rear;
    Penumpang[] Q;
    
public Penumpang(int n){
max = n;
Create();}
    
    public void Create(){
       Q = new Penumpang[max] ;
       size = 0;
       front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if(size == 0){
            return true;
        } else {
            return false;
        } 
    }
    
     public boolean IsFull(){
         if(size == max){
             return true;
         } else {
             return false;
         }
     }
     
     public void Peek(){
         if(!IsEmpty()){
             System.out.println("Elemen terdepan : "+Q[front].nama+" "+Q[front].kotaAsal+" "+Q[front].kotaTujuan+" "+Q[front].jmlTiket+" "+Q[front].harga);
         } else {
             System.out.println("Queue masih kosong");
         }
     }
     public void peekrear(){
         if(!IsEmpty()){
             System.out.println("Elemen belakang : "+Q[rear].nama+" "+Q[rear].kotaAsal+" "+Q[rear].kotaTujuan+" "+Q[rear].jmlTiket+" "+Q[rear].harga);
         } else {
             System.out.println("Queue masih kosong");
         }
     }
     
     public void Print(){
         if(IsEmpty()){
             System.out.println("Queue masih kosong");
         } else {
             int i = front;
             while (i != rear){
                 System.out.println(Q[i].nama+" "+Q[i].kotaAsal+" "+Q[i].kotaTujuan+" "+Q[i].jmlTiket+" "+Q[i].harga);
                 i = (i + 1)% max;
             }
             System.out.println(Q[i]+ " ");
             System.out.println("jumlah elemen : "+size);
         }
     }
     
     public void clear(){
       if(IsEmpty()){
             front = rear = -1;
             size = 0;
             System.out.println("Queue berhasil dikosongkan");
         } else { 
           System.out.println("Queue masih kosong");
       } 
     }
     
     public void Enqueue(Penumpang data){
         if(IsFull()){
             System.out.println("Queque sudah penuh");
         } else {
             if(IsEmpty()){
                 front = rear = 0;
             } else {
                 if(rear == max - 1){
                     rear = 0;
                 } else {
                     rear++;
                 }
             } Q[rear] = data;
             size++;
         }
     }
     
     public Penumpang Dequeue(){
         Penumpang data = new Penumpang("", "", "", 0, 0);
         if(IsEmpty()){
             System.out.println("Queque masih kosong");
         } else {
             data = Q[front];
             size--;
             if(IsEmpty()){
                 front = rear = -1;
             } else {
                 if(front == max - 1){
                     front = 0;
                 } else {
                     front++;
                 } 
     }
         }return data;
     }
     
     
}


