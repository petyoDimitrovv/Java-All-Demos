import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class InstockTest {
    private static final String PRODUCT_LABEL = "test_label";

    private ProductStock stock;
    private Product testProduct;
    private Product[] products;

    @Before
    public void setUp() {
        this.stock = new Instock();
        this.testProduct = new Product("test_label", 12, 1);
    }


    @Test
    public void test_AddShouldSaveProduct() {

        stock.add(testProduct);

        assertTrue(stock.contains(testProduct));

    }

    @Test
    public void test_Contains() {
        assertFalse(stock.contains(testProduct));
        test_AddShouldSaveProduct();
        assertTrue(stock.contains(testProduct));
    }
    // 1 -> for 1 product
    //10 for 10 product
    //0 -> empty stock
    //10 - 5 = 5 for product whose are nalichni

    @Test
    public void test_IfCountShouldReturnOneForSingleProduct() {
        stock.add(testProduct);
        assertEquals(1, stock.getCount());
    }

    @Test
    public void test_IfCountShouldReturnTenForTenProducts() {
        int expectedProductCount = 10;
        addProductsToStock(expectedProductCount);
        assertEquals(expectedProductCount, stock.getCount());
    }

    @Test
    public void test_IfCountShouldReturnZeroWhenEmpty() {
        assertEquals(0, stock.getCount());
    }


    //This test will work only if we had remove operation;
    @Ignore
    @Test
    public void test_IfCountShouldReturnFiveWhenRemoveFiveProductsFromTen() {
        addProductsToStock(10);
        stock.changeQuantity("L", 5);
        //TODO: add remove operation of five product here;
        //stock.remove(5);
        assertEquals(5, stock.getCount());
    }

    //Find by index:
    //1 -> 0 index
    //10 -> 9 index
    //5 -> 4
    //no elements -> exception
    // negative -> exception

    @Test
    public void test_ifFindByIdShouldReturnCorrectElementWhenWeHaveOnlyOne() {
        stock.add(testProduct);
        assertProductAreEqual(testProduct, stock.find(0));
    }

    @Test
    public void test_ifFindByIndexShouldReturnCorrectElementWhenWeHaveTen() {
        addProductsToStock(9);
        stock.add(testProduct);
        assertProductAreEqual(products[products.length - 1],
                stock.find(products.length - 1));
    }

    @Test
    public void test_ifFindByIdShouldReturnCorrectElementFromTheMiddle() {
        addProductsToStock(10);
        assertProductAreEqual(products[(products.length - 1) / 2],
                stock.find((products.length - 1) / 2));

    }@Test
    public void test_ifFindByIdShouldReturnCorrectElementWhenAllIndexesAreFetched() {
        addProductsToStock(10);
        for (int i = 0; i < 10; i++) {

            assertProductAreEqual(products[i],
                    stock.find(i));
        }

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_ifFindByIdShouldThrowWhenIsEmpty() {
        stock.find(0);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_ifFindByIdShouldThrowWhenIsNegative() {
        stock.find(-2);

    }

    @Test
    public void test_ifChangeQuantityShouldSetNewValue(){
        int newQuantity = testProduct.getQuantity() + 10;
        stock.add(testProduct);
        stock.changeQuantity(testProduct.getLabel(), newQuantity);
        assertEquals(newQuantity, testProduct.getQuantity());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_ifChangeQuantityThrowWhenEmptyStock(){
        stock.changeQuantity(testProduct.getLabel(), 100);
    }
    @Test
    public void test_ifFindByLabelShouldReturnTheSameProduct(){
        stock.add(testProduct);
        Product actual = stock.findByLabel(testProduct.getLabel());
        assertProductAreEqual(testProduct, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_ifFindByLabelShouldFailWhenEmpty(){
        stock.findByLabel("None-Existing-Label");

    }
    @Test
    public void test_findFirstByAlphabeticalOrderShouldWorkCorrect(){
        addProductsToStock(10);

        List<Product> expected = Arrays.stream(products)
                .sorted(Comparator.comparing(Product::getLabel))
                .limit(5)
                .collect(Collectors.toList());

        Iterable<Product> iter = stock.findFirstByAlphabeticalOrder(5);
        List<Product> actual = new ArrayList<>();
        
        iter.forEach(actual::add);
        assertEquals(expected.size(),actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertProductAreEqual(expected.get(i), actual.get(i));
            
        }

    }
    @Test
    public void  test_findFirstByAlphabeticalOrderWhenEmpty(){
        addProductsToStock(10);
        Iterable<Product> iterable = stock.findFirstByAlphabeticalOrder(11);
        assertNotNull(iterable);
        AtomicInteger counter = new AtomicInteger();
        iterable.forEach(p -> counter.incrementAndGet());
        assertEquals(0, counter.get());
    }














    private void addProductsToStock(int count) {
        products = new Product[count];
        for (int i = 0; i < count; i++) {
            products[i] = (new Product("L" + i, i + 10, i));
            stock.add(products[i]);
        }

    }

    private void assertProductAreEqual(Product expected, Product actual) {
        assertEquals(expected.getLabel(), actual.getLabel());
        assertEquals(expected.getPrice(), actual.getPrice(), 0.00);
        assertEquals(expected.getQuantity(), actual.getQuantity());

    }

}