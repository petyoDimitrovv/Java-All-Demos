package onlineShop.models.products.peripherals;

import onlineShop.models.products.BaseProduct;

import static onlineShop.common.constants.OutputMessages.COMPONENT_TO_STRING;
import static onlineShop.common.constants.OutputMessages.PERIPHERAL_TO_STRING;

public class BasePeripheral extends BaseProduct implements Peripheral {

    private String connectionType;

   protected BasePeripheral(int id, String manufacturer, String model, double price, double overallPerformances, String connectionType) {

       super(id, manufacturer, model, price, overallPerformances);
       this.connectionType = connectionType;
   }

    @Override
    public String getConnectionType() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(PERIPHERAL_TO_STRING, getConnectionType() ) ;
    }
}

