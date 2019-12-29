import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    @Test
    public void testInitialTree() throws IOException, URISyntaxException {
        BinaryTree binaryTree = new BinaryTree(Paths.get(ClassLoader.getSystemResource("nodes.txt").toURI()));
        Assertions.assertEquals(1, binaryTree.getRoot().getValue());
        Assertions.assertEquals(2, binaryTree.getRoot().getLeftSubTree().getValue());
        Assertions.assertEquals(7, binaryTree.getRoot().getLeftSubTree().getLeftSubTree().getRightSubTree().getValue());
        Assertions.assertNull(binaryTree.getRoot().getLeftSubTree().getLeftSubTree().getRightSubTree().getLeftSubTree());
    }

    @Test
    public void testNodes2Tree() throws IOException, URISyntaxException {
        BinaryTree binaryTree = new BinaryTree(Paths.get(ClassLoader.getSystemResource("nodes2.txt").toURI()));
        Assertions.assertEquals(1, binaryTree.getRoot().getValue());
        Assertions.assertEquals(2, binaryTree.getRoot().getLeftSubTree().getValue());
        Assertions.assertEquals(7, binaryTree.getRoot().getLeftSubTree().getLeftSubTree().getRightSubTree().getValue());
        Assertions.assertEquals(8, binaryTree.getRoot().getLeftSubTree().getRightSubTree().getLeftSubTree().getValue());
        Assertions.assertEquals(9, binaryTree.getRoot().getLeftSubTree().getRightSubTree().getRightSubTree().getValue());
        Assertions.assertNull(binaryTree.getRoot().getLeftSubTree().getLeftSubTree().getRightSubTree().getLeftSubTree());
    }
}
