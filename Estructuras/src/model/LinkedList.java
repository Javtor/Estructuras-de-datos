package model;

public class LinkedList<T> implements ILinkedList<T> {

	private int size;
	private Node<T> first;

	public LinkedList() {
		first = null;
		size = 0;
	}

	@Override
	public T first() {
		return first == null ? null : first.getValue();
	}

	@Override
	public T last() {
		return first == null ? null : first.last().getValue();
	}

	@Override
	public void insertFirst(T t) {
		Node<T> n = new Node<>(t);
		n.setNext(first);
		first = n;
		size++;
	}

	@Override
	public void insertLast(T t) {
		Node<T> n = new Node<>(t);
		if (first == null)
			first = n;
		else
			first.insertLast(new Node<T>(t));
		size++;
	}

	@Override
	public void insertBefore(T t, int index) throws LinkedListException {
		if (index == 0)
			insertFirst(t);
		else if (index > 0 && index < size) {
			first.insertBefore(new Node<T>(t), index, 0);
			size++;
		} else
			throw new LinkedListException("Index out of bounds");
	}

	@Override
	public void insertAfter(T t, int index) throws LinkedListException {
		if (index >= 0 && index < size) {
			first.insertAfter(new Node<T>(t), index, 0);
			size++;
		} else
			throw new LinkedListException("Index out of bounds");
	}

	@Override
	public int search(T t) {
		return first == null || t == null ? -1 : first.search(t, 0);
	}

	@Override
	public void deleteFirst() {
		if (first != null) {
			first = first.getNext();
		}

	}

	@Override
	public void deleteLast() {
		if (first != null) {
			first = first.deleteLast();
		}
	}

	@Override
	public void delete(T t) {
		if (first != null && t != null) {
			first = first.delete(t);
		}
	}

	@Override
	public void delete(int index) throws LinkedListException {
		T t = get(index);
		delete(t);
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T get(int index) throws LinkedListException {
		if (index >= 0 && index < size) {
			return first.get(index, 0);
		} else
			throw new LinkedListException("Index out of bounds");
	}

}
