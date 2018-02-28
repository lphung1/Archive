/*
 * Node object that accepts and holds a string and frequency of that word in a BST
 * 
 * @author Originally made in class by Jugan, Finalized by Loi Phung
 * @version 11/28/16
 */
public class Node {

	private String words;

	private Node leftChild, rightChild;
	private int frequency;

	/**
	 * Default constructor
	 * 
	 * @param String w, word being held
	 */
	public Node(String w) {
		words = w;
		frequency = 1;
		leftChild = rightChild = null;
	}
	/**
	 * returns held word
	 * @return String words, word contained in this node
	 */
	public String getWord() {
		return words;
	}

	/**
	 * sets the left child for this node
	 * @param Node t
	 */
	public void setLeftChild(Node t) {
		leftChild = t;
	}

	/**
	 * sets right child for this node
	 * @pram Node t
	 */
	public void setRightChild(Node t) {
		rightChild = t;
	}

	/**
	 * returns the left child for this node
	 * @return Node leftChild
	 */
	public Node getLeftChild() {
		return leftChild;
	}

	/**
	 * returns right child for this node
	 * @return Node rightChild
	 */
	public Node getRightChild() {
		return rightChild;
	}

	/**
	 * returns -1 if before, 1 if after, 0 if the same alphabetically
	 * @param String t, string being compared to
	 * @return int
	 */
	public int compareTo(String t) {

		return words.compareTo(t);

	}
	
	/**
	 * returns contained word when node is called
	 * @return words
	 */
	public String toString() {
		return words;
	}

	/**
	 * increases the frequency of how many times this word appeared
	 */
	public void addFreq() {
		frequency++;
	}

	/**
	 * returns the frequency
	 * @return int frequency
	 */
	public int getFreq() {
		return frequency;
	}

	/**
	 * prints the BST in pre order. Root, leftChild, rightChild
	 * @param Node t, for recursive call
	 */
	public void preOrder(Node t) {

		if (t != null) {
			System.out.println(t + " " + t.getFreq());
			preOrder(t.getLeftChild());
			preOrder(t.getRightChild());
		}
	}

	/**
	 * prints the BST in order leftChild, root, rightChild
	 * @param Node t, for recrsive call
	 */
	public void inOrder(Node t) {
		if (t != null) {
			inOrder(t.getLeftChild());
			System.out.println(t + " " + t.getFreq());
			inOrder(t.getRightChild());
		}
	}
	
	/**
	 * prints the BST in post order leftChild, rightChild, root
	 * @param Node t, for recursive call
	 */
	public void postOrder(Node t) {

		if (t != null) {
			postOrder(t.getLeftChild());
			postOrder(t.getRightChild());
			System.out.println(t + " " + t.getFreq());
		}
	}

}
