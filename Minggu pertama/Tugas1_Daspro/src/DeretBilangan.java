import java.util.Scanner;
public class DeretBilangan {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai batas awal: ");
    int Deret = input.nextInt();
    for(int x = 2; x <= Deret; x+= 2){
        if(x%4 == 0)
            continue;
        System.out.print(x+" ");
    }
}
}
