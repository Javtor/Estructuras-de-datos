package model;

public class NodeBinaryTree<T> {

	private T value;
	private Node<T> parent;
	private Node<T> left;
	private Node<T> right;
	
	public 	NodeBinaryTree(T value) {
		this.value = value;
		left=null;
		right=null;
	}
	
	public T getValue() {
		return value;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public boolean isLeaf() {
		return (left==null && right==null);
	}
	
}
