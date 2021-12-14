package retailerApplication;

import java.util.ArrayList;

public class StockModel {

    String title;
    double price;
    String developer;
    int productID;
    int numberInStock;


    public StockModel(String title, double price, String developer, int productID, int numberInStock) {
        this.title = title;
        this.price = price;
        this.developer = developer;
        this.productID = productID;
        this.numberInStock = numberInStock;
    }



    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getDeveloper() {
        return developer;
    }

    public int getProductID() {
        return productID;
    }

    public int getNumberInStock() {
        return numberInStock;
    }



}
