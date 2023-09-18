package Task;

public class RedBlackTree {
    private Node root;

    private class Node {
        private int value;
        private Color color;
        private Node leftChild;
        private Node rightChild;
        public Node(){

        }
        public Node(int value, Color color) {
            this.value = value;
            this.color = color;
        }

    }

    private enum Color {
        RED, BLACK
    }

    private boolean addNode(Node node, int value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value > value) {
                if (node.leftChild != null) {
                    boolean result = addNode(node.leftChild, value);
                    node.leftChild = rebalance(node.leftChild);
                    return result;
                } else {
                    node.leftChild = new Node(value, Color.RED);
                    return true;
                }
            } else {
                if (node.rightChild != null) {
                    boolean result = addNode(node.rightChild, value);
                    node.rightChild = rebalance(node.rightChild);
                    return result;
                } else {
                    node.rightChild = new Node(value, Color.RED);
                    return true;
                }
            }
        }

    }


    private void colorSwap(Node node) {
        node.rightChild.color = Color.BLACK;
        node.leftChild.color = Color.BLACK;
        node.color = Color.RED;
    }

    private Node leftSwap(Node node) {
        Node leftchild = node.leftChild;
        Node betweenChild = leftchild.rightChild;
        leftchild.rightChild = node;
        node.leftChild = betweenChild;
        leftchild.color = node.color;
        node.color = Color.RED;
        return leftchild;
    }

    private Node rightSwap(Node node) {
        Node rightChild = node.rightChild;
        Node betweenChild = rightChild.leftChild;
        rightChild.leftChild = node;
        node.rightChild = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    private Node rebalance(Node node) {
        Node res = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (res.rightChild != null && res.rightChild.color == Color.RED &&
                    (res.leftChild == null || res.leftChild.color == Color.BLACK)) {
                needRebalance = true;
                res = rightSwap(res);
            }
            if (res.leftChild != null && res.leftChild.color == Color.RED &&
                    (res.leftChild.leftChild != null && res.leftChild.leftChild.color == Color.RED)) {
                needRebalance = true;
                res = leftSwap(res);
            }
            if (res.leftChild != null && res.leftChild.color == Color.RED &&
                    (res.rightChild != null && res.rightChild.color == Color.RED)) {
                needRebalance = true;
                colorSwap(res);
            }
        }
        while (needRebalance);
        return res;
    }

    public boolean add(int value) {
        if (root != null) {
            boolean result = addNode(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return result;
        } else {
            root = new Node(value, Color.BLACK);
            return true;
        }
    }
}
