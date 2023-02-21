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


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;


public class MyHashMap<T> extends GLProject {

    private ArrayList<GenericQueue<T>> myMap;
    private int size;

    public MyHashMap() {
        super();
    } // end of MyHashMap()

    public MyHashMap(String key, T value) {
        myMap = new ArrayList<GenericQueue<T>>(10);
        size = 0;
        put(key, value);
    } // end of public MyHashMap() constructor...


    public void put(String key, T value) {
        int hashMapValue = key.hashCode();
        int indexNum = hashMapValue & (myMap.size() -1 );

        Node<T> node = findNode(indexNum, key);
        if (node != null) {
            ((Node<T>) node).data = value;
            return;
        }

        myMap.get(indexNum).enqueue((T) new Node<T>(key, value));
        size++;
    } // end of public put()


    public T get(String key) {
        int hashMapValue = key.hashCode();
        int indexNum = hashMapValue & (myMap.size() -1 );

        Node<T> node = findNode(indexNum, key);
        if (node != null) {
            return node.data;
        }
        return null;
    } // end of public get()


    public Node<T> findNode(int indexNum, String key) {
        GenericQueue<T> newMap = myMap.get(indexNum);

//        for (Node<T> node : newMap) {
//            if (node.key != null && node.key.equals((key))) {
//                return node;
//            }
//        }
        return null;
    } // end of public findNode()


    @Override
    public Iterator<T> iterator() {
        ArrayList<T> myList = new ArrayList<T>();

        for (GenericQueue<T> item : myMap) {
                if (item != null) {
                    myList.add(item.delete());
                }
            }
        return null;
    } // end of public iterator()


    private static class Node<T> {
        String key;
        T data;

        public Node(String key, T data) {
            this.key = key;
            this.data = data;
        }
    } // end of static class Node<T>{}


} // end of public class MyHashMap()
