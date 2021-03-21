package nomor2;


public class PremierLeague {
   String team;
   int play;
   int goal;
   int points;
   
   public PremierLeague (String t, int p, int g, int pt){
       team = t;
       play = p;
       goal = g;
       points = pt;
   }
   
   void tampil(){
       System.out.println("team : "+team);
       System.out.println("play : "+play);
       System.out.println("goal : "+goal);
       System.out.println("points : "+points);
   }
   
   
}
