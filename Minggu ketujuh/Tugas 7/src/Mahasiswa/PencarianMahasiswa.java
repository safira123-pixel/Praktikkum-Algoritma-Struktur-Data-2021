
package Mahasiswa;


public class PencarianMahasiswa {      

  Mahasiswa[] listMhs = new Mahasiswa[2];

  int idx;

  void Tambah(Mahasiswa m){
      if(idx < listMhs.length){
          listMhs[idx] = m;
          idx++;
      } else {
          System.out.println("Data sudah penuh !!");
      }
  }
  
  void Tampil(){
      for(Mahasiswa m : listMhs){
          m.tampil();
          System.out.println("-------------------------------------");
      }
  }
  
  public int FindSeqSearch (int cari){
      int posisi = -1;
      for(int j = 0; j < listMhs.length; j++){
          if(listMhs[j].nim == cari){
              posisi  = j;
              break;
          }
      }
      return posisi;
  }
  
   public int FindSeqNameSearch (String Cari){
      int posisi = -1;
      for(int k = 0; k < listMhs.length; k++){
          if(listMhs[k].nama == Cari){
              posisi  = k;
              break;
          }
      }
      return posisi;
  }
  
  public void tampilPosisi(int x, int pos){
      if(pos!= -1){
          System.out.println("data : "+x+" ditemukan pada indeks "+pos);
      } else{
          System.out.println("data :"+x+" Tidak ditemukan");
      }
  }
  
  void bubleShort(){
       for(int i = 0; i < listMhs.length - 1; i++){
           for( int j = 1; j < listMhs.length - i; j++){
               if( listMhs[j].ipk > listMhs[j - 1].ipk){
                   Mahasiswa tmp = listMhs[j];
                   listMhs[j] = listMhs[j - 1];
                   listMhs[j - 1] = tmp;
               } else {
               }
           }
       }
   }
  
  public void tampilData(int x, int pos){
      if (pos!= -1){
          System.out.println("Nim/t : "+x);
        System.out.println("Nama/t : "+listMhs[pos].nama);
        System.out.println("Umur/t : "+listMhs[pos].umur);
        System.out.println("Ipk/t : "+listMhs[pos].ipk);
      } else {
          System.out.println("data :"+x+" Tidak ditemukan");
      }
  }
  
  public int FindBinarySearch(int cari, int left, int right){
      int mid;
      if (right >= left){
          mid = (left + right)/2;
          if (cari == listMhs[mid].nim){
              return (mid);
          } else if ( listMhs[mid].nim > cari){
              return FindBinarySearch(cari, left, mid - 1);
          } else {
              return FindBinarySearch( cari, mid + 1, right);
          }
      } else {
      }
      return -1;
  }
          
}
