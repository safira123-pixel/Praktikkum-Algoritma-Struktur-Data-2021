

package Array_Mahasiswa;

import java.util.Scanner;

public class MahasiswaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] mhArray = new Mahasiswa[3];
        
        for(int i = 0; i < 3; i++){
            mhArray[i] = new Mahasiswa();
            System.out.println("Masukkan Data Mahasiswa ke- "+i);
            System.out.println("Masukkan Nama: ");
            mhArray[i].nama = sc.nextLine();
            System.out.println("Masukkan Nim: ");
            mhArray[i].nim = sc.nextLine();
            System.out.println("Masukkan Jenis Kelamin: ");
            mhArray[i].jenisKelamin = sc.nextLine();
            System.out.println("Masukkan Nilai IPK: ");
            mhArray[i].ipk = sc.nextInt();
        }    
            for(int i = 0; i < 3; i++){
            System.out.println("Data Mahasiswa ke - "+i);
            System.out.println("Nama: "+mhArray[i].nama);
            System.out.println("Nim: "+mhArray[i].nim);
            System.out.println("Jenis Kelamin: "+mhArray[i].jenisKelamin);
            System.out.println("Nilai IPK: "+mhArray[i].ipk);
            System.out.println("Rata - rata ipk: "+mhArray[i].rataRataIpk());

        }

        }
    }

