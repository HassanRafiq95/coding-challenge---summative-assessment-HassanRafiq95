package retailerApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderController {

    Scanner scn = new Scanner(System.in);

    StockController stockControl = new StockController();
    CustomerModel customerModel = new CustomerModel("", 0,"","","");

    ArrayList<CompleteOrder> completeOrderList = new ArrayList<>();
    ArrayList<OrderModel> orderList = new ArrayList<>();
    boolean orderActive = true;

    public void orderMenu() {
        System.out.println("----------------");
        System.out.println("Order Menu");
        System.out.println("-----------------");
        System.out.println("What would you like to do?");
        System.out.println("1 - Add a new order");
        System.out.println("2 - View current orders");
        System.out.println("3 - Return to the Main Menu");
        int userSelect = Integer.parseInt(scn.nextLine());

        switch (userSelect) {
            case 1: {
                addOrders();
                break;

            }
            case 2: {
                viewOrders();
                orderMenu();
                break;
            }
            case 3: {
                break;
            }
        }


    }




    public void addOrders() {
        stockControl.stockArray();
        customerModel.initialiseArray();

        ArrayList<Double> totalcost = new ArrayList();

        while(orderActive) {
            System.out.println("Create Order Menu");
            System.out.println("-----------------");
            System.out.println("Please enter the customer ID ");
            int customerID = Integer.parseInt(scn.nextLine());

            String customerName= "";
            for(CustomerModel customer : customerModel.customerArray) {
                if(customer.customerID == customerID) {
                    customerName = customer.customerName;
                }
            }

            System.out.println("Please enter the Product ID");
            int productID = Integer.parseInt(scn.nextLine());

            String productName = "";
            for(StockModel item : stockControl.stock) {
                if(item.productID == productID) {
                    productName = item.title;
                }
            }

            System.out.println("Please enter the Quantity");
            int quantity = Integer.parseInt(scn.nextLine());

            OrderItem orderItem = new OrderItem(productID, quantity);
            OrderModel order = new OrderModel(customerID, orderItem);
            orderList.add(order);
            double orderCost = 0;
            double unitCost = 0;
            for(StockModel item : stockControl.stock) {
                if(item.productID == productID) {
                    unitCost = item.price;
                    orderCost = item.price * quantity;
                }
            }
            System.out.println("Order cost: £" + orderCost);
            totalcost.add(orderCost);

            //Adding complete order info:
            completeOrderList.add(new CompleteOrder(customerID, customerName, productID, productName, quantity, unitCost, orderCost));

            double sum = 0;
            for (Double d : totalcost) {
                sum += d;
            }

            System.out.println("The total for your order: £ " + sum);


            System.out.println("Would you like to add another order?");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int select = Integer.parseInt(scn.nextLine());

            switch (select) {

                case 1: {
                    orderActive = true;
                    break;
                }
                case 2: {
                    orderActive = false;
                    System.out.println("The total for your order: £ " + sum);
                    orderMenu();
                    break;
                }
            }

        }

    }

    public void viewOrders() {

        for(CompleteOrder order : completeOrderList) {
            System.out.println("Customer ID: " + order.getCustomerID() + " Customer name: " + order.getCustomerName() + "," +
                    " Product ID: " + order.getProductID() + "," + " Product name: " + order.getProductName() + "," + " Quantity: " +
                    order.getQuantity() + " ," + " Unit cost: " + order.getUnitCost() + " ," + " Order Cost: " + order.getTotalCost());
        }




//        for(OrderModel order : orderList) {
//            int customerID = order.CustomerID;
//            System.out.println("Customer ID: " + order.getCustomerID() + " Product ID: " + order.getItem().getProductID() + " Quantity: " + order.getItem().getQuantity());
//
//        }

    }

}
