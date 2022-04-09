public class Application {
    public static void main(String[] args) {

        AvlTree avlTree = new AvlTree();

        Node ROOT = new Node(3);
        ROOT.left = new Node(1);
        ROOT.left.left = new Node(13);
        ROOT.left.right = new Node(5);
        ROOT.left.right.left = new Node(6);
        ROOT.right = new Node(10);
        ROOT.right.left = new Node(11);
        ROOT.right.right = new Node(16);
        ROOT.right.right.left = new Node(15);
        ROOT.right.right.left.left = new Node(9);
        ROOT.right.right.left.right = new Node(4);
        ROOT.right.right.right = new Node(2);


        avlTree.insertNode(2);
        avlTree.insertNode(3);
        avlTree.insertNode(4);
        avlTree.insertNode(5);
        avlTree.insertNode(6);



        System.out.println(ROOT.toString());
    }
}
