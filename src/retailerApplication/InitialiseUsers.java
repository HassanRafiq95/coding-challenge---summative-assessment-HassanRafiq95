package retailerApplication;

import java.io.*;
import java.util.ArrayList;

public class InitialiseUsers {

        // Static variable that holds path to the text file for the products

        static File usersFile = new File("C:/Users/hassan.rafiq/Desktop/Users.txt");

        // Checks to see if the file exists, if it doesn't then file will be created

        public void createFileIfNotExist() {

            try {
                if (!usersFile.isFile()) {
                    usersFile.createNewFile();
                }
            } catch (IOException ioEx) {
                System.out.println("Encountered error trying to create new text file");
                ioEx.printStackTrace();
            }
        }

        // @param products An arraylist of product objects
        // @throws IOException if writing to the text file fails

        public static void writeData(ArrayList<UserModel> userArray) {
            try {
                //Creates new FileWriter object that will be used to write info to file provided to it (usersFile)
                FileWriter writer = new FileWriter(usersFile);

                //iterate over the arraylist of products that has been passed into the method.

                for (UserModel user : userArray) {
                    // Will write the below string to the text file, separating each value with a comma
                    writer.write(user.firstname + "," + user.surname + "," + user.employeeID + "," + user.username + "," +
                            user.password + "," + user.admin);
                    // add a new line so each product is on its own line
                    writer.write(("\n"));
                }
                //close the connection to the file
                writer.close();
            } catch (IOException ioex) {
                System.out.println("Failed to write to file");
                ioex.printStackTrace();
            }
        }

        public ArrayList<String> readFile(File file) {
            // First instance to try to use file, check if it exists first
            createFileIfNotExist();

            // A new arraylist to store each line of the text file
            ArrayList<String> lines = new ArrayList<>();

            try {
                //Create a new FileReader object that will read data from the file provided
                FileReader reader = new FileReader(file);
                BufferedReader br = new BufferedReader(reader);

                String line;

                //A loop that will continue reading from the text file while there is another line in the file

                while ((line = br.readLine()) != null) {
                    //add the line that has been read to the arraylist
                    lines.add(line);
                }
                //close the connection to the file
                reader.close();

            } catch (IOException ioex) {
                System.out.println("Failed to read the file");
                ioex.printStackTrace();
            }
            //retrun the arraylist with the lines read in from the text file
            return lines;
        }

        //@param productString - a single line from te text file
        // @return a product object created from the string

        private UserModel getUserFromString(String userString) {
            // Create a new product variable
            UserModel u;

            // Create an array that will be populated with strings
            //The line from the file will be split at each comma found
            // A string read in from the text file - title, price, developer,product ID, stock number
            // When the string is split at each comma the array will be populated as below
            // pd = {Minecraft, 19.99, Mojang, 1001, 10}

            String[] users = userString.split(",");
            //Create a new product object using constrcutor from StockModel class with the values stored in pd Array
            u = new UserModel(users[0], users[1], Integer.parseInt(users[2]), users[3], users[4], Boolean.parseBoolean(users[5]));
            return u;
        }

        //productStrings - Takes in arraylist of strings read in from text file

        // products returns an array list of products after they have been converted from strings to products

        public ArrayList<UserModel> getUsers(ArrayList<String> userStrings) {
            // create a new arraylist of type product
            ArrayList<UserModel> userArray = new ArrayList<>();
            // for each string read in from the text file

            for (String s : userStrings) {
                //Create a new product Object using the getProductFromString method
                // passing in the string currently assinged to 's' in the for each loop
                // add the product object returned from the method to the arraylist 'products
                userArray.add(getUserFromString(s));

            }
            // Return the ArrayList of product objects that have been read into programme as strings and converted into objects
            return userArray;

        }

    }

