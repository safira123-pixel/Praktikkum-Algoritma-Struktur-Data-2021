
package Nomor_4;

public class SingleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            int urut = 0;
            System.out.println("Antrian : ");
            while (tmp != null) {
                System.out.println("Nasabah ke-" + urut + " = " + tmp.NoRek + " "
                        + tmp.Nama + " " + tmp.Alamat);
                tmp = tmp.next;
                urut++;
            }
        } else {
            System.out.println("Antrian Masih Kosong!!");
        }
    }

    public void frontQueue() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Antrian paling depan : \n"
                    + tmp.NoRek + " " + tmp.Nama + " " + tmp.Alamat);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void lastQueue() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                if (tmp == tail) {
                    System.out.println("Antrian paling belakang : \n" + tmp.NoRek
                            + " " + tmp.Nama + " " + tmp.Alamat);
                }
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Masih Kosong!!");
        }
    }

    public void addData(String nomorRekening, String nama, String alamat) {
        Node ndInput = new Node(nomorRekening, nama, alamat, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void searchIndex(int index) {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong!!");
        } else {
            Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada Index ke- " + index + " adalah " + tmp.NoRek
                    + " " + tmp.Nama + " " + tmp.Alamat);
        }
    }

    public void searchNoRek(String key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && (!(tmp.NoRek.equals(key)))) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            System.out.println("Antrian Kosong!");
        } else {
            System.out.println("Data " + key + " berada pada index ke " + index);
        }
        System.out.println("Data nasabah : \n" + tmp.NoRek + " " + tmp.Nama + " "
                + tmp.Alamat);
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Antrian Masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
}


