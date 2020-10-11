package com.capgemini.linkedlist;

public class Node<K> {
	private K key;
	private Node next;

	public Node(K key) {
		this.key = key;
		this.next = null;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public K getKey() {
		return key;
	}
}
