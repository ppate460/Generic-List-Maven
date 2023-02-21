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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Iterator;

public class GQTest {

    @Test
    public void testEnqueueDequeueString() {
        GenericQueue<String> myQueue = new GenericQueue<String>();
        myQueue.enqueue("one");
        myQueue.enqueue("two");
        myQueue.enqueue("three");
        myQueue.enqueue("four");
        assertEquals("one", myQueue.dequeue());
        assertEquals("two", myQueue.dequeue());
        assertEquals("three", myQueue.dequeue());
        assertEquals("four", myQueue.dequeue());
        assertTrue(myQueue.isEmpty());
    } // end of testEnqueueDequeueString()

    @Test
    public void testEnqueueDequeueBoolean() {
        GenericQueue<Boolean> myQueue = new GenericQueue<Boolean>();
        myQueue.enqueue(true);
        myQueue.enqueue(false);
        assertEquals(true, myQueue.dequeue());
        assertEquals(false, myQueue.dequeue());
    } // end of testEnqueueDequeueBoolean()


    @Test
    public void testEnqueueDequeueInteger() {
        GenericQueue<Integer> myQueue = new GenericQueue<Integer>();
        assertTrue(myQueue.isEmpty());
        myQueue.enqueue(65);
        assertFalse(myQueue.isEmpty());
        myQueue.dequeue();
        assertTrue(myQueue.isEmpty());
    } // end of testEnqueueDequeueInteger()

    @Test
    public void testCharacter() {
        GenericQueue<Character> myQueue = new GenericQueue<Character>();
        myQueue.enqueue('U');
        myQueue.enqueue('I');
        myQueue.enqueue('c');
        assertEquals('U', myQueue.dequeue());
        assertEquals('I', myQueue.dequeue());
        assertEquals('c', myQueue.dequeue());
        assertTrue(myQueue.isEmpty());
    } // end of testCharacter()


    @Test
    public void testIterator() {
        GenericQueue<Integer> myQueue = new GenericQueue<Integer>();
        myQueue.add(99);
        myQueue.add(98);
        myQueue.add(97);
        Iterator<Integer> iterator = myQueue.iterator();
//        assertTrue(iterator.hasNext());
//        assertEquals(99, iterator.next().intValue());
    }


    @Test
    public void testDouble() {
        GenericQueue<Double> myQueue = new GenericQueue<Double>();
        myQueue.enqueue(23.2346);
        myQueue.enqueue(23523.23525);
        myQueue.enqueue(98765.1234);
        assertEquals(23.2346, myQueue.dequeue());
        assertEquals(23523.23525, myQueue.dequeue());
        assertEquals(98765.1234, myQueue.dequeue());
        assertTrue(myQueue.isEmpty());
    }


} // end of public GQTest{}

