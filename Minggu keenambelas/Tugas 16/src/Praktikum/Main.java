/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Praktikum;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SAFIRA
 */
public class Main {
     public static void main(String[] args){
    ListMahasiswa lm = new ListMahasiswa();
    Mahasiswa m = new Mahasiswa("2041234", "Noureen", "021xx1");
    Mahasiswa m1 = new Mahasiswa("2041235", "Akhleema", "021xx2");
    Mahasiswa m2 = new Mahasiswa("2041236", "Shannum", "021xx3");
    lm.tambah(m, m1, m2);
    lm.tampil();
    lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema lela", "021xx2"));
    System.out.println();
    lm.tampil(); 
          
     System.out.println("Provided List are: "+lm);  
          System.out.print("Enter the search key: ");  
          Scanner sc = new Scanner (System.in);  
          String key = sc.next();  
          int index;       
        // index = Collections.binarySearch(lm, key,  Collections.reverseOrder());
    //      System.out.println("Search Key is available at position: "+index);  
          sc.close();
          
     //     Collections.sort((List<T>) lm);
   System.out.println("setelah sorting "+ "Collections.sort() : \n" + lm);
}
}