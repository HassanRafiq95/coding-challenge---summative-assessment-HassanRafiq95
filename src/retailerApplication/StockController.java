package retailerApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class StockController {

    public static void main(String[] args) {
        StockController viewStock = new StockController();
        viewStock.addItems();
        viewStock.startUp();
    }

    // Creating Scanner class
    Scanner scn = new Scanner((System.in));

    // Create empty Array to hold stock
    ArrayList<StockModel> stock = new ArrayList<>();

    //Initialise Stock
    public void initialiseStock() {
        addItems();
    }


    // Add items to the stock array list
    public void addItems() {

        stock.add(new StockModel("Minecraft", 20.00, "Mojang", 1001, 15));
        stock.add(new StockModel("GTA IV", 18.00, "Rockstar", 1002, 10));
        stock.add(new StockModel("Tetris", 15.00, "EA", 1003, 20));
        stock.add(new StockModel("Wii Sports", 10.00, "Nintendo", 1004, 3));
        stock.add(new StockModel("Super Mario Bros", 20.00, "Nintendo", 1005, 15));
        stock.add(new StockModel("Pokemon Red", 20.00, "Nintendo", 1006, 12));
        stock.add(new StockModel("Mario Kart", 14.00, "Nintendo", 1007, 2));
        stock.add(new StockModel("Pac Man", 12.00, "Namco", 1008, 7));
        stock.add(new StockModel("COD: Modern Warfare", 15.00, "Activision", 1009, 11));
        stock.add(new StockModel("Diablo III", 10.00, "Blizzard", 1010, 6));
        stock.add(new StockModel("Sonic the Hedgehog", 10.00, "SEGA", 1011, 12));

    }


    public void viewStockMethod() {
        System.out.println("The current items in our stock list are:");
        System.out.println("----------------------------------------");
            for(StockModel i : stock) {
                System.out.println("Title: " + i.title + ", Price: £" + String.format("%.2f", i.price) +
                        ", Developer: " + i.developer + ", Product ID: " + i.productID + ", No in Stock: " + i.numberInStock);
                System.out.println("---------------------------------------------------------------------------------------");
            }
    }

    public void startUp() {
        System.out.println("Retro Games R US");
        System.out.println("----------------");
        System.out.println("Welcome to the Menu");
        System.out.println("What would you like to do?");
        System.out.println("---------------------------");
        System.out.println("1 - View Stock Items");
        System.out.println("2 - Exit the application");
        int userInput = Integer.parseInt(scn.nextLine());

        switch (userInput) {
                case 1: {
                    viewStockMethod();
                    break;
                }

                case 2:
                    break;

        }
    }

}
