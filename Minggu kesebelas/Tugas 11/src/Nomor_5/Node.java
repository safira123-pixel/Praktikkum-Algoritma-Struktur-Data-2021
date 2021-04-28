
package Nomor_5;

public class Node {
    String nama, alamat, noRek;
    Node next;

    public Node(String nomorrekening, String nama, String alamat, Node berikutnya) {
        this.noRek = nomorrekening;
        this.nama = nama;
        this.alamat = alamat;
        this.next = berikutnya;
    }
}
