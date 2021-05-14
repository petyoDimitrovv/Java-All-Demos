package Restourant.bavarages;

import Restourant.Product;

import java.math.BigDecimal;

public class Beverages extends Product {
    private double milliliters;

    public Beverages(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(double milliliters) {
        this.milliliters = milliliters;
    }
}
