import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTiltTest {

    @Test
    public void testTiltInitialTree() throws URISyntaxException, IOException {
        var binaryTree = new BinaryTree(Paths.get(ClassLoader.getSystemResource("nodes.txt").toURI()));
        var treeTilt = new BinaryTreeTilt();
        int tilt = treeTilt.calculateTilt(0, binaryTree.getRoot());
        Assertions.assertEquals(3, tilt);
    }

    @Test
    public void testTiltNodes2Tree() throws URISyntaxException, IOException {
        var binaryTree = new BinaryTree(Paths.get(ClassLoader.getSystemResource("nodes2.txt").toURI()));
        var treeTilt = new BinaryTreeTilt();
        int tilt = treeTilt.calculateTilt(0, binaryTree.getRoot());
        Assertions.assertEquals(5, tilt);
    }

    @Test
    public void testTiltNodes3Tree() throws URISyntaxException, IOException {
        var binaryTree = new BinaryTree(Paths.get(ClassLoader.getSystemResource("nodes3.txt").toURI()));
        var treeTilt = new BinaryTreeTilt();
        int tilt = treeTilt.calculateTilt(0, binaryTree.getRoot());
        Assertions.assertEquals(8, tilt);
    }
}
