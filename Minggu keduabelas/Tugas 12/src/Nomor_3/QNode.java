
package Nomor_3;

public class QNode {

    Node front, rear;
    DLL link;
    int size;

    public QNode() {
        this.front = this.rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    void enqueue(int antrian, String nama) {
        Node temp = new Node(null, antrian, nama, null);
        if (isEmpty()) {
            this.front = this.rear = temp;
        } else {
            temp.prev = rear;
            this.rear.next = temp;
            this.rear = temp;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");;
        } else {
            Node temp = this.front;
            if (size > 1) {
                this.front = this.front.next;
                front.prev = null;
            } else {
                this.front = this.rear = null;
            }
            System.out.println(temp.data + " telah selesai divaksinasi");
            size--;
        }
    }

    void displayQueue() {
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("+++++++++++++++++++++++");
        Node temp = front;
        while (temp != null) {
            System.out.println("|" + temp.antrian + "\t|" + temp.data + "\t");
            temp = temp.next;
        }
        System.out.println("Sisa antrian: " + size);
    }
}

