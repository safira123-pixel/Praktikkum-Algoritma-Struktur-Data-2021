
package Tugas_4;

import java.util.Scanner;

public class Tugas4<T> {
int vertex;
LinkedList<T> list[];

public Tugas4(int vertex) {
this.vertex = vertex;
list = new LinkedList[vertex];
for (int i = 0; i < vertex; i++) {
list[i] = new LinkedList();
}
}

public void addEdge(int index, int index2, String source, String destination) {
list[index].addFirst(destination);
list[index2].addFirst(source);
}

public void degree(int source) throws Exception {
System.out.println("degree vertex " + source + " : " + list[source].size());
int k, totalIn = 0, totalOut = 0;
for (int i = 0; i < vertex; i++) {
for (int j = 0; j < list[i].size(); j++) {
if (list[i].get(j).equals(source)) {
++totalIn;
}
}
for (k = 0; k < list[source].size(); k++) {
list[source].get(k);
}
totalOut = k;
}
System.out.println("Indegree dai vertex " + source + " : " + totalIn);
System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
}

public void removeEdge(int source, int destination) throws Exception{
for (int i = 0; i < vertex; i++) {
if (i == destination){
list[source].remove(destination);
}
}
}

public void removeAllEdges() {
for (int i = 0; i < vertex; i++) {
list[i].clear();
}
System.out.println("Graph berhasil dikosongkan");
}

public void printGraph() throws Exception {
for (int i = 0; i < vertex; i++) {
if (list[i].size() > 0) {
System.out.print("Vertex " + i + " terhubung dengan: ");
for (int j = 0; j < list[i].size(); j++) {
System.out.print(list[i].get(j) + " ");
}
System.out.println("");
}
}
System.out.println(" ");
}

public static void main(String[] args) throws Exception {
Scanner input = new Scanner(System.in);
Tugas4 tugas4 = new Tugas4(6);
tugas4.addEdge(0, 1, "Malang", "Surabaya");
tugas4.addEdge(0, 4, "Malang", "Sidoarjo");
tugas4.addEdge(1, 2, "Surabaya", "Gresik");
tugas4.addEdge(1, 3, "Surabaya", "Bandung");
tugas4.addEdge(1, 4, "Surabaya", "Sidoarjo");
tugas4.addEdge(2, 3, "Gresik", "Bandung");
tugas4.addEdge(3, 4, "Bandung", "Sidoarjo");
tugas4.addEdge(3, 0, "Bandung", "Malang");
System.out.println("");
tugas4.printGraph(); //memanggil method printGraph
tugas4.degree(2); //memanggil method degree
tugas4.removeEdge(1, 2);
tugas4.printGraph(); //memanggil method printGraph
}
}
