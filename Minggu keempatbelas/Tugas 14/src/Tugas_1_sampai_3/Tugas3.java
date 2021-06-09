
package Tugas_1_sampai_3;

import Praktikkum_1.LinkedList;
import java.util.Scanner;

public class Tugas3 {
int vertex;
boolean typegraph;
LinkedList list[];

public Tugas3(int vertex, boolean typegraph) {
this.vertex = vertex;
this.typegraph = typegraph;
list = new LinkedList[vertex];
for (int i = 0; i < vertex; i++) {
list[i] = new LinkedList();
}
}

public void addEdge(int source, int destination) {
if (graphtype(typegraph)) {
list[source].addFirst(destination);
} else {
list[source].addFirst(destination);
list[destination].addFirst(source);
}
}

public void degree(int source) throws Exception {
if (graphtype(typegraph)) {
int k, totalIn = 0, totalOut = 0;
for (int i = 0; i < vertex; i++) {
for (int j = 0; j < list[i].size(); j++) {
if (list[i].get(j) == source) {
++totalIn;
}
}

for (k = 0; k < list[source].size(); k++) {
list[source].get(k);
}
totalOut = k;
}
System.out.println("Indegree dari vertex " + source + " : " + totalIn);
System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
} else {

System.out.println("degree vertex " + source + " : " + list[source].size());
}
}

public void removeEdge(int source, int destination) throws Exception{
for (int i = 0; i < list[source].size(); i++) {
if (destination==list[source].get(i)){
list[source].remove(i);
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

boolean graphtype(boolean pilih) {
return pilih;
}

public static void main (String[] args) throws Exception {
int count = 1, to, from, pilih;
boolean jenis;
Scanner input = new Scanner(System.in);
System.out.println("Pilih jenis graph");
System.out.println("1. Directed");
System.out.println("2. Undirected");
System.out.print("Pilih : ");
pilih = input.nextInt();
if (pilih == 1) {
System.out.println("Menggunakan Directed");
jenis = true;
} else {
System.out.println("Menggunakan Undirected");
jenis = false;
}
System.out.println("");
Tugas3 graph = new Tugas3(6, jenis);
System.out.print("Masukkan jumlah inputan lintasan : ");
int jumlah = input.nextInt();
System.out.println("------------------------------------");
System.out.println("Masukkan edges: ");
while (count <= jumlah) {
to = input.nextInt();
from = input.nextInt();
graph.addEdge(to, from);
count++;
}
System.out.println("");
graph.printGraph();
graph.degree(2);
graph.removeEdge(3, 4);
graph.printGraph(); 
}
}