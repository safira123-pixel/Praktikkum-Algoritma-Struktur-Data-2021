
package Nomor_4;

public class Node {
    String nim, nama;
    double ipk;
    Node prev, next;
    
public Node(Node prev, String nim, String nama, double ipk, Node next) {
    this.prev = prev;
    this.nim = nim;
    this.nama = nama;
    this.ipk = ipk;
    this.next = next;
    }
}
