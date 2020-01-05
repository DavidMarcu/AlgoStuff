import java.util.List;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree(){
    }

    public BinarySearchTree(TreeNode root){
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void addNode(TreeNode treeNode){
        if(root == null){
            root = treeNode;
        }
        else{
            addNode(treeNode, root);
        }
    }

    private void addNode(TreeNode treeNode, TreeNode queryNode){
        if(treeNode == null || queryNode == null){
            throw new IllegalArgumentException();
        }
        if(treeNode.getValue() <= queryNode.getValue()){
            if(queryNode.getLeftSubTree() == null){
                queryNode.setLeftSubTree(treeNode);
            }
            else {
                addNode(treeNode, queryNode.getLeftSubTree());
            }
        }
        else{
            if(queryNode.getRightSubTree() == null){
                queryNode.setRightSubTree(treeNode);
            }
            else{
                addNode(treeNode, queryNode.getRightSubTree());
            }
        }
    }

    public List<Integer> inOrderTraversal(TreeNode treeNode, List<Integer> inOrderList){
        if(treeNode.getLeftSubTree() != null){
            inOrderTraversal(treeNode.getLeftSubTree(), inOrderList);
        }
        inOrderList.add(treeNode.getValue());
        if(treeNode.getRightSubTree() != null){
            inOrderTraversal(treeNode.getRightSubTree(), inOrderList);
        }
        return inOrderList;
    }

    public List<Integer> preOrderTraversal(TreeNode treeNode, List<Integer> preOrderList){
        preOrderList.add(treeNode.getValue());
        if(treeNode.getLeftSubTree() != null){
            preOrderTraversal(treeNode.getLeftSubTree(), preOrderList);
        }
        if(treeNode.getRightSubTree() != null){
            preOrderTraversal(treeNode.getRightSubTree(), preOrderList);
        }
        return preOrderList;
    }

    public List<Integer> postOrderTraversal(TreeNode treeNode, List<Integer> postOrderList){
        if(treeNode.getLeftSubTree() != null){
            postOrderTraversal(treeNode.getLeftSubTree(), postOrderList);
        }
        if(treeNode.getRightSubTree() != null){
            postOrderTraversal(treeNode.getRightSubTree(), postOrderList);
        }
        postOrderList.add(treeNode.getValue());
        return postOrderList;
    }


}
