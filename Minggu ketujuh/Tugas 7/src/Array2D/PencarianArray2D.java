
package Array2D;

public class PencarianArray2D {
    Array2D[][] array = new Array2D[4][2];
    
    int idx;
    
    void Tambah(Array2D A){
      if(idx < array.length){
          array[idx][idx] = A;
          idx++;
      } else {
          System.out.println("Data sudah penuh !!");
      }
  }
    
  
  public int FindSeqSearch (int cari){
      int posisi = -1;
      for (int k =0; k < array.length; k++){
      for(int j = 0; j < array[0].length; j++){
          if(array[k][j].nilai == cari){
              posisi  = j;
              break;
          }
      }
      
  }return posisi;
}
}
