package retailerApplication;

import java.net.IDN;
import java.util.ArrayList;

public class OrderModel {

    int CustomerID;
    OrderItem item;

    public OrderModel(int customerID, OrderItem item) {
        CustomerID = customerID;
        this.item = item;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public OrderItem getItem() {
        return item;
    }

    public void setItem(OrderItem item) {
        this.item = item;
    }



}


