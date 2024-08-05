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
        System.out.println(a);
        System.out.println(a.val);

    }
}
