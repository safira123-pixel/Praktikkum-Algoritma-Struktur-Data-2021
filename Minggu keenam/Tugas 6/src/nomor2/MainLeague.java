package nomor2;


public class MainLeague {
    public static void main(String[] args) {
        PremierLeagueService pls = new PremierLeagueService();
        PremierLeague t1 = new PremierLeague("Liverpool          ", 29, 45, 82);
        PremierLeague t2 = new PremierLeague("Manchester city    ", 27, 39, 57);
        PremierLeague t3 = new PremierLeague("Leicester          ", 28, 26, 50);
        PremierLeague t4 = new PremierLeague("Chelsea            ", 29, 9, 48);
        PremierLeague t5 = new PremierLeague("Arsenal            ", 28, 4, 40);
        
        pls.tambah(t1);
        pls.tambah(t2);
        pls.tambah(t3);
        pls.tambah(t4);
        pls.tambah(t5);
        
        System.out.println("Kalsemen sebelum sorting: ");
        pls.tampilAll();
        
        System.out.println("Klasemen setelah sorting asc berdasarkan points: ");
        pls.insertionSort(true);
        pls.tampilAll();
    }
}
