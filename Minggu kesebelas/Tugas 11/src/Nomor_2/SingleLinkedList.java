
package Nomor_2;

public class SingleLinkedList {
     Node head;
   Node tail;
   
   public boolean isEmpty(){
       return head == null;
   }
   
   public void print(){
       if(!isEmpty()){
           Node tmp = head;
           System.out.print("isi linked list: \t");
           while(tmp != null){
               System.out.print(tmp.data + "\t");
               tmp = tmp.next;
           }
           System.out.println("");
       } else {
           System.out.println("linked list kosong");
       }
   }
   
   public void addFirst(char input){
       Node ndInput = new Node(input, null);
       if(isEmpty()){
           head = ndInput;
           tail = ndInput;
       } else {
           ndInput.next = head;
           head = ndInput;
       }
   }
   
   public void addLast(char input){
       Node ndInput = new Node(input, null);
       if(isEmpty()){
           head = ndInput;
           tail = ndInput;
       } else {
           tail.next = ndInput;
           tail = ndInput;
       }
   }
   
   public void insertAfter(char key, char input){
       Node ndInput = new Node(input, null);
       Node temp = head;
       do {
           if (temp.data == key){
               ndInput.next =temp.next;
               temp.next = ndInput;
               if(ndInput.next == null) tail=ndInput;
               break;
           }
           temp = temp.next;
       } while(temp != null);
   }
   
   public void insertBefore(char key,char input){
Node temp = head;
while (temp != null){
if((temp == head)&&(temp.data == key))
{ 
this.addFirst(input);
System.out.println("Insert data is succeed.");
break;
}
else if (temp.next.data == key)
{ 
temp.next = temp;
temp = temp.next;
}
}
   }
   
   public void insertAt(int index, char input){
       if(index < 0){
           System.out.println("index salah");
       } else if (index == 0){
           addFirst(input);
       } else {
           Node temp = head;
           for(int i = 0; i < index - 1; i++){
               temp = temp.next;
           }
           temp.next = new Node(input, temp.next);
           if(temp.next.next==null) tail=temp.next;
       }
   }
   
   public char getData(int index){
       Node temp = head;
       for(int i = 0; i < index; i++){
           temp = temp.next;
       }
       return temp.data;
   }
   
   public int indexOf(char key){
       Node temp = head;
       int index = 0;
       while (temp!= null && temp.data != key){
           temp = temp.next;
           index++;
       }
       if(temp == null){
           return -1;
       } else {
           return index;
       }
   }
   
   public void removeFirst(){
       if(isEmpty()){
           System.out.println("linked list masih kosong, tidak dapat dihapus!");
       } else if(head == tail){
           head = tail = null;
       } else {
           head = head.next;
       }
   }
   
   public void removeLast(){
      if(isEmpty()){
           System.out.println("linked list masih kosong, tidak dapat dihapus!");
       } else if(head == tail){
           head = tail = null;
       } else {
           Node temp = head;
           while(temp.next != tail){
               temp = temp.next;  
           }
           temp.next = null;
           tail = temp;
       }
   }
   
   public void remove(char key){
       if(isEmpty()){
           System.out.println("linked list masih kosong, tidak dapat dihapus!");
       } else {
           Node temp = head;
           while(temp != null){
               if((temp.data == key) && (temp == head)){
               this.removeFirst();
               break;
           } else if (temp.next.data == key){
               temp.next = temp.next.next;
                   if(temp.next == null){
                   tail = temp;
                 }
             break;     
       } 
       temp = temp.next;    
   } 
   }
   }
   
   public void removeAt(int index){
       if(index == 0){
           removeFirst();
       } else {
           Node temp = head;
           for(int i = 0; i < index - 1; i++){
               temp = temp.next;
           }
           temp.next = temp.next.next;
           if(temp.next == null)  {
               tail = temp;
           }
       }
   }
}
