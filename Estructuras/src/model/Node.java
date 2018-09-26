package model;

public class Node<T> {

	private T value;
	private Node<T> next;

	public Node(T value) {
		this.value = value;
		next = null;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public void insert(Node<T> node) {
		if (next == null)
			next = node;
		else
			next.insert(node);
	}

	public Node<T> last() {
		if (next == null)
			return this;
		else
			return next.last();
	}

	public void insertLast(Node<T> t) {
		if (next == null)
			next = t;
		else
			next.insertLast(t);
	}

	public void insertBefore(Node<T> t, int index, int currentIndex) {
		if (index == currentIndex + 1) {
			t.next = this.next;
			this.next = t;
		} else {
			next.insertBefore(t, index, currentIndex + 1);
		}

	}

	public void insertAfter(Node<T> t, int index, int currentIndex) {
		if (index == currentIndex) {
			t.next = this.next;
			this.next = t;
		} else {
			next.insertAfter(t, index, currentIndex + 1);
		}
	}

	public int search(T t, int currentIndex) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteLast() {
		// TODO Auto-generated method stub

	}

	public void delete(T t) {
		// TODO Auto-generated method stub

	}

}
