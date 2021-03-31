# Jawaban Pertanyaan
## Pertanyaan 1
1. perbedaannya adalah pada method tampil posisi output yang dikeluarkan berupa posisi data yang dicari misalnya data mahasiswa 1 berada pada indeks ke 1, dst. Sedangkan tampil data output yang dikeluarkan adalah tampilan isi dari data yang dicari, misal nama, umur, dst.
2. fungsi break untuk menghentikan posisi pencarian jika posisi data sudah ditemukan
3. Ya, program masih dapat berjalan. Hasil yang dikeluarkan benar. Dikarenakan pada sequential search tidak memerlukan data yang urut (dari kecil ke besar atau sebaliknya )karena pecarian data dilakukan sesuai data urutan pertama sampai data urutan terakhir
## Pertanyaan 2
1. divide

if (right >= left){
          mid = (left + right)/2;
          
          } else {
              return FindBinarySearch( cari, mid + 1, right);
            }
            }
2. conquer

if (cari == listMhs[mid].nim){
              return (mid);
          } else if ( listMhs[mid].nim > cari){
              return FindBinarySearch(cari, left, mid - 1);

3. Program tidak dapat berjalan, dikarenakan pada binary search dilakukan pembagian data menjadi 2 dan mencari nilai tengah untuk menjadi patokan dalam proses search
4. 
<img src = "1.png">

5. <img src = "2.png">
