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


    int userID;
    public void loginCheck() {
        for (UserModel user : userArray) {
            if (user.username.equalsIgnoreCase(enterUsername) && user.password.equals(enterPassword)) {
                System.out.println("Details confirmed, re-directing to main menu");
                userID = user.employeeID;
                goToMenu();
            }
        }
        System.out.println("Incorrect details, please try again");
        loginView();
    }

    public void goToMenu() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.startup();
        mainMenu.mainMenu();
    }


}