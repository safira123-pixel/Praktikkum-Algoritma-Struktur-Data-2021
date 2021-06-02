package Praktikkum_1;


public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt= new BinaryTree();
        
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        
        bt.traversePostOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
 
        Node root = null;
        for (int key: keys) {
            root = bt.insert(root, key);
        }
 
        bt.inorder(root);
        
        System.out.println("Maximum element is "
                           + bt.findMax(bt.root));
        
        System.out.println("Minimum element is "
                           + bt.findMin(bt.root));
        
        bt.printLeafNodes(root);
        
        System.out.println("The leaf count of binary tree is : " 
                             + bt.getLeafCount());
    }
    }



