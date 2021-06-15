
package Tugas_2;

import java.util.Comparator;

public class Nilai {
    Mahasiswa mahasiswa;
MataKuliah mk;
float nilai;
Nilai(Mahasiswa mahasiswa, MataKuliah mk, float nilai){
this.mahasiswa = mahasiswa;
this.mk = mk;
this.nilai = nilai;
}
static Comparator<Nilai>ComNilai = (n1, n2) ->{
if(n1.nilai > n2.nilai){
return -1;
} else if (n1.nilai < n2.nilai){
return 1;
} else {
return 0;
}
};
}
