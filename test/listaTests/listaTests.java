package listaTests;

import static org.junit.Assert.*;
import listas.ListaCircular;

import org.junit.Test;

/**
* Lista Circular
* @author https://github.com/derrickcodes/SLinkedCircularList
*/

public class listaTests {

	@Test
	public void testListaCircular() {
		ListaCircular<String> list = new ListaCircular<String>();
		assertEquals(null, list.getEntry(1));
		assertEquals(0, list.getLength());
	}

	@Test 
	public void testAddObject() {
		boolean ans;	// defaults to false
		ListaCircular<String> list = new ListaCircular<String>();
		list.add("apple");
		list.add("pear");
		ans = list.add("melon");
		assertEquals("apple", list.getEntry(1));
		assertEquals("pear", list.getEntry(2));
		assertEquals("melon", list.getEntry(3));
		assertTrue(ans);
	}

	@Test
	public void testAddIntObject() {
		boolean ans;	// defaults to false
		ListaCircular<String> list = new ListaCircular<String>();
		list.add("apple");
		list.add("pear");
		list.add("melon"); 
		ans = list.add(3, "orange");	// input specific value at specific location
		assertEquals("apple", list.getEntry(1));
		assertEquals("pear", list.getEntry(2));
		assertEquals("orange", list.getEntry(3));
		assertEquals("melon", list.getEntry(4));
		assertTrue(ans);
	}

	@Test
	public void testRemove() {
		ListaCircular<String> list = new ListaCircular<String>();
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("strawberry");
		list.add("blueberry");
		list.remove(4);
		// test that strawberry was removed and blueberry became entry #4
		assertEquals("blueberry", list.getEntry(4));
	}

	@Test
	public void testClear() {
		ListaCircular<String> list = new ListaCircular<String>();
		assertEquals(0, list.getLength());
		assertEquals(null, list.getEntry(1));
	}

	@Test
	public void testReplace() {
		ListaCircular<String> list = new ListaCircular<String>();
		// fill with values
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("strawberry");
		// replace 3rd value (banana) with melon then verify
		list.replace(3, "melon");
		assertEquals("apple", list.getEntry(1));
		assertEquals("pear", list.getEntry(2));
		assertEquals("melon", list.getEntry(3));
		assertEquals("strawberry", list.getEntry(4));
	}

	@Test
	public void testGetEntry() {
		ListaCircular<String> list = new ListaCircular<String>();
		// fill with values
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("strawberry");
		assertEquals("apple", list.getEntry(1));
		assertEquals("pear", list.getEntry(2));
		assertEquals("banana", list.getEntry(3));
		assertEquals("strawberry", list.getEntry(4));
	}

	@Test
	public void testContains() {
		ListaCircular<String> list = new ListaCircular<String>();
		// fill with values
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("strawberry");
		assertEquals(true, list.contains("pear"));
	}

	@Test
	public void testGetLength() {
		ListaCircular<String> list = new ListaCircular<String>();
		// fill with values
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("strawberry");
		assertEquals(4, list.getLength());
		list.add("melon");
		assertEquals(5, list.getLength());
	}

	@Test
	public void testIsEmpty() {
		ListaCircular<String> list = new ListaCircular<String>();
		assertEquals(0, list.getLength());
	}

	@Test
	public void testIsFull() {
		ListaCircular<String> list = new ListaCircular<String>();
		boolean ans = false;
		assertEquals(ans, list.isFull());;
	}

}
