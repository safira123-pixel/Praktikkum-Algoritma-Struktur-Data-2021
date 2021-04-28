/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor_4;

/**
 *
 * @author SAFIRA
 */
public class Node {
    String NoRek, Nama, Alamat;
    Node next;

    public Node(String nomorRekening, String nama, String alamat, Node berikutnya) {
        this.NoRek = nomorRekening;
        this.Nama = nama;
        this.Alamat = alamat;
        this.next = berikutnya;
    }
}
