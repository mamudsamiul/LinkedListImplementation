/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.capgemini.linkedlisttest;

import org.junit.Test;

import com.capgemini.linkedlist.LinkedList;
import com.capgemini.linkedlist.Node;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class TestCase {
	@Test
	public void addingThreeNumberShouldPass() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.addNode(firstNode);
		linkedList.append(thirdNode);
		linkedList.insertAtMiddle(secondNode);
		linkedList.print();
		boolean result = linkedList.getHead().equals(firstNode) && linkedList.getHead().getNext().equals(secondNode)
				&& linkedList.getTail().equals(thirdNode);
		Assert.assertTrue(result);
	}
}
