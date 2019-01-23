/**
 * Copyright 2018 Shehan Perera
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.github.datastructures;

/**
 *
 * This is a simple implementation of the Linked list data structure.
 * Here you can find basic functions of the linked list and the simple Node class created for the Linked list
 * @author Vikum Dheemantha
 * @version 1.0
 * @since 2018/07/12
 */
public class LinkedList<T> {

	/**
	 * Implimentation of the Node class for the Linked List. Here its only have numerical data called key.
	 */
	public class Node {
		private T key;
		public Node next;

		/**
		 * Constructor without any parameters.
		 * Key is going to be 0 and next node going to be null.
		 */
		public Node() {
			this.key = null;
			this.next = null;
		}

		/**
		 * Constructor with ony value parameter
		 * @param value (For key)
		 */
		public Node(T value) {
			this.key = value;
			this.next = null;
		}

		/**
		 * Constructor with all necessary parameters
		 * @param value (For key)
		 * @param nxt (For next)
		 */
		public Node(T value, Node nxt) {
			this.key = value;
			this.next = nxt;
		}

		/**
		 * Function to return the key value of the particular Node.
		 * @return the key of the Node
		 */
		public T getKey() {
			return key;
		}

		/**
		 * Function to set the key of the Node.
		 * @param key
		 */
		public void setKey(T key) {
			this.key = key;
		}
	}

	private Node start;
	private Node end;

	/**
	 * Constructor of the LinkedList class
	 */
	public LinkedList() {
		this.start = null;
		this.end = null;
	}

	/**
	 * method to get know whether the list is empty or not.
	 * @return True, if list is empty, else false.
	 */
	public boolean isEmpty() {
		return start == null;
	}

	/**
	 * return the length of the linkedList.
	 * @return length
	 */
	public int length() {
		if(this.start == null) {
			return 0;
		} else {
			int len = 1;
			Node c = this.start;
			while(c.next != null) {
				c = c.next;
				len++;
			}
			return len;

		}
	}

	/**
	 * add Node to start.
	 * @param value to set start Node's key.
	 */
	public void addStart(T value) {
		Node temp = new Node(value);
		if(this.start == null) {
			this.start = temp;
		} else {
			temp.next = start;
			start = temp;
		}
	}

	/**
	 * Add node to end of the linkedList.
	 * @param value to set last Node's Value
	 */
	public void addLast(T value) {
		Node temp = new Node(value);
		if(this.start == null) {
			this.start = temp;
		} else {
			Node last = this.start;

			while (last.next != null) {
				last = last.next;
			}
			last.next = temp;
		}
	}


	/**
	 * Add new Node after the given Node.
	 * @param pos position of the Node that you want to put your new Node after.
	 * @param value Value of the new node
	 */
	public void insertAfter(int pos, T value) {
		Node now = this.start;
		int c=0;
		Node temp = new Node(value);
		if(now == null) {
			now = temp;
		} else {
			while(c<pos && now.next != null) {
				now = now.next;
				c++;
			}
			temp.next = now.next;
			now.next = temp;
		}
	}

	/**
	 * insert new node to particular location of the list
	 * @param pos position of new node
	 * @param value key of the new Node,s key
	 */
	public void insertAt(int pos, T value) {
		Node now = this.start;
		int c=1;
		Node temp = new Node(value);
		if(now == null) {
			now = temp;
		} else {
			while(c<pos && now.next != null) {
				now = now.next;
				c++;
			}
			temp.next = now.next;
			now.next = temp;
		}
	}

	/**
	 * Delete the particular Node
	 * @param pos position of the Node that you want to delete
	 */
	public void delete(int pos) {
		if(pos == 0) {
			start = start.next;
		} else {
			Node now = start;
			Node prev = null;
			int c = 0;
			while(c<pos && now.next != null) {
				prev = now;
				now = now.next;
				c++;
			}
			if(c != pos) {
				System.out.println("There is no node in the perticuler position");
			} else {
				prev.next = now.next;
			}
		}
	}

}
