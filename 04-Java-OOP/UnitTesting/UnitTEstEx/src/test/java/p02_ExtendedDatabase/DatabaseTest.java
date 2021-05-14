package p02_ExtendedDatabase;

import org.junit.Before;
import org.junit.Test;


import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {
    private static Database database;

    @Before
    public void init() throws OperationNotSupportedException {
        database = new Database(new Person(1,"Pesho"),
                                new Person(2,"Kir4o"),
                                new Person(3,"Mile"));

    }

    @Test(expected = OperationNotSupportedException.class)
    public void TestIfIntegerIsExactly16() throws OperationNotSupportedException {
        Database database = new Database();

    }

    @Test
    public void TestIfElementShouldWorkProperly() throws OperationNotSupportedException {

        Person[] expected = database.getElements();
        Person[] actual = new Person[]{ new Person(1,"Pesho"),
                new Person(2,"Kir4o"),
                new Person(3,"Mile")};

        assertArrayEquals(expected, actual);
    }
    @Test (expected =  OperationNotSupportedException.class)
    public void TestIf_AddAnElementAtTheNextFreeCellThrowAnException() throws OperationNotSupportedException {
        database.add(null);
    }

//    @Test
//    public void TestIf_AddAnElementAtTheNextFreeCell() throws OperationNotSupportedException {
//
//
//        int expected = database.getElements()[database.getElements().length - 1];
//        int actual = 11;
//        assertEquals(expected, actual);


    @Test (expected =  OperationNotSupportedException.class)
    public void TestIf_RemovingAnElementAtTheLastIndex() throws OperationNotSupportedException {

        database.remove();
        database.remove();
        database.remove();
        database.remove();
    }
    @Test
    public  void TestIf_RemoveFunctionRemoveProperly() throws OperationNotSupportedException {
        int expectedLenght = database.getElements().length - 1;
        database.remove();
        int actualLenght = database.getElements().length ;
        assertEquals(expectedLenght,actualLenght);
    }

    @Test
    public  void TestIf_getElementsShouldWorkProperly() throws OperationNotSupportedException {
        Person[] expected = new Person[]{ new Person(1,"Pesho"),
                new Person(2,"Kir4o"),
                new Person(3,"Mile")};;

        assertArrayEquals(expected, database.getElements());

    }

}

