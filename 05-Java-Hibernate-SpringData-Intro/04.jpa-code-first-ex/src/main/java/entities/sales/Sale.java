package entities.sales;

import entities.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sales")
public class Sale extends BaseEntity {
    private Product product;
    private Customer customer;
    private Store store;
    private LocalDateTime date;

    public Sale() {
    }

    public Sale(Product product, Customer customer, Store store, LocalDateTime date) {
        this.product = product;
        this.customer = customer;
        this.store = store;
        this.date = date;
    }

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @ManyToOne
    @JoinColumn(name = "store_location_id", referencedColumnName = "id")
    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
    @Column(name = "date")
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
