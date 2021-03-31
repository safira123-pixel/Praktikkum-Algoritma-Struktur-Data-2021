
package Array1D;

public class PencarianArray1D {
    Array1D[] array = new Array1D[10];

  int idx;

  void Tambah(Array1D a){
      if(idx < array.length){
          array[idx] = a;
          idx++;
      } else {
          System.out.println("Data sudah penuh !!");
      }
  }
  
  void Tampil(){
      for(Array1D a : array){
          a.tampil();
          System.out.println("-------------------------------------");
      }
  }
  
   public void tampilPosisi(int x, int pos){
      if(pos!= -1){
          System.out.println("data : "+x+" ditemukan pada indeks "+pos);
      } else{
          System.out.println("data :"+x+" Tidak ditemukan");
      }
  }
   
   public void tampilData(int x, int pos){
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
          if (cari == array[mid].nilai){
              return (mid);
          } else if ( array[mid].nilai > cari){
              return FindBinarySearch(cari, left, mid - 1);
          } else {
              return FindBinarySearch( cari, mid + 1, right);
          }
      } else {
      }
      return -1;
  }
}
