/*
 * BST to hold and organize node objects via linked list.
 * @author Originally made in class by Jugan
 * @author Loi Phung
 */
public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		root = null;

	}

	/**
	 * searches the BST if a word is contained in this tree
	 * @param String key, word you're looking for
	 * @return Node(String, Node), recursive call or null if tree is empty
	 */
	public Node search(String key) {

		// Check to see if the tree is empty
		if (root == null) {
			System.out.println("The tree is empty");
			return null;
		} else {
			// Start recursive search, setting the root as the inital subroot
			return search(key, root);
		}
	}

	/**
	 * recursive call from Node(String)
	 * continues to search left and right subtrees
	 * @param String key
	 * @param Node subroot, root
	 * @return Node
	 */
	private Node search(String key, Node subroot) {

		// Compare key to the subroot to see if we have a match
		if (key == subroot.getWord()) {
			System.out.println(subroot);
			return subroot;
		} else if (key.compareTo(subroot.getWord()) < 0) {

			// If key exists, it will be down the left side of subroot
			// Check to see if subroot has a left child
			if (subroot.getLeftChild() == null) {
				// No left child. Key does not exist in the tree
				return null;
			} else {
				// There is a left child
				// Recursively call search, setting the left child as the new
				// subroot
				return search(key, subroot.getLeftChild());
			}
		} else {

			// If key exists, it will be down the right side of subroot
			// Check to see if subroot has a right child
			if (subroot.getRightChild() == null) {
				// No right child. Key does not exist in the tree
				return null;
			} else {
				// There is a right child
				// Recursively call search, setting the right child as the new
				// subroot
				return search(key, subroot.getRightChild());
			}
		}
	}

	/**
	 * inserts a node in the BST if word doesn't already exist
	 * @param String t
	 */
	public void insert(String t) {

		// Check to see if the tree is empty
		if (root == null) {
			root = new Node(t);
		} else if (search(t) != null) { // if word already exist, don't node,
										// just frequency.

			search(t).addFreq();

		} else {
			// We know there's at least one object in the tree.
			insert(new Node(t), root);
		}
	}

	/**
	 * recursive call from insert(string)
	 * @param Node t, new node
	 * @param Node subroot, root
	 */
	private void insert(Node t, Node subroot) {

		if (t.compareTo(subroot.getWord()) <= 0) { // Look down the left side of
													// the tree

			if (subroot.getLeftChild() == null) { // Is the left child spot open
				subroot.setLeftChild(t); // Put t at the left child position
			} else { // There is a left child already

				// Recursively call insert, setting the left child as the new
				// subroot
				insert(t, subroot.getLeftChild());
			}
		} else { // Look down the right side of the tree

			if (subroot.getRightChild() == null) { // Is the right child spot
													// open
				subroot.setRightChild(t); // Put t at the right child position
			} else { // There is a right child already

				// Recursively call insert, setting the right child as the new
				// subroot
				insert(t, subroot.getRightChild());
			}
		}
	}

	/**
	 * prints in preOrder
	 */
	public void printPreOrder() {

		System.out.println("\nPrinting in pre order \n-------------------");
		root.preOrder(root);

	}
	/**
	 * prints in order
	 */
	public void printInOrder() {
		System.out.println("\nPrinting in order\n-------------------");
		root.inOrder(root);

	}

	/**
	 * prints in post order
	 */
	public void printPostOrder() {
		System.out.println("\nPrinting in post order\n-------------------");
		root.postOrder(root);
	}

}
