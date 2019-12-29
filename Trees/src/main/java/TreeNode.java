public class TreeNode {
    private int value;
    private TreeNode leftSubTree;
    private TreeNode rightSubTree;

    public int getValue() {
        return value;
    }

    public TreeNode getLeftSubTree() {
        return leftSubTree;
    }

    public TreeNode getRightSubTree() {
        return rightSubTree;
    }

    public void setLeftSubTree(TreeNode leftSubTree) {
        this.leftSubTree = leftSubTree;
    }

    public void setRightSubTree(TreeNode rightSubTree) {
        this.rightSubTree = rightSubTree;
    }

    public TreeNode(int value){
        this.value = value;
    }
}
