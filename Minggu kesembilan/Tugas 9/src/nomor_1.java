
import java.util.Scanner;
import java.util.Stack;


public class nomor_1 {
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();
        Stack stk = new Stack();
        for (int i=0;i<kalimat.length();i++){
            stk.push(kalimat.substring(i,i+1));
        }      
        String kalimatrev = "";
        while(!stk.isEmpty()){
            kalimatrev += stk.pop();
        } 
        System.out.println("Hasil : "+kalimatrev);
    }
}  

