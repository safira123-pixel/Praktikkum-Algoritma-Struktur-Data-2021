# jawaban Pertanyaan Praktikkum
## Praktikkum 1
1. Karena memiliki aturan yaitu setiap clild node sebelah kiri selalu lebih kecil nilainya dari pada root node. Begitu pula sebaliknya, setiap child node sebelah kanan selalu lebih besar nilainya daripada root node. Aturan ini Tujuannya untuk memberikan efisiensi terhadap proses searching. Kalau struktur data tree sudah tersusun rapi sesuai aturan mainnya, proses search akan lebih cepat.

2. Sebagai penanda left child dan right child dari binary tree

3. a. sebagai penanda root pada binary tree
b. nilai dari node adalah nilai data yang dimasukkan pada binary tree

4. Proses yang terjadi adalah method add dimana pada method tersebut terjadi pengecekan jika root dalam keadaan null maka data yang dimasukkan menjadi node baru di dalam tree, jika nilai data kurang dari data yang ada di dalam tree maka data akan dimasukkan ke left child dan sebaliknya

5. jika nilai data kurang dari data yang di bandingkan didalam tree dan left child dari data tersebut masih bernilai null maka data yang diisikan tadi akan menjadi left child dari data itu. Jika tidak maka data tersebut akan menjadi cabang kiri baru disebelah data yang tadi di check

## Praktikkum 2
1. Dalam ilmu komputer, sebuah pohon biner adalah struktur data pohon di mana setiap node memiliki paling banyak dua anak, yang disebut sebagai anak kiri dan anak kanan. Definisi rekursif hanya menggunakan teori himpunan gagasan adalah bahwa (non-kosong) pohon biner adalah tiga (L, S, R), di mana L dan R adalah pohon biner atau himpunan kosong dan S adalah satu set tunggal. Beberapa penulis memungkinkan pohon biner menjadi himpunan kosong juga.

Dari perspektif teori grafik, biner (dan K-ary) pohon seperti yang didefinisikan di sini sebenarnya arborescences. Sebuah pohon biner sehingga dapat juga disebut bifurcating arborescence-istilah yang benar-benar muncul di beberapa buku-buku pemrograman yang sangat tua, sebelum terminologi ilmu komputer modern menang. Hal ini juga memungkinkan untuk menafsirkan sebuah pohon biner sebagai diarahkan, bukan grafik diarahkan, dalam hal pohon biner adalah memerintahkan, berakar pohon. Beberapa penulis menggunakan berakar pohon biner bukan pohon biner untuk menekankan fakta bahwa pohon berakar, tetapi seperti yang didefinisikan di atas, pohon biner selalu berakar. Sebuah pohon biner adalah kasus khusus dari pohon K-ary memerintahkan, di mana k adalah 2.

Dalam komputasi, pohon biner jarang digunakan semata-mata untuk struktur mereka. Jauh lebih khas adalah untuk mendefinisikan fungsi pelabelan pada node, yang menghubungkan beberapa nilai untuk setiap node. Pohon biner berlabel cara ini digunakan untuk mengimplementasikan pohon pencarian biner dan tumpukan biner, dan digunakan untuk pencarian yang efisien dan penyortiran. Penunjukan node non-root sebagai kiri atau kanan anak bahkan ketika hanya ada satu anak hal hadir dalam beberapa aplikasi, khususnya adalah penting dalam pohon pencarian biner. Dalam matematika, apa yang disebut pohon biner dapat bervariasi secara signifikan dari penulis ke penulis. Beberapa menggunakan definisi yang biasa digunakan dalam ilmu komputer, tetapi yang lain mendefinisikannya sebagai setiap non-daun memiliki tepat dua anak dan tidak selalu order (sebagai kiri / kanan)

2. Sebagai Konstruktor berparameter dari class binarytreeArray

3. Dalam pohon pencarian biner yang diurutkan sedemikian rupa sehingga di setiap node kuncinya lebih besar dari semua kunci di subpohon kirinya dan kurang dari semua kunci di subpohon kanannya, traversal in-order mengambil kunci dalam urutan menaik

4. Posisi left child berada pada indeks ke 3 dan posisi right child berada pada indeks ke 2

5. Sebagai parent dalam binary tree array