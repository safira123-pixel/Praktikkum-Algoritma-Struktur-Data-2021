package nomor2;

public class PremierLeagueService {
    PremierLeague[] league = new PremierLeague[5];
            int idx;
       void tambah (PremierLeague t) {  
           if (idx < league.length){
               league[idx] = t;
               idx++;
               
           } else {
               System.out.println("maaf tidak tersedia!");
           }
       }
       
       void tampilAll(){
           for (PremierLeague t : league){
               t.tampil();
               System.out.println("----------------------------");
           }
       }
       
       void insertionSort(boolean asc){
           for (int i = 1; i < league.length; i++){
               PremierLeague temp = league[i];
               int j = i;
              while ((j < 0) && (league[ j - 1].points < temp.points)){
                  league[j] = league[j - 1];
                  j--;
              
           }
              league[j] = temp;      
           }
       }
}
