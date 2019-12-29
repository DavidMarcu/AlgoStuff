import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree(Path nodeInfo) throws IOException {
        List<String> nodesAsStrings = Files.readAllLines(nodeInfo);

        nodesAsStrings.forEach(node -> {
            String[] nodeInfoValues = node.split(", ");
            insertNode(root, Integer.parseInt(nodeInfoValues[1]), Integer.parseInt(nodeInfoValues[0]), nodeInfoValues[2]);
        });
    }

    private void insertNode(TreeNode parent, int parentValue, int value, String side){
        if(parentValue == -1){
            root = new TreeNode(value);
        }
        else{
            if(parent.getValue() != parentValue){
                if(parent.getLeftSubTree() != null){
                    insertNode(parent.getLeftSubTree(), parentValue, value, side);
                }
                if(parent.getRightSubTree() != null){
                    insertNode(parent.getRightSubTree(), parentValue, value, side);
                }
            }
            else{
                if("left".equals(side)) {
                    parent.setLeftSubTree(new TreeNode(value));
                } else if ("right".equals(side)) {
                    parent.setRightSubTree(new TreeNode(value));
                }
            }
        }
    }

    public TreeNode getRoot() {
        return root;
    }
}
