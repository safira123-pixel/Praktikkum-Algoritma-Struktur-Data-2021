
package Tugas_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void menu(){
System.out.println("===============================================");
System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
System.out.println("===============================================");
System.out.println("1. Input Nilai");
System.out.println("2. Tampil Nilai");
System.out.println("3. Mencari Nilai Mahasiswa");
System.out.println("4. Urut Data Nilai");
System.out.println("5. Keluar");
System.out.println("*****************");
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Scanner scs = new Scanner(System.in);
Mahasiswa m1 = new Mahasiswa("20001","Thalhah","021xxx"); Mahasiswa m2 = new Mahasiswa("20002","Zubair","021xxx");
Mahasiswa m3 = new Mahasiswa("20003","Abdur-Rahman","021xxx");
Mahasiswa m4 = new Mahasiswa("20004","Sa'ad","021xxx");
Mahasiswa m5 = new Mahasiswa("20005","Sa'id","021xxx");
Mahasiswa m6 = new Mahasiswa("20006","Ubaidah","021xxx");
MataKuliah mk1 = new MataKuliah("00001","Internet of Things","3");
MataKuliah mk2 = new MataKuliah("00002","Algoritma dan Struktur Data","2");
MataKuliah mk3 = new MataKuliah("00003","Algoritma dan Pemrograman","2");
MataKuliah mk4 = new MataKuliah("00004","Praktikum Algoritma dan Struktur Data","3");
MataKuliah mk5 = new MataKuliah("00005","Praktikum Algoritma dan Pemrograman","3");
ArrayList<Mahasiswa> am = new ArrayList<>();
ArrayList<MataKuliah> amk = new ArrayList<>();
ArrayList<Nilai> an = new ArrayList<>();
am.add(m1);
am.add(m2);
am.add(m3);
am.add(m4);
am.add(m5);
am.add(m6);
amk.add(mk1);
amk.add(mk2);
amk.add(mk3);
amk.add(mk4);
amk.add(mk5);
am.stream().forEach(mtk->{
System.out.println(""+mtk.toString());
});
boolean inProgram = true;
do {
menu();
System.out.print("Pilih: ");
int pilih = sc.nextInt();
switch (pilih){
case 1:
System.out.println("Masukkan Data");
System.out.print("Nilai: ");
float nilai = sc.nextFloat();
System.out.println("DAFTAR MAHASISWA");
System.out.println("----------------");
System.out.println("NIM\t\t\tNama\t\t\tTelp");
for (Mahasiswa mhs:am) { System.out.println(mhs.nim+"\t\t"+mhs.nama+"\t\t\t"+mhs.notelp);
}
System.out.print("Pilih Mahasiswa by NIM: ");
String nim = scs.nextLine();
System.out.println("\nDAFTAR MATA KULIAH");
System.out.println("--------------------");
System.out.println("Kode\t\tMata Kuliah\t\t\t\t\tSKS"); for (MataKuliah mk:amk) {
System.out.println(mk.kode+"\t\t"+mk.matkul+"\t\t\t"+mk.sks);
}
System.out.print("Pilih MK by kode: ");
String kode = scs.nextLine();
int idxMhs = Collections.binarySearch(am, new Mahasiswa(nim,null,null), Mahasiswa.MhsNimCom);
int idxMk = Collections.binarySearch(amk,new MataKuliah(kode,null,null),MataKuliah.ComMkKode);
Nilai n = new Nilai(am.get(idxMhs),amk.get(idxMk),nilai);
an.add(n);
break;
case 2:
System.out.println("DAFTAR NILAI MAHASISWA");
System.out.println("----------------------");
System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\tSKS\tNilai");
for (Nilai ni: an) {
System.out.println(ni.mahasiswa.nim+"\t"+ ni.mahasiswa.nama+"\t\t"+ ni.mk.matkul+"\t\t"+ ni.mk.sks+"\t"+ ni.nilai);
}
break;
case 3:
System.out.println("DAFTAR NILAI MAHASISWA");
System.out.println("---------------------");
System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\tSKS\tNilai");
for (Nilai ni: an) {
System.out.println(ni.mahasiswa.nim+"\t"+ ni.mahasiswa.nama+"\t\t"+ ni.mk.matkul+"\t\t"+ ni.mk.sks+"\t"+ ni.nilai);
}
System.out.print("Masukkan data mahasiswa[nim]: ");
String findNim = scs.nextLine();
int sks=0;
System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\tSKS\tNilai");
for (Nilai nilaiNim:an) {
if (nilaiNim.mahasiswa.nim.equals(findNim)){
sks += Integer.parseInt(nilaiNim.mk.sks);
System.out.println(nilaiNim.mahasiswa.nim+"\t"+ nilaiNim.mahasiswa.nama+"\t\t"+ nilaiNim.mk.matkul+"\t\t"+ nilaiNim.mk.sks+"\t"+ nilaiNim.nilai);
}
}
System.out.println("Total SKS "+sks+" Telah Diambil");
break;
case 4:
an.sort(Nilai.ComNilai);
System.out.println("DAFTAR NILAI MAHASISWA");
System.out.println("***************");
System.out.println("NIM\t\tNama\t\tMata Kuliah\t\t\tSKS\tNilai");
for (Nilai ni: an) {
System.out.println(ni.mahasiswa.nim+"\t"+ni.mahasiswa.nama+"\t\t"+ ni.mk.matkul+"\t\t"+ ni.mk.sks+"\t"+ ni.nilai);
}
break;
case 5:
inProgram = false;
break;
default:
System.out.println("Menu Tidak Tersedia");
break;
}
}while (inProgram);
}
}
