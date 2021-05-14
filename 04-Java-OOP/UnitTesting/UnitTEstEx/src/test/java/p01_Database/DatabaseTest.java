package p01_Database;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    private static Database database;

    @Before
    public void init() throws OperationNotSupportedException {
        database = new Database(8, 9, 10);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void TestIfIntegerIsExactly16() throws OperationNotSupportedException {
        Database database = new Database();

    }

    @Test
    public void TestIfElementShouldWorkProperly() throws OperationNotSupportedException {

        Integer[] expected = database.getElements();
        Integer[] actual = new Integer[]{8,9,10 };

        assertArrayEquals(expected, actual);
    }
    @Test (expected =  OperationNotSupportedException.class)
    public void TestIf_AddAnElementAtTheNextFreeCellThrowAnException() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void TestIf_AddAnElementAtTheNextFreeCell() throws OperationNotSupportedException {

        database.add(11);

        int expected = database.getElements()[database.getElements().length - 1];
        int actual = 11;
        assertEquals(expected, actual);

    }
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
        Integer[] expected = {8, 9, 10};

        assertArrayEquals(expected, database.getElements());

    }

    }