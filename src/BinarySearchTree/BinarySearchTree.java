package BinarySearchTree;

public class BinarySearchTree {
    class BinaryTreeNode {
        private int value;
        private BinaryTreeNode leftChild;
        private BinaryTreeNode rightChild;
        private BinaryTreeNode parent;

        public BinaryTreeNode(int value, BinaryTreeNode leftChild, BinaryTreeNode rightChild, BinaryTreeNode parent){
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.parent = parent;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setLeftChild(BinaryTreeNode leftChild) {
            this.leftChild = leftChild;
        }

        public void setRightChild(BinaryTreeNode rightChild) {
            this.rightChild = rightChild;
        }

        public void setParent(BinaryTreeNode parent) {
            this.parent = parent;
        }
    }
    private BinaryTreeNode root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }
    public BinaryTreeNode getRoot() {
        return root;
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public void insert(int keyVal) {
        BinaryTreeNode newNode = new BinaryTreeNode(keyVal, null, null, null);
        if (isEmpty()) {
            root = newNode;
            size++;
            return;
        }
        BinaryTreeNode current = root;
        BinaryTreeNode parent;
        while (true) {
            parent = current;
            if (keyVal == current.value) {
                System.out.println("Duplicate Found!!");
                return;
            } else if (keyVal < current.value) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNode;
                    break;
                }
            } else {
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = newNode;
                    break;
                }
            }
        }
    }
    public BinaryTreeNode find(BinaryTreeNode node, int keyVal) {
        if (node == null) {
            System.out.println("Searching Failed!");
            return null;
        }
        if (node.value == keyVal) {
            return node;
        }
        if (keyVal < node.value) {
            return find(node.leftChild, keyVal);
        } else {
            return find(node.rightChild, keyVal);
        }
    }
    public void inorder(BinaryTreeNode node) {
        if (node != null) {
            inorder(node.leftChild);
            System.out.println(node.value);
            inorder(node.rightChild);
        }
    }
    public void preorder(BinaryTreeNode node) {
        if (node != null) {
            System.out.println(node.value);
            preorder(node.leftChild);
            preorder(node.rightChild);
        }
    }
    public void postorder(BinaryTreeNode node) {
        if(node != null) {
            postorder(node.leftChild);
            postorder(node.rightChild);
            System.out.println(node.value);
        }
    }

//    public BinaryTreeNode findMin(BinaryTreeNode node) {
//
//    }
//    public BinaryTreeNode findMax(BinaryTreeNode node) {
//
//    }
}
