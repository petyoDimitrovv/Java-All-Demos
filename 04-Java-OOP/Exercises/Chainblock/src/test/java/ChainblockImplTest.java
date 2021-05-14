import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChainblockImplTest {

    private static ChainblockImpl chainblock;
    private static Transaction transaction;
    private static List<Transaction> transactions;

    @Before
    public void init(){
     chainblock = new ChainblockImpl();
     transaction = (Transaction)
             new TransactionImpl( 1,TransactionStatus.SUCCESSFUL,
                     "Pesho", "Gosho", 100);

     transactions = List.of((Transaction)
             new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                     "Pesho", "Gosho", 100),
        (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 200),
         (Transaction)
                new TransactionImpl(3, TransactionStatus.ABORTED,
                        "Pesho", "Milko", 200));


    }
    //------------------------------------------------------------------
    //Add, contains, getCount

    @Test
    public void Test_addShouldWorkProperly(){

        chainblock.add(transaction);
        assertEquals(1, chainblock.getCount());
    }

    @Test
    public void Test_addShouldFindDuplicated(){
        chainblock.add(transaction);
        chainblock.add(transaction);
        assertEquals(1, chainblock.getCount());
    }


    @Test
     public void Test_getCountShouldWorkProperlyWithMoreThenOne(){
        chainblock.add(transaction);
        chainblock.add(transaction);
        int actual = chainblock.getCount();
        int expected = 2;

        assertEquals(expected, actual);

    }
    //------------------------------------------------------------------
        //ChangeTransaction
    @Test(expected = IllegalArgumentException.class)
    public void Test_ChangeTransactionStatusShouldThrowException(){
        chainblock.changeTransactionStatus(1, TransactionStatus.ABORTED);



    }
    @Test
    public void Test_ChangeTransactionStatusShouldWorkProperly(){
        chainblock.add(transaction);
        chainblock.changeTransactionStatus(1,TransactionStatus.ABORTED);
        Transaction actual = chainblock.getById(1);

        assertEquals(TransactionStatus.ABORTED,actual.getStatus());

    }
    //------------------------------------------------------------------
    //getByID
    @Test(expected = IllegalArgumentException.class)
    public void Test_GetByIdShouldThrowException(){
        chainblock.getById(1);



    }
    @Test
    public void Test_GetByIdShouldWorkProperly(){
        Transaction transaction = (Transaction)
                new TransactionImpl( 1,TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        chainblock.add(transaction);
        Transaction actual = chainblock.getById(1);

        assertEquals(transaction, actual);

    }
    //------------------------------------------------------------------
    //RemoveTransactionById(id)
    @Test(expected = IllegalArgumentException.class)
    public void Test_RemoveTransactionByIdThrowException(){
        chainblock.removeTransactionById(1);
    }

    @Test
    public void Test_RemoveTransactionByIdShouldWorkProperly() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        chainblock.add(transaction);
        chainblock.add(transaction2);

        chainblock.removeTransactionById(2);
        int actual = chainblock.getCount();
        int expected = 1;


        assertEquals(expected, actual);


    }

    //------------------------------------------------------------------
    //getByTransactionStatus(status)
    @Test(expected = IllegalArgumentException.class)
    public void Test_GetByTransactionStatusThrowException(){
        chainblock.getByTransactionStatus(TransactionStatus.SUCCESSFUL);



    }
    @Test
    public void Test_GetByTransactionStatusShouldWorkProperly() {

        chainblock.add(transaction);
        chainblock.add(transaction);



        List<Transaction> actual = (List<Transaction>) chainblock.getByTransactionStatus(TransactionStatus.SUCCESSFUL);

        assertEquals(transactions,actual);
    }
    //GetAllSendersWithTransactionStatus(status)

    @Test(expected = IllegalArgumentException.class)
    public void Test_GetAllSendersWithTransactionStatusThrowException(){
        chainblock.getAllSendersWithTransactionStatus(TransactionStatus.SUCCESSFUL);



    }
    @Test
    public void Test_GetAllSendersWithTransactionStatusShouldWorkProperly() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 30);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.ABORTED,
                        "Pesho", "Milko", 3);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);

        List<String> expected = List.of(transaction.getFrom(), transaction2.getFrom() );

        List<String> actual = (List<String>) chainblock.getAllSendersWithTransactionStatus(TransactionStatus.SUCCESSFUL);

        assertEquals(expected,actual);
    }
    //GetAllReceiversWithTransactionStatus
    @Test(expected = IllegalArgumentException.class)
    public void Test_GetAllReceiversWithTransactionStatusThrowException(){
        chainblock.getAllSendersWithTransactionStatus(TransactionStatus.SUCCESSFUL);



    }
    @Test
    public void Test_GetAllReceiversWithTransactionStatusShouldWorkProperly() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 30);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.ABORTED,
                        "Pesho", "Milko", 3);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);

        List<String> expected = List.of(transaction.getTo(), transaction2.getTo() );

        List<String> actual = (List<String>) chainblock.getAllReceiversWithTransactionStatus(TransactionStatus.SUCCESSFUL);

        assertEquals(expected,actual);

    }
    @Test
    public void Test_GGetAllOrderedByAmountDescendingThenByIdShouldWorkProperly() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 100);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.ABORTED,
                        "Pesho", "Milko", 300);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);

        List<Transaction> expected = List.of(transaction3, transaction,transaction2);

        List<Transaction> actual =
                (List<Transaction>)chainblock.getAllOrderedByAmountDescendingThenById();

        assertEquals(expected,actual);
    }
    // GetBySenderOrderedByAmountDescending
    @Test(expected = IllegalArgumentException.class)
    public void Test_GetBySenderOrderedByAmountDescendingThrowException(){
        chainblock.getBySenderOrderedByAmountDescending("Pesho");
    }
    @Test
    public void Test_GetBySenderOrderedByAmountDescendingShouldWorkProperly() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 30);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.ABORTED,
                        "Pesho", "Milko", 3);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);

        List<Transaction> expected = List.of(transaction,transaction3);

        List<Transaction> actual = (List<Transaction>) chainblock.getBySenderOrderedByAmountDescending("Pesho");

        assertEquals(expected,actual);

    }
    // GetByReceiverOrderedByAmountThenById
    @Test(expected = IllegalArgumentException.class)
    public void Test_GetByReceiverOrderedByAmountThenByIdThrowException(){
        chainblock.getByReceiverOrderedByAmountThenById("Pesho");
    }
    @Test
    public void Test_GetByReceiverOrderedByAmountThenByIdShouldWorkProperly() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 30);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.ABORTED,
                        "Pesho", "Milko", 3);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);

        List<Transaction> expected = List.of(transaction2,transaction3);

        List<Transaction> actual = (List<Transaction>) chainblock.getByReceiverOrderedByAmountThenById("Milko");

        assertEquals(expected,actual);

    }
    // GetByTransactionStatusAndMaximumAmount
    @Test
    public void Test_GetByTransactionStatusAndMaximumAmountShouldReturnEmptyList() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 30);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Milko", 3);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);
        int max = 2;


        List<Transaction> actual = (List<Transaction>) chainblock.getByTransactionStatusAndMaximumAmount(TransactionStatus.SUCCESSFUL, max);

        assertEquals(new ArrayList<>(),actual);

    }
    @Test
    public void Test_GetByTransactionStatusAndMaximumAmountShouldWorkProperly() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 30);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Milko", 3);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);
        int max = 40;

        List<Transaction> expected = List.of(transaction2,transaction3);

        List<Transaction> actual = (List<Transaction>) chainblock.getByTransactionStatusAndMaximumAmount(TransactionStatus.SUCCESSFUL, max);

        assertEquals(expected,actual);

    }
    // GetBySenderAndMinimumAmountDescending

    @Test
    public void Test_GetBySenderAndMinimumAmountDescendingShouldReturnEmptyList() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 30);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Milko", 3);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);
        int min = 2;


        List<Transaction> actual = (List<Transaction>) chainblock.getBySenderAndMinimumAmountDescending("Ivan", min);

        assertEquals(new ArrayList<>(),actual);

    }
    @Test
    public void Test_GetBySenderAndMinimumAmountDescendingShouldWorkProperly() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Gosho", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 30);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Milko", 3);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);
        int min = 2;

        List<Transaction> expected = List.of(transaction,transaction3);

        List<Transaction> actual = (List<Transaction>) chainblock.getBySenderAndMinimumAmountDescending("Pesho", min);

        assertEquals(expected,actual);

    }
    @Test
    public void Test_GetByReceiverAndAmountRangeShouldWorkProperly() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Milko", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 30);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Milko", 3);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);
        int min = 10;
        int max = 100;

        List<Transaction> expected = List.of(transaction,transaction2);

        List<Transaction> actual = (List<Transaction>) chainblock.getByReceiverAndAmountRange("Milko", min, max);

        assertEquals(expected,actual);

    }
    @Test
    public void Test_GetAllInAmountRangeShouldWorkProperly() {
        Transaction transaction = (Transaction)
                new TransactionImpl(1, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Milko", 100);
        Transaction transaction2 = (Transaction)
                new TransactionImpl(2, TransactionStatus.SUCCESSFUL,
                        "Stamat", "Milko", 30);
        Transaction transaction3 = (Transaction)
                new TransactionImpl(3, TransactionStatus.SUCCESSFUL,
                        "Pesho", "Milko", 3);

        chainblock.add(transaction);
        chainblock.add(transaction2);
        chainblock.add(transaction3);
        int min = 2;
        int max = 100;

        List<Transaction> expected = List.of(transaction3,transaction2,transaction);

        List<Transaction> actual = (List<Transaction>) chainblock.getAllInAmountRange( min, max);

        assertEquals(expected,actual);

    }
}