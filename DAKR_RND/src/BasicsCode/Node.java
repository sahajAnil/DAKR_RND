//program to perform in-order traversal of a Tree data structure 

package BasicsCode;

public class Node {

	
		  int item;
		  Node left, right;

		  public Node(int key) {
		  item = key;
		  left = right = null;
		  }
		}

		class Tree {
		  
		  Node root;

		  Tree() {
		  root = null;
		  }

		  void inOrder(Node node) {
		    if (node == null)
		      return;

		   //left child
		    inOrder(node.left);

		    // traverse root node
		    System.out.print(node.item + "->");

		    // traverse  right child
		    inOrder(node.right);
		  }

		  
		  public static void main(String[] args) {

			    // object of Tree
			    Tree tree = new Tree();

			    // nodes of tree
			    tree.root = new Node(5);
			    tree.root.left = new Node(50);
			    tree.root.right = new Node(51);

			    // child nodes of left child
			    tree.root.left.left = new Node(2);
			    tree.root.left.right = new Node(4);

			    System.out.println("In Order traversal");
			    tree.inOrder(tree.root);
			  }

}
