package retailerApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewStock {

    public static void main(String[] args) {
        ViewStock stockApp = new ViewStock();
        stockApp.addItems();
        stockApp.startUp();

    }

    // Creating Scanner class
    Scanner scn = new Scanner((System.in));

    // Create empty array list
    ArrayList<String> stock = new ArrayList<>();

    public void startUp() {
        System.out.println("Welcome to the Menu");
        System.out.println("What would you like to do?");
        System.out.println("---------------------------");
        System.out.println("1 - View Stock Items");
        System.out.println("2 - Exit the application");
        int userInput = Integer.parseInt(scn.nextLine());

        switch (userInput) {
                case 1:
                viewStock();
                break;

                case 2:
                    break;

        }
    }


    // Add items to the stock array list
    public void addItems() {

        stock.add("Minecraft");
        stock.add("GTA IV");
        stock.add("Tetris");
        stock.add("Wii Sports");
        stock.add("Super Mario Bros");
        stock.add("Pokemon Red");
        stock.add("Mario Kart");
        stock.add("Pac Man");
        stock.add("COD: Modern Warfare");
        stock.add("Diablo III");
        stock.add("Sonic the Hedgehog");

    }

    public void viewStock() {

        System.out.println("The current items in our stock list are:");
        System.out.println("----------------------------------------");
        for(String item: stock) {
            System.out.println(item);
            System.out.println("----------");
        }

    }








}
