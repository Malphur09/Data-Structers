package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(100);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.insert(20);


        bst.inorder(bst.getRoot());


        System.out.println("---InOrder Traversal---");
        bst.inorder(bst.getRoot());
        System.out.println("---PreOrder Traversal---");
        bst.preorder(bst.getRoot());
        System.out.println("---PostOrder Traversal---");
        bst.postorder(bst.getRoot());


        System.out.println("Minimum Node value " + bst.findMin(bst.getRoot()));
        System.out.println("Maximum Node value " + bst.findMax(bst.getRoot()));
        System.out.println("The depth of the node " + bst.findDepth(bst.getRoot()));


        bst.deleteNode(bst.getRoot(), 50);
        System.out.println("\nInorder traversal after deleting 50:");
        bst.inorder(bst.getRoot());


        if (bst.find(bst.getRoot(), 50) != null) {
            System.out.println("Found!");
        } else {
            System.out.println("Not Found");
        }
    }
}
