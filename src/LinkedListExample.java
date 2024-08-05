public class LinkedListExample {
    public static class Node{
        int val;
        Node node;
        public Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.node = b;
        b.node = c;
        c.node =d;
        System.out.println(a);
        System.out.println(a.node);
        System.out.println(a.val);
        System.out.println(a.node);
        System.out.println(b.node);
        System.out.println(c);
        System.out.println(a.node.node.val);
        System.out.println(d.node);

    }
}
