
package entity;

import entity.electronics.Electronics;

import java.util.List;

/** tiny type example*/
public class Order {
    private final String id;
    private final Customer customer;
    private final List<Electronics> purchases;

    public Order (String id, Customer customer, List<Electronics> purchases){
        this.id = id;
        this.customer =customer;
        this.purchases = purchases;
    }

    /** it is only for checking result*/
    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", purchases=" + purchases.toString() +
                '}';
    }
}