public class LinkedListNode {
    private int value;
    private LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }

    public LinkedListNode(LinkedListNode head){
        this.value = head.value;
        this.next = head.next;
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
}
