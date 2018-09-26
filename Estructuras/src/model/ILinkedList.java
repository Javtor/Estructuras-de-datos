package model;

public interface ILinkedList <T> {
	
	public T first();
	
	public T last();
	
	public void insertFirst(T t);
	
	public void insertLast(T t);
	
	public void insertBefore(T t, int index) throws LinkedListException;
	
	public void insertAfter(T t, int index) throws LinkedListException;
	
	public int search(T t);
	
	public void deleteFirst();
	
	public void deleteLast();
	
	public void delete(T t);
	
	public void delete(int index) throws LinkedListException;
	
	public int size();
	
	public boolean isEmpty();

}
