package onlineShop.models.products;

import onlineShop.common.constants.ExceptionMessages;
import onlineShop.common.constants.OutputMessages;
import onlineShop.models.products.components.Component;
import onlineShop.models.products.computers.Computer;
import onlineShop.models.products.peripherals.Peripheral;

import java.util.List;

public abstract class BaseProduct implements Product  {

    private int id;
    private String manufacturer;
    private String model;
    private double price;
    private double overallPerformances;

    protected BaseProduct(int id, String manufacturer, String model, double price, double overallPerformances) {
        this.setId(id);
        this.setManufacturer(manufacturer);
        this.setModel(model);
        this.setPrice(price);
        this.setOverallPerformances(overallPerformances);
    }

    private void setId(int id) {
        if(id <= 0 ){
            throw new IllegalArgumentException(
                    ExceptionMessages.INVALID_PRODUCT_ID);
        }
        this.id = id;
    }

    private void setManufacturer(String manufacturer) {
        if(manufacturer == null|| manufacturer.trim().isEmpty()){
            throw new IllegalArgumentException(
                    ExceptionMessages.INVALID_MANUFACTURER);
        }
        this.manufacturer = manufacturer;
    }

    private void setModel(String model) {
        if(manufacturer == null|| manufacturer.trim().isEmpty()){
            throw new IllegalArgumentException(
                    ExceptionMessages.INVALID_MODEL);
        }
            this.model = model;
        }

    private void setPrice(double price) {
        if(price <= 0 ){
            throw new IllegalArgumentException(
                    ExceptionMessages.INVALID_PRICE);
        }
        this.price = price;
    }

   private void setOverallPerformances(double overallPerformances) {
        if(overallPerformances <= 0 ){
            throw new IllegalArgumentException(
                    ExceptionMessages.INVALID_OVERALL_PERFORMANCE);
        }
        this.overallPerformances = overallPerformances;
    }

    @Override
    public String toString() {
        return String.format(OutputMessages.PRODUCT_TO_STRING, getOverallPerformance(),  getPrice(),
                this.getClass().getSimpleName(),
                getManufacturer(), getModel(), getId());
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getOverallPerformance() {
        return this.overallPerformances;
    }
}
