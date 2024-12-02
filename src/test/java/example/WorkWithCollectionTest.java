package example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorkWithCollectionTest {

    @Test
    public void testAddArrayList() {
        List<String> list = new ArrayList<>();
        long timeTaken = WorkWithCollection.add(list);
        assertTrue(timeTaken > 0, "Время выполнения для add (ArrayList) должно быть больше 0");
    }

    @Test
    public void testAddLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        long timeTaken = WorkWithCollection.add(list);
        assertTrue(timeTaken > 0, "Время выполнения для add (LinkedList) должно быть больше 0");
    }

    @Test
    public void testAddFirstArrayList() {
        List<String> list = new ArrayList<>();
        long timeTaken = WorkWithCollection.add(list);
        assertTrue(timeTaken > 0, "Время выполнения для addFirst (ArrayList) должно быть больше 0");
    }

    @Test
    public void testAddFirstLinkedList() {
        List<String> list = new LinkedList<>();
        long timeTaken = WorkWithCollection.addFirst(list);
        assertTrue(timeTaken > 0, "Время выполнения для addFirst (LinkedList) должно быть больше 0");
    }

    @Test
    public void testAddMiddleArrayList() {
        List<String> list = new ArrayList<>();
        long timeTaken = WorkWithCollection.addMiddle(list);
        assertTrue(timeTaken > 0, "Время выполнения для addMiddle (ArrayList) должно быть больше 0");
    }

    @Test
    public void testAddMiddleLinkedList() {
        List<String> list = new LinkedList<>();
        long timeTaken = WorkWithCollection.addMiddle(list);
        assertTrue(timeTaken > 0, "Время выполнения для addMiddle (LinkedList) должно быть больше 0");
    }

    @Test
    public void testGetArrayList() {
        List<String> list = new ArrayList<>();
        WorkWithCollection.add(list);
        long timeTaken = WorkWithCollection.get(list);
        assertTrue(timeTaken > 0, "Время выполнения для get (ArrayList) должно быть больше 0");
    }

    @Test
    public void testGetLinkedList() {
        List<String> list = new LinkedList<>();
        WorkWithCollection.add(list);
        long timeTaken = WorkWithCollection.get(list);
        assertTrue(timeTaken > 0, "Время выполнения для get (LinkedList) должно быть больше 0");
    }

    @Test
    public void testDeleteArrayList() {
        List<String> list = new ArrayList<>();
        WorkWithCollection.add(list);
        long timeTaken = WorkWithCollection.delete(list);
        assertTrue(timeTaken > 0, "Время выполнения для delete (ArrayList) должно быть больше 0");
    }

    @Test
    public void testDeleteLinkedList() {
        List<String> list = new LinkedList<>();
        WorkWithCollection.add(list);
        long timeTaken = WorkWithCollection.delete(list);
        assertTrue(timeTaken > 0, "Время выполнения для delete (LinkedList) должно быть больше 0");
    }

    @Test
    public void testDeleteFirstArrayList() {
        List<String> list = new ArrayList<>();
        WorkWithCollection.add(list);
        long timeTaken = WorkWithCollection.deleteFirst(list);
        assertTrue(timeTaken > 0, "Время выполнения для deleteFirst (ArrayList) должно быть больше 0");
    }

    @Test
    public void testDeleteFirstLinkedList() {
        List<String> list = new LinkedList<>();
        WorkWithCollection.add(list);
        long timeTaken = WorkWithCollection.deleteFirst(list);
        assertTrue(timeTaken > 0, "Время выполнения для deleteFirst (LinkedList) должно быть больше 0");
    }
}