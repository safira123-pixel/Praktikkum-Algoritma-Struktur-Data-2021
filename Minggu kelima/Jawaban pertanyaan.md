## Jawaban 1
1. Pertama-tama dalah divide yaitu memisahkan elemen menjadi dua, lalu pada tahap conquer yaitu menentukan min dan max pada tiap bagian lalu pada tahap combine menggabungkan jawaban dari tahap divide dan conquer
2. tahapan divide and conquer :
 
 if(n==1){
 return 1;
 // ini adalah bagian dari divide and conquer//

 } else {
 int fakto = n*faktorialDC(n-1);
 return fakto;
// ini adalah bagian dari combine//
        } 

3. Bisa
<img src ="1.png">

4. gambar program
<img src ="2.png">

5. ada
<img src ="3.png">

## Jawaban 2
1. method pada BF adalah pencocokan pattern dari elemen awal sampai elemen akhir sehingga didapatkan hasil yang benar. Sedangkan method pada dc adalah membagi permasalahan yang cukup besar menjadi 2 bagian lalu memecahkan tiap - tiap permasalahan selanjutnya menggabungkan tiap penyelesaian untuk mencari solusi utama
2. Merupakan tahap penyelesaian dan combine, jika masalah yang berukuran n dibagi 2 menghasilkan 1 maka hasilnya adalah pangkat DC dikali pangkat DC kali a, jika tidak maka hasilnya adalah pangkat DC dikali pangkat DC
3.  Ada
<img src ="4.png">

4. 
<img src ="5.png">

5. 
<img src ="6.png">

## Jawaban 3
1. perbedaan perhitungan pada BF dan DC :

perhitungan pada BF yaitu mencari total keuntungan di perusahaan dengan menjumlahkan total awal dengan arr yang diimputkan jumlahnya sesuai dengan elemen

Perhitungan pada DC yaitu membagi elemen yang dimasukkan menjadi 2 bagian lalu melakukan penjumlahan di masing - masing elemen dengan variable mid lalu menggabungkan elemen - elemen tadi untuk memperoleh total keuntungan

2. dengan mengubah keseluruhan variable DC dengan tipe data float
3. untuk me return tahap kombinasi dari perhitungan yang dilakukan terhadap elemen- elemen tersebut
4. untuk membagi elemen - elemen menjadi dua dan dihitung di divide and conquer
5. 
<img src = "7.png">
