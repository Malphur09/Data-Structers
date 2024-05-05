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

        public BinaryTreeNode getLeftChild() {
            return leftChild;
        }

        public BinaryTreeNode getRightChild() {
            return rightChild;
        }

        public BinaryTreeNode getParent() {
            return parent;
        }

        public int getValue() {
            return value;
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

        @Override
        public String toString() {
            return "BinaryTreeNode{" +
                    "value=" + value +
                    '}';
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

    //insert,delete,find
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
    public BinaryTreeNode deleteNode(BinaryTreeNode node, int keyVal) {
        if (node == null) {
            return null; // Key not found
        }
        // Search for the node using recursion
        if (keyVal < node.value) {
            node.leftChild = deleteNode(node.leftChild, keyVal);
            if (node.leftChild != null) {
                node.leftChild.parent = node;
            }
        } else if (keyVal > node.value) {
            node.rightChild = deleteNode(node.rightChild, keyVal);
            if (node.rightChild != null) {
                node.rightChild.parent = node;
            }
        } else {
            if (node.leftChild == null && node.rightChild == null) {
                // Case 1: Node is a leaf
                if (node.parent != null) {
                    if (node.parent.leftChild == node) {
                        node.parent.leftChild = null;
                    } else {
                        node.parent.rightChild = null;
                    }
                }
                node = null;
            } else if (node.leftChild == null || node.rightChild == null) {
                // Case 2: Node has one child
                BinaryTreeNode child = (node.leftChild != null) ? node.leftChild : node.rightChild;
                if (node.parent != null) {
                    if (node.parent.leftChild == node) {
                        node.parent.leftChild = child;
                    } else {
                        node.parent.rightChild = child;
                    }
                }
                child.parent = node.parent;
                node = null;
            } else {
                // Case 3: Node has two children
                BinaryTreeNode successor = findMin(node.rightChild);
                node.value = successor.value;
                node.rightChild = deleteNode(node.rightChild, successor.value);
                if (node.rightChild != null) {
                    node.rightChild.parent = node;
                }
            }
        }
        return node;
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

    // Traversal Methods
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
    // Find min,max,depth methods
    public BinaryTreeNode findMin(BinaryTreeNode node) {
        while(node.leftChild != null){
            node = node.leftChild;
        }
        return node;
    }
    public BinaryTreeNode findMax(BinaryTreeNode node) {
        while(node.rightChild != null) {
            node = node.rightChild;
        }
        return node;
    }
    public int findDepth(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }
        int lDepth = findDepth(node.leftChild);
        int rDepth = findDepth(node.rightChild);

        if (lDepth > rDepth) {
            return (lDepth + 1);
        } else {
            return (rDepth + 1);
        }
    }
}
