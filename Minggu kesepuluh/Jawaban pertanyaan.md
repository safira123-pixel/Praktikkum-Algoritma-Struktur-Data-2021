# Jawaban Pertanyaan
## Praktikkum 1
1. Rear dan front bernilai -1 dikarenakan tidak menunjuk ke data manapun dan mengindikasikan bahwa queue masih kosong
2. Menunjukkan enqueue(penambahan data) ketika data queue berada di indeks paling akhir dari array maka penambahan data menempati baris array paling depan dengan rear = 0
3. 
    public void Enqueue(int data) { 
         if(IsFull()){ 
        System.out.println("Queque sudah penuh");
         } else {
             if(IsEmpty()){
                 front = rear = 0;
             } else {
                 if(rear == max - 1){
                     rear = 0;
                 } else {
                     rear++; //(bagian ini)
                 }
             } Q[rear] = data;
             size++;
         } }
4. public int Dequeue() { 
    int data = 0;
         if(IsEmpty()){
             System.out.println("Queque masih kosong");
         } else {
             data = Q[front];
             size--;
             if(IsEmpty()){
                 front = rear = -1; //(bagian ini)
             } else {
                 if(front == max - 1){
                     front = 0;
                 } else {
                     front++;
                 } 
            }
         }return data;
     }
5. Potongan kode tersebut menjelaskan proses dequeue ketika data yang diambil berada pada indeks terakhir maka setelah data diambil maka front bergeser ke front = 0
6. Dikarenakan front berada pada indeks ke 0, maka looping tidak selalu dimulai pada indeks ke 0 melainkan dimulai dimana front berada
7. Menunjukkan bahwa kode program akan dijalankan jika i(rear) tidak melebihi dari max, jika melebihi maka program tidak akan berjalan

## Praktikkum 2
1. kode program itu artinya memasukkan data -data ke dalam elemen antrian
2. Maka program akan error dikarenakan tidak sesuainya data pada elemen yang akan dikeluarkan
3. Gambar kode program
<img src ="1.png">

4. Gambar
<img src ="2.png">
<img src ="3.png">