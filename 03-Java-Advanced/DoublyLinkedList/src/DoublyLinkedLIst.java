public class DoublyLinkedLIst {

    private Node head;
    private Node tail;
    private int size;

    private static class Node {
        private Node prev;
        private Node next;
        private int element;

        public Node(int element) {
            this.element = element;
        }

    }

    public DoublyLinkedLIst() {

    }

    public void addLast(int element) {
        this.size++;
        Node newNode = new Node(element);
        if (this.tail == null) {

            this.head = this.tail = newNode;
            return;
        }
        newNode.prev = this.tail;
        this.tail.next = newNode;
        this.tail = newNode;
    }

    public void addFirst(int element) {
        if (this.head == null) {
            this.addLast(element);
            return;
        }
        this.size++;
        Node newNode = new Node(element);
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;

    }

    public int removeLast() {
        if (this.size == 0) {
            throw new IllegalStateException("Illegal remove called on empty list");
        }
        int element = this.tail.element;

        if (this.size == 1) {
            this.head = this.tail = null;

        } else {
            this.tail = this.tail.prev;
            this.tail.next.prev = null;
            this.tail.next = null;
        }
        this.size--;
        return element;

    }

    public int removeFirst() {
        if (this.size <= 1) {
            return this.removeLast();
        }
        int element = this.head.element;

        this.head = this.head.next;
        this.head.prev.next = null;
        this.head.prev = null;

        this.size--;


        return element;

    }

    public boolean insertAfter(int nodeValue, int element) {
        Node current = this.head;

        while (current != null) {

            if(current.element == nodeValue){
                if(current.next == null){
                    this.addLast(element);
                    return true;
                } else {
                    this.size++;
                    Node newNode = new Node(element);
                    newNode.next = current.next;
                    newNode.prev = current;
                    current.prev = current.next.prev;
                    current.next.prev = newNode;
                    current.next = newNode;
                }
            }

            current = current.next;

        }
        return false;
    }

}

