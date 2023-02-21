/*
	Author Name: Pratik Patel
	NetID, UIN: ppate460, 669224629
	Institution: University of Illinois at Chicago
	Description: Implemented my own version of HashMap and Queue data structures.
				 The project does not include any pre-existing library or classes;
				 such as, Java HashMap or LinkedList.
				 Also implemented the Iterator design pattern; allowing users access to multiple
				 custom Iterators for the data structures.
 */

//import org.w3c.dom.Node;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Iterator;


public abstract class GLProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to project 1");
	} // end of public static void main()

	public abstract Iterator iterator();


//	public abstract Iterator iterator();

	public abstract static class GenericList<T> implements Iterable<T> {
		private Node head;
		private int length;

		private T data;
		private Node next;

		public void print() {
			if (head == null) {
				System.out.print("Empty List");
			}
		} // end of public print()

		public void add(T data) {
			Node<T> newNode = new Node<T>(data);
			if (head == null) {
				head = newNode;
			}
		} // end of public add()

		public T delete() {
			if (head == null) {
				return null;
			}
			return null;
		} // end of public delete()

		private static class Node<T> {
			private T data;
			private Node<T> next;

			// initialize data in the list and make next null
			public Node(T data) {
				this.data = data;
				this.next = null;
			}
		} // end of private static Node<>

		public ArrayList<T> dumpList() {
			ArrayList<T> list = new ArrayList<>();
			Node<T> currentNode = head;
			// after creating new ArrayList, fill it up with data
			while (currentNode != null) {
				list.add(currentNode.data);
				currentNode = currentNode.next;
			}
			return list;
		} // end of public dumpList()

		public T get(int index) {
			if (index < 0 || index >= length) {
				return null;
			}
			Node<T> currentNode = head;
			for (int i = 0; i < index; i++) {
				currentNode = currentNode.next;
			}
			return currentNode.data;
		} // end of public get()

		public T set(int index, T element) {
			if (index < 0 || index >= length) {
				return null;
			}

			Node currentNode = head;
			for (int i = 0; i < index; i++) {
				currentNode = currentNode.next;
			}
			T oldData = (T) currentNode.data;
			currentNode.data = element;
			return oldData;
		} // end of public set()

		public Iterator<T> descendingIterator() {

			return new Iterator<T>() {
				private GenericList.Node<T> current = LastNode();

				@Override
				public boolean hasNext() {
					return current != null;
				}

				public T next() {
					return data;
				}

				private GenericList.Node<T> LastNode() {
					return null;
				}

			};
		} // end of public descendingIterator()

	} // end of public abstract static GenericList()


} // end of public class GLProject()

