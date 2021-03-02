
package Array_Tanah;
import java.util.Scanner;
public class TanahArray {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  Tanah[] tnArray = new Tanah[3];
 
    tnArray[0] = new Tanah();
    System.out.println("Tanah ke- 1");
        System.out.println("Lebar: ");
    tnArray[0].lebar1 = sc.nextInt();
        System.out.println("panjang: ");
    tnArray[0].panjang1 = sc.nextInt();
    
    tnArray[1] = new Tanah();
    System.out.println("Tanah ke- 2");
        System.out.println("Lebar: ");
    tnArray[1].lebar2 = sc.nextInt();
        System.out.println("panjang: ");
    tnArray[1].panjang2 = sc.nextInt();
    
    tnArray[2] = new Tanah();
    System.out.println("Tanah ke- 3");
        System.out.println("Lebar: ");
    tnArray[2].lebar3 = sc.nextInt();
        System.out.println("panjang: ");
    tnArray[2].panjang3 = sc.nextInt();
    
      System.out.println("Luas tanah -1 : "+tnArray[0].luasTanah1());
      System.out.println("Luas tanah -2 : "+tnArray[1].luasTanah2());
      System.out.println("Luas tanah -3 : "+tnArray[2].luasTanah3());
      
      tnArray[0].pencarianLuas();


  }
}

