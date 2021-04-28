
package Nomor_2;

public class HurufMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst('b');
        singLL.print();
        singLL.addLast('c');
        singLL.print();
        singLL.addFirst('a');
        singLL.print();
        singLL.insertAfter('c', 'd');
        singLL.print();
        singLL.addLast('e');
        singLL.print();
}
}
