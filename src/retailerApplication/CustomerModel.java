package retailerApplication;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class CustomerModel {

    // Create empty array to hold customers
    ArrayList<CustomerModel> customerArray = new ArrayList<>();

    //Initialise customers
    InitialiseCustomers customerInit = new InitialiseCustomers();

    public void createFile() {
        customerInit.createFileIfNotExist();
        customerInit.writeData(customerArray);
        customerArray = customerInit.getCustomers(customerInit.readFile(InitialiseCustomers.customersFile));
    }

    public void saveChanges() {
        customerInit.writeData(customerArray);
    }

    public void checkCustomers(){
        customerArray = customerInit.getCustomers(customerInit.readFile(InitialiseCustomers.customersFile));
        int customerSize = customerArray.size();
        if (customerSize == 0) {
            addArray();
            saveChanges();
        }
    }

    public ArrayList<CustomerModel> customerArray() {
        customerArray = customerInit.getCustomers(customerInit.readFile(InitialiseCustomers.customersFile));
        return customerArray;
    }



    public void addArray() {
        customerArray.add(new CustomerModel("Jeff", 1111, "jeff@email.com", "07111111765", "1 Jeff Street, J12 0WL"));
        customerArray.add(new CustomerModel("Bob", 1112, "bob@email.com", "07111111766", "1 Bob Street, J12 0WL"));
        customerArray.add(new CustomerModel("Fred", 1113, "fred@email.com", "07111111767", "1 Fred Street, J12 0WL"));
        customerArray.add(new CustomerModel("Greg", 1114, "greg@email.com", "07111111768", "1 Greg Street, J12 0WL"));
        customerArray.add(new CustomerModel("Alex", 1115, "alex@email.com", "07111111769", "1 Alex Street, J12 0WL"));
    }

    public ArrayList<CustomerModel> initialiseArray() {
        addArray();
        return customerArray;
    }


    String customerName;
    int customerID;
    String customerEmail;
    String customerTelephone;
    String customerAddress;

    public CustomerModel(String customerName, int customerID, String customerEmail, String customerTelephone, String customerAddress) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerEmail = customerEmail;
        this.customerTelephone = customerTelephone;
        this.customerAddress = customerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getcustomerID() {
        return customerID;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerTelephone() {
        return customerTelephone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }







}
