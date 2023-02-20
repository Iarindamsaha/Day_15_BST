public class BST {
    static class Node{
        int value; //tree Data
        Node left; //left subtree
        Node right; //right subtree

        Node (int value){
            this.value = value;
        }

    }

    //insert function to insert value in tree
    public static Node insert(Node root, int val){

        if ( root == null){
            root = new Node(val);
            return root;
        }

        if(root.value > val){

            //store in left subtree
            root.left = insert(root.left,val);

        }
            //store in right subtree
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    //inorder traversal
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value+ " ");
        inOrder(root.right);
    }


    public static void main(String[] args) {

        System.out.println("---Binary Search Tree---");
        int values[] = {56,30,70};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root,values[i]);
        }

        inOrder(root);
        System.out.println();
    }
}