public class BinaryTreeTilt {
    
    public int calculateTilt(int accumulator, TreeNode treeNode){
        TreeNode leftSubTree = treeNode.getLeftSubTree();
        TreeNode rightSubTree = treeNode.getRightSubTree();
        if(leftSubTree != null && rightSubTree != null){
            accumulator += Math.abs(leftSubTree.getValue() - rightSubTree.getValue());
            accumulator = calculateTilt(accumulator, treeNode.getLeftSubTree());
            accumulator = calculateTilt(accumulator, treeNode.getRightSubTree());
        }
        else if(leftSubTree != null){
            accumulator += Math.abs(leftSubTree.getValue());
            accumulator = calculateTilt(accumulator, treeNode.getLeftSubTree());
        }
        else if(rightSubTree != null){
            accumulator += Math.abs(rightSubTree.getValue());
            accumulator = calculateTilt(accumulator, treeNode.getRightSubTree());
        }
        return accumulator;
    }
}
