public class MyStack {
    private Node top;
    private int size;

    public static class Node {
        private int element;
        private Node previous;

        Node(int element) {
            this.element = element;
            this.previous = null;
        }
    }

    public MyStack() {

    }

    public void push(int element) {
        Node newNode = new Node(element);
        if (this.top != null) {
            newNode.previous = this.top;
        }
        this.top = newNode;
        this.size++;
    }

    public int peek() {
        ensureNotEmpty();
        return this.top.element;
    }

    public int size() {
        return this.size;
    }
    public int pop(){
        ensureNotEmpty();
        int result = this.top.element;

        this.top = this.top.previous;
        this.size--;
        return result;
    }

    private void ensureNotEmpty() {
        if (this.top == null) {
            throw new IllegalStateException("Empty Stack");
        }
    }
}
