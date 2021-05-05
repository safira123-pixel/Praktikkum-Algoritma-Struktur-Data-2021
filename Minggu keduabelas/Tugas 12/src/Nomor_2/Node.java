

package Nomor_2;

public class Node {
  String data;
  Node prev, next;
    
public Node(Node prev, String data, Node next) {
    this.prev = prev;
    this.data = data;
    this.next = next;
    }  
}
