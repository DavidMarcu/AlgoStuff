import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeTests {

    private BinarySearchTree target;

    @BeforeEach
    public void setup(){
        target = new BinarySearchTree();
    }

    @Test
    public void testBuildTreeBasicCase(){
        target.addNode(new TreeNode(9));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(6));
        target.addNode(new TreeNode(4));
        target.addNode(new TreeNode(11));
        Assertions.assertEquals(target.getRoot().getValue(), 9);
        Assertions.assertEquals(target.getRoot().getRightSubTree().getValue(), 11);
        Assertions.assertEquals(target.getRoot().getLeftSubTree().getLeftSubTree().getValue(), 4);
    }

    @Test
    public void testBuildTreeWithDuplicatesCase(){
        target.addNode(new TreeNode(9));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(6));
        target.addNode(new TreeNode(4));
        target.addNode(new TreeNode(11));
        target.addNode(new TreeNode(9));
        target.addNode(new TreeNode(5));
        Assertions.assertEquals(target.getRoot().getLeftSubTree().getRightSubTree().getRightSubTree().getValue(), 9);
        Assertions.assertEquals(target.getRoot().getLeftSubTree().getLeftSubTree().getRightSubTree().getValue(), 5);
    }

    @Test
    public void testInOrderTraversalBasicCase(){
        List<Integer> inOrderList = List.of(4, 5, 6, 9, 11);
        target.addNode(new TreeNode(9));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(6));
        target.addNode(new TreeNode(4));
        target.addNode(new TreeNode(11));
        Assertions.assertEquals(target.inOrderTraversal(target.getRoot(), new ArrayList<>()), inOrderList);
    }

    @Test
    public void testInOrderTraversalWithDuplicatesCase(){
        List<Integer> inOrderList = List.of(4, 5, 5, 6, 9, 9, 11);
        target.addNode(new TreeNode(9));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(6));
        target.addNode(new TreeNode(4));
        target.addNode(new TreeNode(11));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(9));
        Assertions.assertEquals(target.inOrderTraversal(target.getRoot(), new ArrayList<>()), inOrderList);
    }

    @Test
    public void testPreOrderTraversalBasicCase(){
        List<Integer> preOrderList = List.of(9, 5, 4, 6, 11);
        target.addNode(new TreeNode(9));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(6));
        target.addNode(new TreeNode(4));
        target.addNode(new TreeNode(11));
        Assertions.assertEquals(target.preOrderTraversal(target.getRoot(), new ArrayList<>()), preOrderList);
    }

    @Test
    public void testPreOrderTraversalWithDuplicatesCase(){
        List<Integer> preOrderList = List.of(9, 5, 4, 5, 6, 9, 11);
        target.addNode(new TreeNode(9));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(6));
        target.addNode(new TreeNode(4));
        target.addNode(new TreeNode(11));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(9));
        Assertions.assertEquals(target.preOrderTraversal(target.getRoot(), new ArrayList<>()), preOrderList);
    }

    @Test
    public void testPostOrderTraversalBasicCase(){
        List<Integer> postOrderList = List.of(4, 6, 5, 11, 9);
        target.addNode(new TreeNode(9));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(6));
        target.addNode(new TreeNode(4));
        target.addNode(new TreeNode(11));
        Assertions.assertEquals(target.postOrderTraversal(target.getRoot(), new ArrayList<>()), postOrderList);
    }

    @Test
    public void testPostOrderTraversalWithDuplicatesCase(){
        List<Integer> postOrderList = List.of(5, 4, 9, 6, 5, 11, 9);
        target.addNode(new TreeNode(9));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(6));
        target.addNode(new TreeNode(4));
        target.addNode(new TreeNode(11));
        target.addNode(new TreeNode(5));
        target.addNode(new TreeNode(9));
        Assertions.assertEquals(target.postOrderTraversal(target.getRoot(), new ArrayList<>()), postOrderList);
    }
}
