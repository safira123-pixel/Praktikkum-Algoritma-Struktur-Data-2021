
package Nomor_3;

public class DLL {

    Node head, tail;
    int size;

    public DLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int antrian, String data) {
        if (isEmpty()) {
            head = tail = new Node(null, antrian, data, null);
        } else {
            Node newNode = new Node(tail, antrian, data, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + ", ");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong!!");
        }
    }
}

