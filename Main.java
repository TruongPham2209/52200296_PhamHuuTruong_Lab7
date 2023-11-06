public class Main {
    public static void print(Node node) {
        if (node != null) {
            print(node.left);
            System.out.println(node.key);
            print(node.right);
        }
    }

    public static void main(String[] args) {
        IAVLTree tree = new AVLTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(9);
        Node root = tree.getRoot();
        print(root);
    }
}
