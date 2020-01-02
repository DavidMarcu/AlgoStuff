public class LoopDetection {

    private LinkedListNode getLoop(LinkedListNode head) {
        LinkedListNode iterator = head;
        LinkedListNode runnerIterator = iterator.getNext();
        while (iterator != null && runnerIterator != null && runnerIterator.getNext() != null && iterator != runnerIterator) {
            iterator = iterator.getNext();
            runnerIterator = runnerIterator.getNext().getNext();
        }
        if(iterator != null && runnerIterator != null){
            return iterator;
        }
        return null;
    }

    public boolean isLoop(LinkedListNode head){
        return getLoop(head) != null;
    }

    public LinkedListNode getInitialLoopNode(LinkedListNode head){
        LinkedListNode loop = getLoop(head);
        if (loop == null){
            return null;
        }
        LinkedListNode iterator = loop;
        LinkedListNode runnerIterator = head;
        while (iterator != runnerIterator){
            iterator = iterator.getNext();
            if (iterator == runnerIterator){
                break;
            }
            runnerIterator = runnerIterator.getNext();
        }
        return iterator;
    }
}
