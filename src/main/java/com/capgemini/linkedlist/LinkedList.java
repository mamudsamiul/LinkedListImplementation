package com.capgemini.linkedlist;

public class LinkedList<K> implements LinkedListInterface {
	private Node<K> head;
	private Node<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public Node<K> getHead() {
		return this.head;
	}

	public Node<K> getTail() {
		return this.tail;
	}

	@Override
	public void addNode(Node node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			Node tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}
	}

	@Override
	public void print() {
		System.out.println("Printing the linked list");
		Node temp = this.head;
		while (temp.getNext() != null) {
			System.out.print(temp.getKey());
			System.out.print(" -> ");
			temp = temp.getNext();
		}
		System.out.println(temp.getKey());
	}

	@Override
	public void append(Node node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			this.tail.setNext(node);
			this.tail = node;
		}

	}
}
