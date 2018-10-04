package model;

public interface IBinaryTree<T> {

	public void addNode(T node);
	
	public Node<T> deleteNode(T node);
	
	public Node<T> searchNode(T node);
	
}
