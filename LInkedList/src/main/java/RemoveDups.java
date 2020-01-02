import java.util.LinkedHashSet;

public class RemoveDups {

    public LinkedListNode getLinkedListWithoutDups(LinkedListNode head){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        LinkedListNode iterator = new LinkedListNode(head);

        while(iterator.getNext() != null){
            linkedHashSet.add(iterator.getValue());
            iterator = iterator.getNext();
        }
        LinkedListNode linkedListNoDups = null;
        for(Integer value: linkedHashSet){
            if(linkedListNoDups == null){
                linkedListNoDups = new LinkedListNode(value);
            }
            else {
                linkedListNoDups.add(value);
            }
        }
        return linkedListNoDups;
    }
}

