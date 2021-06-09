

package Tugas_4;


public class Node<T> {
T data;
Node<T> prev;
Node<T> next;

public Node(Node<T> prev, T nilai, Node<T> next){
this.prev = prev;
this.data = nilai;
this.next = next;
}
}