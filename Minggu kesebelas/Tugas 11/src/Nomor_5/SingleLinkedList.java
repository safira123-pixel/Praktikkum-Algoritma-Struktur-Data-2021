/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomor_5;

/**
 *
 * @author SAFIRA
 */
public class SingleLinkedList {
    Node front;
    Node rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = front;
            int urut = 0;
            System.out.println("Antrian : ");
            while (tmp != null) {
                System.out.println("Nasabah ke-" + urut + " = " + tmp.noRek
                        + " " + tmp.nama + " " + tmp.alamat);
                tmp = tmp.next;
                urut++;
            }
        } else {
            System.out.println("Antrian Masih Kosong!!");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            Node tmp = front;
            System.out.println("Antrian paling depan : \n"
                    + tmp.noRek + " " + tmp.nama + " " + tmp.alamat);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            Node tmp = front;
            while (tmp != null) {
                if (tmp == rear) {
                    System.out.println("Antrian paling belakang : \n" + tmp.noRek
                            + " " + tmp.nama + " " + tmp.alamat);
                }
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Masih Kosong!!");
        }
    }

    public void Enqueue(String nomorRekening, String nama, String alamat) {
        Node ndInput = new Node(nomorRekening, nama, alamat, null);
        if (isEmpty()) {
            front = ndInput;
            rear = ndInput;
        } else {
            rear.next = ndInput;
            rear = ndInput;
        }
    }

    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong, tidak dapat dihapus!");
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            System.out.println("Dequeue Sukses");
        }
    }

    public void peekAt(int index) {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong!!");
        } else {
            Node tmp = front;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada Index ke-"
                    + index + " adalah " + tmp.noRek
                    + " " + tmp.nama + " " + tmp.alamat);
        }
    }

    public void peekPosition(String key) {
        Node tmp = front;
        int index = 0;
        while (tmp != null && (!(tmp.noRek.equals(key)))) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            System.out.println("Antrian Kosong!!");
        } else {
            System.out.println("Data " + key + " berada pada index ke " + index);
        }
        System.out.println("Data nasabah : \n" + tmp.noRek + " " + tmp.nama + " "
                + tmp.alamat);
    }

    public void clear(int jmlh) {
        if (!isEmpty()) {
            front = rear = null;
            jmlh = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
}

