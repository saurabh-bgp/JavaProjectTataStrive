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
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.node = b;
        b.node = c;
        c.node =d;
        d.node = e;
        e.node = f;
        f.node = g;
//        System.out.println(a);
//        System.out.println(a.node);
//        System.out.println(a.val);
//        System.out.println(a.node);
//        System.out.println(b.node);
//        System.out.println(c);
//        System.out.println(a.node.node.val);
//        System.out.println(d.node);
        Node temp = a;
       while (temp!=null){
           System.out.println(temp.val);
           temp=temp.node;
       }

    }
}
