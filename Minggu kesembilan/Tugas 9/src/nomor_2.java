
public class nomor_2 {
  String no_transaksi ;
  String tgl_pembelian;
  int jml_barang;
  int total_harga;
  int size;
   int top;
   nomor_2 data[];
  
  
  public nomor_2(int size){
       this.size = size;
       data = new nomor_2[size];
       top = - 1;
   }

    nomor_2(String nt, String tgl, int jml, int ttl) {
        no_transaksi = nt;
      tgl_pembelian = tgl;
      jml_barang = jml;
      total_harga = ttl;
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
   
   public void push(nomor_2 struk){
       if(!IsFull()){
           top++;
           data[top] = struk;
       } else {
           System.out.println("isi stack penuh!");
       }
   }
   
   public void pop(){
       if(!IsEmpty()){
           nomor_2 x = data[top];
           top--;
           System.out.println("Data yang keluar: "+ x.no_transaksi + " " + x.tgl_pembelian + " " + x.jml_barang + " " + x.total_harga);
       } else {
           System.out.println("Stack masih kosong");
       }
   }
   
   public void peek(){
        System.out.println("Data yang keluar: "+ data[top].no_transaksi + " " + data[top].tgl_pembelian + " " + data[top].jml_barang + " " + data[top].total_harga);
   }
   
   public void print(){
       System.out.println("Isi stack : ");
       for(int i = top; i>= 0; i--){
         System.out.println("Data yang keluar: "+ data[i].no_transaksi + " " + data[i].tgl_pembelian + " " + data[i].jml_barang + " " + data[i].total_harga);   
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

