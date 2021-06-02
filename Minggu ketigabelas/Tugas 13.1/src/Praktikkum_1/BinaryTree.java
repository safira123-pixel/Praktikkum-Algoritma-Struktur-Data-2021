package Praktikkum_1;


import Praktikkum_1.Node;


public class BinaryTree {
    Node root;
    
    public BinaryTree(){
         root = null;
        
    }
     boolean isEmpty(){
         return root == null;
         
     }
 
     void add(int data){
         if (isEmpty()) {
             root = new Node(data);
         } else {
             Node current = root;
             while(true){
                 if (data<current.data) {
                     if(current.left!=null){
                         current= current.left;
                         break;
                     }else{
                         current.left= new Node(data);
                         break;
                     }
                 } else if(data >current.data) {
                     if (current.right!=null) {
                         current= current.right;
                     } else {
                         current.right=new Node(data);
                         break;
                     }
                 }else{
                     break;
                 }
             }
         }
     }
    boolean find(int data){
        boolean hasil= false;
        Node current = root;
        while(current!= null){
            if (current.data ==data) {
                hasil= true;
                break;
            }else if(data<current.data){
                current=current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
void traversePreOrder(Node node){
    if(node != null){
        System.out.println(" "+ node.data);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}

void traversePostOrder(Node node){
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.println(" "+node.data);
    }
}

void traverseInOrder(Node node){
    if (node != null){
        traverseInOrder(node.left);
        System.out.println(" "+ node.data);
        traverseInOrder(node.right);
    }
}
Node getSuccessor(Node del){
 Node successor = del.right;
 Node successorParent = del;
 while(successor.left!=null){
     successorParent = successor;
     successor = successor.left;
 }
    if (successor!=del.right) {
        successorParent.left = successor.right;
        successor.right=del.right;
    }
    return successor;
}

void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChiled = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChiled = true;
            }else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChiled = false;
            }
        }
        //deletion
        if(current == null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            //if there is no child, simply delete it
            if(current.left == null && current.right == null ){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChiled){
                        parent.left = null;   
                    }else{
                        parent.right = null;
                    }  
                }
            }else if(current.left == null){//if there is 1 child (right)
                if(current == root){
                    root = current.right;
                }else{
                    if(isLeftChiled){
                        parent.left = current.right;   
                    }else{
                        parent.right = current.left;
                    }  
                }
            }else if(current.right == null){//if there is 1 child (left)
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChiled){
                        parent.left = current.left;   
                    }else{
                        parent.right = current.left;
                    }  
                }
            }else{//if there is 2 childs
                Node successor = getSuccessor(current);
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChiled){
                        parent.left = successor;   
                    }else{
                        parent.right =successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }


public static void inorder(Node root){
        if (root == null) {
            return;
        }
 
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
 
public static Node insert(Node root, int key){
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
        else {
            root.right = insert(root.right, key);
        }
        return root;
    }
    
static int findMax(Node node){
        if (node == null)
            return Integer.MIN_VALUE;
  
        int res = node.data;
        int lres = findMax(node.left);
        int rres = findMax(node.right);
  
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }
    
static int findMin(Node node){
    if (node == null)
        return Integer.MAX_VALUE;
  
    int res = node.data;
    int lres = findMin(node.left);
    int rres = findMin(node.right);
  
    if (lres < res)
        res = lres;
    if (rres < res)
        res = rres;
    return res;
}
    
static void printLeafNodes(Node root){
    if (root == null)
        return;
    
    if (root.left == null &&
        root.right == null)
    {
        System.out.print(root.data + " ");
        return;
    }
 
    if (root.left != null)
        printLeafNodes(root.left);
 
    if (root.right != null)
        printLeafNodes(root.right);
}

static Node newNode(int data){
    Node temp = new Node();
    temp.data = data;
    temp.left = null;
    temp.right = null;
    return temp;
}

int getLeafCount() 
    {
        return getLeafCount(root);
    }
   
    int getLeafCount(Node node) 
    {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }
}
    

