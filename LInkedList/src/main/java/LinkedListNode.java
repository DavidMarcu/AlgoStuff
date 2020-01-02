public class LinkedListNode {
    private int value;
    private LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }

    public LinkedListNode(LinkedListNode node){
        this.value = node.value;
        this.next = node.next;
    }

    public int getValue() {
        return value;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void add(int value) {
        var nextNode = new LinkedListNode(value);
        LinkedListNode iterator = this;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = nextNode;
    }

    public void add(LinkedListNode newNode) {
        LinkedListNode iterator = this;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = newNode;
    }
}
