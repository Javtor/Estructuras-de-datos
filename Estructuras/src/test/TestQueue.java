package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.Queue;
import model.QueueException;

class TestQueue {

	private Queue<Integer> queue;
	
	TestQueue(){
		queue = new Queue<Integer>();
	}
	
	void setUpStage1() {
		queue = new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
	}
	
	@Test
	void testEnqueue() {
		assertTrue(queue.size()==0);
		queue.enqueue(1);
		assertTrue(queue.size()==1);
		
		setUpStage1();
		assertTrue(queue.size()==5);
		queue.enqueue(3);
		try {
			assertTrue(queue.front()==1);
		} catch (QueueException e) {
			fail("It must not fail");
		}
	}
	
	@Test
	void testDequeue() {
		try {
			queue.dequeue();
			fail("It must fail");
		} catch (QueueException e) {
			assert(true);
		}
		
		setUpStage1();
		for (int i = 0; i>queue.size(); i++) {
			try {
				assertTrue(queue.dequeue()==i+1);
			} catch (QueueException e) {
				fail("It must not fail");
			}
		}
	}
}