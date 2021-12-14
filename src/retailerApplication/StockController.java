package retailerApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class StockController {

    // Creating Scanner class
    Scanner scn = new Scanner((System.in));

    // Create empty Array to hold stock
    ArrayList<StockModel> stock = new ArrayList<>();

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
        for (StockModel i : stock) {
            System.out.println("Title: " + i.title + ", Price: £" + String.format("%.2f", i.price) +
                    ", Developer: " + i.developer + ", Product ID: " + i.productID + ", No in Stock: " + i.numberInStock);
            System.out.println("---------------------------------------------------------------------------------------");
        }
    }

    public void createRecord() {

        String inputtitle;
        double inputprice;
        String inputdeveloper;
        int inputproductID;
        int inputnoInStock;

        System.out.println("Add a new item to the stock list");
        System.out.println("Please enter the following when prompted: ");
        System.out.println("Title: ");
        inputtitle = scn.nextLine();
        System.out.println("Price: ");
        inputprice = Double.parseDouble(scn.nextLine());
        System.out.println("Developer: ");
        inputdeveloper = scn.nextLine();
        System.out.println("Unique Product code: ");
        // Need to run a check if this is in current stock list
        inputproductID = Integer.parseInt(scn.nextLine());
        System.out.println("Number in stock: ");
        inputnoInStock = Integer.parseInt(scn.nextLine());

        // Adds new entry into Stock Array List
        stock.add(new StockModel(inputtitle, inputprice, inputdeveloper, inputproductID, inputnoInStock));
        System.out.println("Item has been successfully added");

    }

    int deleteInput;

    public void deleteRecord() {

        System.out.println("Please enter the product ID of the Item you will like to delete");
        deleteInput = Integer.parseInt(scn.nextLine());

        int stockCount = 0;
        int stockSize = stock.size();

        while (stockCount < stockSize) {
            for (StockModel item : stock) {
                if (deleteInput == item.productID) {
                    System.out.println("You have selected item: " + item.getTitle());
                    deleteProcess();
                    break;
                } else {
                    stockCount++;
                }
            }
        }
        if (stockCount == stockSize) {
            System.out.println("Invalid Selection");
            System.out.println("Returning to the main menu");
        }
    }


    public void deleteProcess() {

        int stockCount = 0;

        System.out.println("Are you sure that you want to remove item?");
        System.out.println(" 1 - Yes");
        System.out.println(" 2 - No");

        int userConfirm = Integer.parseInt(scn.nextLine());

        switch (userConfirm) {
            case 1: {
                for (StockModel item : stock) {
                    stock.removeIf(StockModel -> StockModel.productID == deleteInput);
                    System.out.println("Item has been successfully deleted");
                    break;
                }
                break;
            }
            case 2: {
                System.out.println("Returning you to the main menu");
                break;
            }
        }


    }


    int editInput;

    public void editRecords() {
        System.out.println("Please enter the product ID of the item you would like to edit");
        editInput = Integer.parseInt(scn.nextLine());

            for (StockModel item : stock) {
                if (editInput == item.productID) {
                    System.out.println("You have selected item: " + item.getTitle());
                    editProcess();
                    break;
                }
            }
    }

    public void editProcess() {

        System.out.println("What would you like to edit?");
        System.out.println("1 - Price");
        System.out.println("2 - Number in stock");
        System.out.println("3 - Exit to Main menu");
        int selection = Integer.parseInt(scn.nextLine());

        switch (selection) {

            case 1: {
                for(StockModel item : stock) {
                    if(item.productID == editInput) {
                        System.out.println("The current price is: £" +String.format("%.2f", item.price));
                    }
                }

                System.out.println("What would you like to change it to?");
                double newPrice = Double.parseDouble(scn.nextLine());
                System.out.println("You have entered: £" + String.format("%.2f", newPrice));
                for (StockModel item : stock) {
                    if (item.productID == editInput) {
                        item.price = newPrice;
                        System.out.println("Hold on a moment...");
                        System.out.println("Price updated, returning to Main Menu");
                    }
                }
                break;
            }

            case 2: {
                for(StockModel item : stock) {
                    if(item.productID == editInput) {
                        System.out.println("The current stock number is: " + item.numberInStock);
                    }
                }

                System.out.println("What would you like to change it to?");
                int newStock = Integer.parseInt(scn.nextLine());
                System.out.println("You have entered: " + newStock);
                for (StockModel item : stock) {
                    if (item.productID == editInput) {
                        item.numberInStock = newStock;
                        System.out.println("Stock updated, returning to Main Menu");
                        break;
                    }
                }
                break;
            }
            case 3: {break;}

        }
    }
}







