package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.StackException;
import model.Stack;

class TestStack {

	private Stack<String> stack;

	TestStack() {
		stack = new Stack();
	}

	void setUpStage1() {
		String w = new String("M16");
		stack.push(w);
	}

	void setUpStage2() {
		setUpStage1();
		String w = new String("SMG");
		stack.push(w);
	}

	@Test
	void testPush1() {
		setUpStage1();
		try {
			String w = stack.top();
			assertTrue(w.equals("M16"));
			assertTrue(stack.size() == 1);
		} catch (StackException e) {
			fail("");
		}
	}

	@Test
	void testPush2() {
		setUpStage2();
		try {
			String w = stack.top();
			assertTrue(w.equals("SMG"));
			assertTrue(stack.size() == 2);
		} catch (StackException e) {
			fail("");
		}
	}

	@Test
	void testPop1() {
		try {
			stack = new Stack();
			stack.pop();
			fail("It must fail");
		} catch (StackException e) {
			assert (true);
		}
	}

	@Test
	void testPop2() {
		setUpStage1();
		try {
			stack.pop();
			assertTrue(stack.isEmpty());
		} catch (StackException e) {
			fail("It must not fail");
		}
	}

	@Test
	void testPop3() {
		setUpStage2();
		try {
			stack.pop();
			String w = stack.top();
			assertTrue(w.equals("M16"));
			assertTrue(stack.size() == 1);
		} catch (StackException e) {
			fail("It must not fail");
		}
	}

	

}
