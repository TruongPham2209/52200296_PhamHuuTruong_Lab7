public class Node {

    public Node(int key) {
        this.key = key;
        this.height = 0;
        this.left = null;
        this.right = null;
    }

    public int key;
    public Node left;
    public Node right;
    public int height;
}
