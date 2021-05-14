package p03_IteratorTest;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {

    private static ListIterator listIterator;

    @Before
    public void init() throws OperationNotSupportedException {
        listIterator = new ListIterator("Pesho, Gosho");
    }


    @Test(expected = OperationNotSupportedException.class)
    public void Test_ConstructorShouldThrowException() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator(null);
    }
    @Test
    public void Test_ConstructorShouldWorkProperly() throws OperationNotSupportedException {
        listIterator.move();

        assertFalse(listIterator.hasNext());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void Test_HasNextShouldThrowException() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator(null);
        listIterator.hasNext();
    }
    @Test
    public void Test_HAsNextShouldWorkProperly() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator("Pesho");


        assertFalse(listIterator.hasNext());
    }

}