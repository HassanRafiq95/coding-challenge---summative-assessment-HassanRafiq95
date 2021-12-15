package retailerApplication;

import java.util.Scanner;

public class MainMenu{

//    public static void main(String[] args) {
//        MainMenu mainMenu = new MainMenu();
//        mainMenu.startup();
//        mainMenu.mainMenu();
//
//    }

    // new instance of Login controller


//    public void getName() {
//        LoginController loginControl = new LoginController();
//        loginControl.userArray.contains()
//
//    }



    // Creating Scanner object
    Scanner scn = new Scanner((System.in));

    // Create instance of Stock Controller that will be used in programme
    StockController stockControl = new StockController();

    public void startup() {
        //Initialise stock during start up
        stockControl.addItems();
        stockControl.createFile();
    }


        public void mainMenu () {


            System.out.println("-------------");
            System.out.println("Retro Games R US");
            System.out.println("----------------");
            System.out.println("Welcome to the Menu");
            System.out.println("What would you like to do?");
            System.out.println("---------------------------");


            System.out.println("1 - View Stock Items");
            System.out.println("2 - Add a new Stock item");
            System.out.println("3 - Edit an existing item");
            System.out.println("4 - Remove an item");
            System.out.println("5 - Save Changes");
            System.out.println("6 - Exit the application");
            System.out.println("7 - Account Settings");

            // Get User Input
            int userInput = Integer.parseInt(scn.nextLine());

            switch (userInput) {
                case 1: {
                    stockControl.viewStockMethod();
                    mainMenu();
                    break;
                }

                case 2: {
                    stockControl.createRecord();
                    mainMenu();
                    break;
                }
                case 3: {
                    stockControl.editRecords();
                    mainMenu();
                    break;
                }
                case 4: {
                    stockControl.deleteRecord();
                    mainMenu();
                    break;
                }
                case 5: {
                    stockControl.saveChanges();
                    System.out.println("Save successful");
                    mainMenu();
                    break;
                }

                case 6: {
                    System.out.println("Exiting application, hold on a moment...");
                    System.out.println("Application successfully exited");
                    System.exit(0);
                }

                case 7: {
                    //account settings
                    break;

                }



            }
        }
    }


