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

    //inorder traversal = will return the values in ascending order
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value+ " ");
        inOrder(root.right);
    }

    public static boolean search (Node root, int key){

        if (root == null){
            return false;

        }

        if(root.value>key){ //go into left subtree
            return search(root.left,key);
        } else if (root.value == key) {
            return true;
        }
        else {
            return search(root.right,key);
        }
    }




    public static void main(String[] args) {

        System.out.println("---Binary Search Tree---");

        int values[] = {56,30,70,22,40,60,95,11,3,16,65,63,67};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root,values[i]);
        }

        inOrder(root);
        System.out.println();

        if (search(root, 63)){
            System.out.println("Item Found in the BST");
        }
        else {
            System.out.println("Item Not Found in the BST");
        }
    }
}