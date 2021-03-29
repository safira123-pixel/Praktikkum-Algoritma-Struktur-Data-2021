
package PerhitunganNilai;

public class MainNilai {
    public static void main(String[] args) {
        int elm = 3;
        NilaiAlgoritma na = new NilaiAlgoritma(elm);
        na.namaMhs = "Amanda";
        na.nilaiKuis = 70;
        na.nilaiTugas = 80;
        na.nilaiUAS = 98;
        na.nilaiUTS = 85;
        double nilaiTotal = na.hitungTotalNilai();
        na.Tampil();
        System.out.println("Nilai total : "+nilaiTotal);
        
        System.out.println();
        na.namaMhs = "Bagas";
        na.nilaiKuis = 85;
        na.nilaiTugas = 78;
        na.nilaiUAS = 94;
        na.nilaiUTS = 95;
        nilaiTotal = na.hitungTotalNilai();
        na.Tampil();
        System.out.println("Nilai total : "+nilaiTotal);
        
        System.out.println();
        na.namaMhs = "Agus";
        na.nilaiKuis = 90;
        na.nilaiTugas = 89;
        na.nilaiUAS = 75;
        na.nilaiUTS = 81;
        nilaiTotal = na.hitungTotalNilai();
        na.Tampil();
        System.out.println("Nilai total : "+nilaiTotal);
        
        System.out.println();
        System.out.println("Rerata "+na.elemen+" : "+na.TotalBF(na.keseluruhan));
    }
}
