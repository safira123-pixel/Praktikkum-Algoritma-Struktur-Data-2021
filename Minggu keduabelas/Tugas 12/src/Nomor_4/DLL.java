
package Nomor_4;

public class DLL {
    Node head;
    int size;
    
public DLL() {
    head = null;
    size = 0;
    }

public boolean isEmpty() {
    return head == null;
    }

public void addFirst(String nim, String nama, double ipk) {
    if (isEmpty()) {
    head = new Node(null, nim, nama, ipk, null);
    } else {
    Node newNode = new Node(null, nim, nama, ipk, head);
    head.prev = newNode;
    head = newNode;
    }
    size++;
    }

public void addLast(String nim, String nama, double ipk) {
    if (isEmpty()) {
    addFirst(nim, nama, ipk);
    } else {
    Node current = head;
    while (current.next != null) {
    current = current.next;
    }
    Node newNode = new Node(current, nim, nama, ipk, null);
    current.next = newNode;
    size++;
    }
}

public void add(String nim, String nama, double ipk, int index) {
    if (isEmpty()) {
    addFirst(nim, nama, ipk);
    } else if (index < 0 || index > size) {
    System.out.println("Nilai index diluar batas");
    } else {
    Node current = head;
    for (int i = 0; i < index; i++) {
    current = current.next;
    }
    if (current.prev == null) {
    Node newNode = new Node(null, nim, nama, ipk, current);
    current.prev = newNode;
    newNode = head;
    } else {
    Node newNode = new Node(current.prev, nim, nama, ipk, current);
    newNode.prev = current.prev;
    newNode.next = current;
    current.prev.next = newNode;
    current.prev = newNode;
    }
}
    size++;
}

public void removeFirst() {
    if (isEmpty()) {
    System.out.println("Linked List masih kosong, tidak dapat dihapus");
    } else if (size == 1) {
    removeLast();
    } else {
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("NIM : " + head.nim);
    System.out.println("Nama: " + head.nama);
    System.out.println("IPK : " + head.ipk);
    head = head.next;
    head.prev = null;
    size--;
    }
}
public void removeLast() {
    if (isEmpty()) {
    System.out.println("Linked List masih kosong, tidak dapat dihapus");
    } else if (head.next == null) {
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("NIM : " + head.nim);
    System.out.println("Nama: " + head.nama);
    System.out.println("IPK : " + head.ipk);
    head = null;
    size--;
    return;
    }
    Node current = head;
    while (current.next.next != null) {
    current = current.next;
    }
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("IDENTITAS:");
    System.out.println("NIM : " + current.next.nim);
    System.out.println("Nama: " + current.next.nama);
    System.out.println("IPK : " + current.next.ipk);
    current.next = null;
    size--;
}

public void remove(int index) {
    if (index < 0 || index > size) {
    System.out.println("nilai indeks di luar batas");
    } else if (index == 0) {
    removeFirst();
    } else {
    Node current = head;
    for (int i = 0; i < index; i++) {
    current = current.next;
    }
    if (current.next == null) {
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("NIM : " + current.nim);
    System.out.println("Nama: " + current.nama);
    System.out.println("IPK : " + current.ipk);
    current.prev.next = null;
    } else if (current.prev == null) {
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("NIM : " + current.nim);
    System.out.println("Nama: " + current.nama);
    System.out.println("IPK : " + current.ipk);
    current = current.next;
    current.prev = null;
    head = current;
    } else {
    System.out.println("Mahasiswa yang dihapus");
    System.out.println("NIM : " + current.nim);
    System.out.println("Nama: " + current.nama);
    System.out.println("IPK : " + current.ipk);
    current.prev.next = current.next;
    current.next.prev = current.prev;
    }
    size--;
    }
}

public void print() {
    if (!isEmpty()) {
    Node tmp = head;
    while (tmp != null) {
    System.out.println("NIM : " + tmp.nim);
    System.out.println("Nama: " + tmp.nama);
    System.out.println("IPK : " + tmp.ipk);
    tmp = tmp.next;
    }
    } else {
    System.out.println("Linked List Kosong");
    }
}

public void seqSearch(String cari) {
    int idx = -1;
    Node current = head;
    for (int i = 0; i < size; i++) {
    if (current.nim.equals(cari)) {
    idx = i;
    } else {
    current = current.next;
    }
    }
    if (idx != -1) {
    System.out.println("Data " + cari + " berada di node ke-" + idx);
    System.out.println("NIM : " + current.nim);
    System.out.println("Nama: " + current.nama);
    System.out.println("IPK : " + current.ipk);
    } else {
    System.out.println("Data yang anda cari tidak ditemukan");
    }
}
public void bubbleSort() {
    Node pos1, pos2, min;
    double tmp;
    if (head != null) {
    pos1 = head;
    while (pos1.next != null) {
    pos2 = pos1;
    min = pos1;
    while (pos2 != null) {
    if (pos2.ipk < min.ipk) {
    min = pos2;
    }
    pos2 = pos2.next;
    }
    if (pos1.ipk > min.ipk) {
    tmp = pos1.ipk;
    pos1.ipk = min.ipk;
    min.ipk = tmp;
    }
    pos1 = pos1.next;
    }
    } else {
    System.out.println("Linked List masih Kosong");
    }
  }
}
