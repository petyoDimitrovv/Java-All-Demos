package p05_CustomLinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {

    public static CustomLinkedList<String> linkedList;

    @Before
    public void init(){
        linkedList = new CustomLinkedList<>();
        linkedList.add("Pesho");

    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_GetShouldThrowException(){
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.get(1);

    }
    @Test
    public void Test_GetShouldWorkProperly(){
        String expected = "Pesho";
        String actual = linkedList.get(0);

        assertEquals(expected, actual);

    }
    @Test(expected = IllegalArgumentException.class)
    public void Test_SetShouldThrowException(){
       linkedList.set(2, "Milku");

    }
    @Test
    public void Test_SetShouldWorkProperly(){
        String expected = "ivan";
        linkedList.set(1,"ivan");
        String actual = linkedList.get(1);

        assertEquals(expected, actual);

    }
    @Test(expected = IllegalArgumentException.class)
    public void Test_AddIfListIsEmpty(){
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("Ivaka");
        String expected = ("Ivaka");
        String actual = customLinkedList.get(1);

        assertEquals(expected,actual);

    }
    @Test
    public void Test_AddIfListHaveSomething(){
        linkedList.add("Pesho");
        linkedList.add("Gesho");
        String expected = "Gesho";
        String actual = linkedList.get(2);

        assertEquals(expected, actual);

    }
    @Test(expected = IllegalArgumentException.class)
    public void Test_RemoveAtIfListIsEmpty(){
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.removeAt(1);


    }
    @Test
    public void Test_RemoveAtIfListHaveSomething(){
        linkedList.add("Pesho");
        linkedList.add("Gesho");
        String expected = "Gesho";
        String actual = linkedList.removeAt(2);

        assertEquals(expected, actual);

    }
    @Test(expected = IllegalArgumentException.class)
    public void Test_RemoveIfListIsEmpty(){
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.removeAt(1);


    }
    @Test
    public void Test_RemoveIfListHaveSomething(){
        linkedList.add("Pesho");
        linkedList.add("Gesho");
        linkedList.remove("Pesho");

        String expected = "Gesho";



        assertTrue(Boolean.parseBoolean(expected));

    }

}