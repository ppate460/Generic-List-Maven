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


import org.w3c.dom.Node;

import java.util.Iterator;

public class GenericQueue<T> extends GLProject {
    private Node<T> head;
    private Node<T> tail;
    private Node<T> next;
    private int length;

    public GenericQueue() {
        super();
    } // end of GenericQueue()


    public boolean isEmpty() {
        if (length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    private static class Node<T> {
        private T data;
        private int code;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = next;
        }
    } // end of private static Node<>


    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    } // end of public add()


    public void add(T data, int code) {
        add(data);
        tail.code = code;
    } // end of public add()


    public T delete() {
        if (head == null) {
            return null;
        }
        T deleteData = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        length--;
        return deleteData;
    } // end of public delete()


    public void enqueue(T data) {
         add(data);
    } // end of public enqueue()


    public T dequeue() {
         return delete();
    } // end of dequeue()


} 
