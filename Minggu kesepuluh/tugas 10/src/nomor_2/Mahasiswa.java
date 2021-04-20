
package nomor_2;

public class Mahasiswa {
    String nim, nama;
    int absen;
    double ipk;

    int max;
    int size;
    int front;
    int rear;
    Mahasiswa Q [];
    
    public Mahasiswa(int n){
        max = n;
        Create();
    }

    Mahasiswa(String nama, String nim, int abs, double ipk) {
       this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        absen = abs;
    }

    Mahasiswa(String nama, String nim, String absen, int ipk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Create(){
       Q = new Mahasiswa[max] ;
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
             System.out.println("Elemen terdepan : "+Q[front].nama +" "+ Q[front].nim +" "+ Q[front].absen +" "+ Q[front].ipk);
         } else {
             System.out.println("Queue masih kosong");
         }
     }
     
     public void peekrear(){
         if(!IsEmpty()){
             System.out.println("Elemen belakang : "+Q[rear].nama+" "+Q[rear].nim+" "+Q[rear].absen+" "+Q[rear].ipk);
         } else {
             System.out.println("Queue masih kosong");
         }
     }
     
     public void peekPosition(int x, int pos){
      if(pos!= -1){
          System.out.println("data : "+x+" ditemukan pada indeks "+pos);
      } else{
          System.out.println("data :"+x+" Tidak ditemukan");
      }
  }
     
public void peekAt(int x, int pos){
      if (pos!= -1){
          System.out.println("Nilai : "+x);
      } else {
          System.out.println("data :"+x+" Tidak ditemukan");
      }
}
      public int FindBinarySearch(int cari, int left, int right){
      int mid; 
      if (right >= left){
          mid = (left + right)/2;
          if (Q[mid].absen == cari){
              return (mid);
          } else if ( Q[mid].absen > cari){
              return FindBinarySearch(cari, left, mid - 1);
          } else {
              return FindBinarySearch( cari, mid + 1, right);
          }
      } else {
      }
      return -1;
  }
  
     public void PrintMahasiswa(){
         if(IsEmpty()){
             System.out.println("Queue masih kosong");
         } else {
             int i = front;
             while (i != rear){
                 System.out.print(Q[i]+ " ");
                 i = (i + 1)% max;
             }
             System.out.println(Q[i].nama+ " " +Q[i].nim+ " " +Q[i].absen+ " " +Q[i].ipk);
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
     
     public void Enqueue(Mahasiswa data){
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
     
     public Mahasiswa Dequeue(){
         Mahasiswa data = new Mahasiswa("", "", 0, 0);
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
