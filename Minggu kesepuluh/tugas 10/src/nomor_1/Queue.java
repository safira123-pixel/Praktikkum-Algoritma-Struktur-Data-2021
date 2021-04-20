
package nomor_1;

public class Queue {
    int max;
    int size;
    int front;
    int rear;
    int Q [];
    
    public Queue(int n){
        max = n;
        Create();
    }
    
    public void Create(){
       Q = new int[max] ;
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
             System.out.println("Elemen terdepan : "+Q[front]);
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
          if (Q[mid] == cari){
              return (mid);
          } else if ( Q[mid] > cari){
              return FindBinarySearch(cari, left, mid - 1);
          } else {
              return FindBinarySearch( cari, mid + 1, right);
          }
      } else {
      }
      return -1;
  }
  
     public void Print(){
         if(IsEmpty()){
             System.out.println("Queue masih kosong");
         } else {
             int i = front;
             while (i != rear){
                 System.out.print(Q[i]+ " ");
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
     
     public void Enqueue(int data){
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
     
     public int Dequeue(){
         int data = 0;
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
