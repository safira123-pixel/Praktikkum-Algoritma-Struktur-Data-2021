
package Array_Tanah;

public class Tanah {
   public int panjang1;
   public int lebar1;
   public int panjang2;
   public int lebar2;
   public int panjang3;
   public int lebar3;
   public int luas1;
   public int luas2;
   public int luas3;

   public int luasTanah1(){
       return luas1 = panjang1*lebar1;
   }
   public int luasTanah2(){
        return luas2 = panjang2*lebar2;

   }
    public int luasTanah3(){
        return luas3 = panjang3*lebar3;
}
    public void pencarianLuas(){
        if ((luas1 > luas2)&&(luas1 > luas3)){
            System.out.println("Luas terbesar adalah: tanah ke- 1");
    } else {
        if (luas2 > luas3){
            System.out.println("Luas terbesar adalah: tanah ke- 2");
        } else {               
            System.out.println("Luas terbesar adalah: tanah ke- 3");
        }

        }
    }
}
