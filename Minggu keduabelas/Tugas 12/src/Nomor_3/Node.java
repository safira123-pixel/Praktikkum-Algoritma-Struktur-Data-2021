
package Nomor_3;

public class Node {

    int antrian;
    String data;
    Node prev, next;
    
    Node(Node prev, int antrian, String data, Node next){
        this.prev=prev;
        this.antrian = antrian;
        this.data=data;
        this.next=next;
    }
}

