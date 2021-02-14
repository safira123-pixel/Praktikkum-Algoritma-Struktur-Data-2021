
import java.util.Scanner;


public class saldoNasabah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Saldo = 1000000; //Dalam satuan juta
        double bunga_bank = 0.02;
        System.out.println("Jumlah saldo awal: " +Saldo);
        System.out.print("Lamanya menabung: ");
        int bulan = input.nextInt();
        System.out.print("Jumlah saldo setelah " +bulan+ "bulan adalah: ");
        System.out.println(saldoNasabah1(Saldo, bulan));
    }
    
    static double saldoNasabah1(int saldo, int bulan ){
        if(bulan == 0){
            return (saldo);
        } else { 
            return (1.02 * saldoNasabah1(saldo, bulan - 1));
}
    }
}

