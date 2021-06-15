

package Tugas_2;

import java.util.Comparator;

public class MataKuliah {
    String kode;
String matkul;
String sks;
public MataKuliah(){
}
public MataKuliah(String kode, String matkul, String sks){
this.kode = kode;
this.matkul = matkul;
this.sks = sks;
}
static Comparator<MataKuliah> ComMkKode = new Comparator<MataKuliah>(){
public int compare (MataKuliah mk1, MataKuliah mk2){
return mk1.kode.compareTo(mk2.kode);
}
};
}
