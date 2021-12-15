package retailerApplication;

public class UserModel {

    String firstname;
    String surname;
    int employeeID;
    String username;
    String password;
    boolean admin;

    public UserModel(String firstname, String surname, int employeeID, String username, String password, boolean admin) {
        this.firstname = firstname;
        this.surname = surname;
        this.employeeID = employeeID;
        this.username = username;
        this.password = password;
        this.admin = admin;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return admin;
    }




}
