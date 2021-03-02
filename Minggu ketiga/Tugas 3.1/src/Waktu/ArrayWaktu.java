
package Waktu;

public class ArrayWaktu {
    public static void main(String[] args) {
    Waktu[][] wkArray = new Waktu[2][2];
    
   wkArray[0][0] = new Waktu(5, 45);
   wkArray[0][1] = new Waktu(6, 20);
   wkArray[1][0] = new Waktu(10, 15);
   wkArray[1][1] = new Waktu(3, 25);
   
    for(int i = 0; i < 2; i++){
       for(int j = 0; j < 2; j++) {
          System.out.println("jam : menit = "+wkArray[i][j].Waktu1());
       }
    }
    
}
}
