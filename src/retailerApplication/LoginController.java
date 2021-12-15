package retailerApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginController {

    public static void main(String[] args) {
        LoginController logincontrol = new LoginController();
        logincontrol.addUsers();
        logincontrol.loginView();
    }


    Scanner scn = new Scanner(System.in);

    // Creating user array
    ArrayList<UserModel> userArray = new ArrayList<>();

    String enterUsername;
    String enterPassword;

    // Adding Users to the array

    public void addUsers() {
        userArray.add(new UserModel("Alpha", "Rona", 1001, "alpha.rona@corona.com", "password1", false));
        userArray.add(new UserModel("Beta", "Rona", 1002, "beta.rona@corona.com", "password2", false));
        userArray.add(new UserModel("Delta", "Rona", 1003, "delta.rona@corona.com", "password3", false));
        userArray.add(new UserModel("Omicron", "Rona", 1004, "omicron.rona@corona.com", "password4", true));
        userArray.add(new UserModel("Omicron", "Rona", 1004, "aa", "aa", true));

    }

    public void loginView() {

        System.out.println("Welcome To The Stock Console");
        System.out.println("Please enter your username");
        enterUsername = scn.nextLine();
        System.out.println("Please enter your password");
        enterPassword = scn.nextLine();
        loginCheck();
    }



    public void loginCheck() {
        for (UserModel user : userArray) {
            if (user.username.equalsIgnoreCase(enterUsername) && user.password.equals(enterPassword)) {
                System.out.println("Details confirmed, re-directing to main menu");
                goToMenu();
                break;
            }
        }
        //System.out.println("Incorrect details, please try again");
        //loginView();
    }

    public void goToMenu() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.startup();
        mainMenu.mainMenu();
    }

    public void AccountSettings() {

        System.out.println("Welcome to account settings");
        System.out.println("What would you like to do?");
        System.out.println("1 - Change Password");
        System.out.println("2 - Return to the Main Menu");
        int userChoice = Integer.parseInt(scn.nextLine());

        switch(userChoice) {

            case 1: {
                addUsers();
                //System.out.println("1 - change your password");
                //System.out.println("2 - go back to the manin menu");
                System.out.println("You are about to change your password...");
                System.out.println("Please enter your employee username");
                String inputUsername = scn.nextLine();
                System.out.println("Please enter your current password");
                String inputPassword = scn.nextLine();

                int userCount = 0;
                int userArrauSize = userArray.size();
                while(userCount != userArrauSize) {
                    for(UserModel user : userArray) {
                        if (user.username.equalsIgnoreCase(inputUsername) && user.password.equals(inputPassword)) {
                            System.out.println("What would you like to change it to?");
                            String newPassword = scn.nextLine();
                            user.password = newPassword;
                            System.out.println("Your password has been successfully updated");
                            System.out.println("Logging you out, please login with new details");
                            loginView();
                            break;
                        }
                        else {
                            userCount++;
                        }
                    }
                    System.out.println("No matching details found, returning to the main menu");
                    goToMenu();
                }
                break;
            }

            case 2: {
                goToMenu();
                break;
            }

        }




        }

    }
