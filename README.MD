Please ensure that a path on your local machine is inserted in the classes: 
InitialiseOrders, InitialiseCustomers, InitialiseUsers and Initialise.

**Assessment Overview**

**Putting it all together**
Over the last few weeks we have covered a wide range of topics
covering the fundamentals of java programming, we have done this
through a series of activities separate from each other. This task
will see you using all of the topics we have covered in one
application, helping to show you how all of the different parts fit
together.

There are some elements of this task that we have not covered, such as
file handling. This is intentional and will encourage you to conduct
research into how to achieve a task. All of the parts that require
knowledge we have not covered in class are thoroughly documented
online with a multitude of examples and demonstrations. Should you at
any point become stuck, ask for help and I will guide you to a
solution.

**The Application**
A local retailer has requested a system be made that will cover all of their business needs from
a single system.
Naturally a system like this will be huge, so it has been broken up into stages, with the
complexity of each stage becoming increasingly more difficult. The final application should
include the following functionality (This is in no particular order):
● Secure log in
● Stock Control
● Order management
● Staff Management
● Payroll
● Online Orders
● Accounting
Each of the above features encompasses a range of additional functionality that will be
identified at each stage. There are some points within this challenge where you will have to go
back and change code you have already written, this is intentional, refactoring code to work with
new code is an essential skill.

**Task 1 - Stock**
The first task is a relatively simple one, you are to create an application that will allow the user
to view the stock that the retailer currently sells. This should be a simple application that allows
the user to view a list of each individual item, with no additional details. Each of the stock items
should be ‘hard coded’ into the application using a suitable data structure. When the user
selects the option from a menu, each of the items should be displayed in the console screen.
This task will only need to display a list of strings (product names),
use a suitable collection to store these Strings.
Task 1 - Additional Details
You need to expand on the previous application by also displaying additional details of the
products, the following details should also be displayed:
● Price
● Manufacturer
● Product ID
● Number in Stock
The details of each product should be displayed in the following format:
ID: [Product ID] - Manufacturer [Manufacturer] - Name [Name] - Price [Price] - Stock [Quantity]
Again, you should use a suitable data structure to hold all of the details for each of the products.
This task will require data model(s) to be created to store product
details and the use of collections to store the data within the
application.

**Task 1 - Amending Records**
Staff need to be able to update the records within the application, new menu options should be
added that will allow the user to:
● Update an existing item (i.e. the number in stock)
● Add a new item
● Remove an existing item.
When updating an existing item the user will have to specify the ID of the item to be updated,
this will make sure the correct item is being updated.
When a new item is added to the system it will go to the end of the product list.
When an item is deleted from the system it should no longer be displayed when the user views
the products sold by the business.
Some data structures work in different ways, some allow you to search
for the properties of objects inside of them and will resize when an
element is added or removed, while others are static and do not
provide this functionality, make sure you are using the most suitable
data structure for this task.

**Task 1 - Persistent Data**
Now, one major flaw of the current system is that the data is not persistent, while the computer it
runs on is never powered off and so the program never stops running, should there be a power
cut all of the data would be lost.
The user does not want to pay for a database to be created yet, so you have said you can write
the data to a text file on the system, this will allow the data to be saved across instances of the
application, so if there is a power cut, no data will be lost.
All of the data within the system should be saved to an external text file in a suitable format,
when a user wants to view the products they will be read into the program using an IO
(Input/Output) function. When a record is updated the text file will also be updated to reflect the
changes made within the system.
There are multiple ways you can implement file management within your
code, however, I would suggest using the BufferedReader and
BufferedWriter classes for this task.

**Task 2 - Login**
A simple login should be created that will require the user to enter the correct password in order
to access the system, the password should be hardcoded into the application, only one
password is required for this stage.

**Task 2 - Additional Accounts**
The client has decided that they would like separate accounts for the different users of the
application, as such you need to add username and password combinations to the login class,
requiring the user to enter a correct combination in order to login.
User accounts should also contain other relevant information, such as the name of the user
(Forename & Surname), their employee ID and their access privileges, for now this should just
be a boolean to determine if they are an admin user or not.
Task 2 - Updating Account Details
It has come to the attention of the client that some of the users of the application are regularly
forgetting their passwords, they believe that if the user can select their own password they are
less likely to forget it, you are to create a way for a user to be able to change their password
should they wish to do so.
An additional option on the main menu - Account Settings - should be created that will allow a
user to manage their accounts.

**Task 2 - Persistent Data**
Once again, you need to develop a way for the changes a user makes to their accounts, i.e.
their passwords, to persist across multiple instances of the application. Currently, if the
application is closed, any changes a user makes to their account, such as updating their
password, are lost as the data is hard coded into the application.
User account details should be saved in a similar manner to the products data, in an external
text file that can be updated when changes are made and read into the application when
required. This should be a separate text file to the one with the stock details.

**Task 2 - Admin Access**
You are to implement a way for admin accounts to view and update the details of all non-admin
accounts within the system, this will allow the business to manage the accounts of their users
independently and not require the developers to reset passwords should a user forget theirs.
Create a submenu within the Account Settings menu that will allow them to view the accounts of
the other users, from this screen they should be able to select the account they want to access
and then be able to update the details as required.

**Task 3 - Orders**
It is now time to add customer orders to the system, moving away from the paper-based system
currently in use. Each order will hold a range of information detailed below:
● Customer
● product(s) ordered
● Total Cost
You need to implement a way for these details to be represented within the system. The first
thing that will need to be done is to create the required data models for this information.
Create a model for Customer first, this should include:
● Customer name
● Customer Account Number
● Customer Email
● Customer Telephone
● Customer Address

**Task 3 - Product(s) Ordered**
When a customer orders some products a new record of the order is created, if the customer
orders multiple products then we need a way to store that information as we need to store the
product ID of the product that has been ordered - this will then allow us to find the product using
this unique ID, as well as the quantity ordered.
This information will then be stored within the Customer data model. As there can be multiple
products ordered this will need to be stored within a suitable data structure.
Create a new model for OrderItem, this will store the following data:
● Product ID
● Quantity

**Task 3 - Order**
Now that we have the models for our Customer and our OrderItem we can create the model for
the Order itself, this will contain:
● Customer ID
● OrderItem
As each order can contain multiple OrderItems this will need to be a collection of the type
OrderItem.
If we ever need to lookup the details of an order we can do so using the details provided within
the Order model.
The customer can be identified by using the customerID property as this should be unique to
every customer, if we want to see who the customer for an order is we can simply search the
customer objects and return the one where the ID is the same as the CustomerID in the order
object.
The same principle applies for the products that have been ordered, we can use the ID of the
product from the OrderItem object to find the relevant product.

**Task 3 - Customers**
Before we can go ahead and use our new ordering system we need to create some sample
customer objects to be used in the application, this can either be hard-coded into the application
in an ArrayList or other collection or can be added using an external text file.

**Task 3 - Creating Orders**
Now that we have the foundation of the Order functionality implemented we need to provide a
way for Orders to be Created and Viewed.
Extend the menu to include an option for ‘Orders’
When this menu option is selected another sub-menu should be displayed that will allow the
user to either create a new order to view existing orders.
When the create order option is selected the user should be taken through a step-by-step
process that will ask for all of the required details to create a new order:
● Customer ID
● Product ID
● Quantity
The Product ID and Quantity should be repeated for as long as there are more items to be
added to the order, you could put a simple yes/no check in here to see if there are more items to
be added to the order, if there are then repeat, otherwise continue.
Once the order items have been added to the order the total cost needs to be calculated, use
the information entered to calculate the total cost - using the ProductID get the product details,
once you have the product details get the price of the item and multiply it by the quantity
ordered. Store the result and repeat for each item ordered, increasing the result after each
product.

**Task 3 - Viewing Orders**
If the user selects the ‘View Orders’ option a list should be displayed that will show the name of
the customer and the total cost of the order in a dynamic list, this will then allow the user to
select a specific order to view in more detail.
When the user selects an order to view in detail the application should display the following:
Customer ID
Customer Name
“Items Ordered”
*Repeated for each item ordered*
Product ID - Product Name - Quantity Ordered - Unit Cost - Total Cost
Total cost of Order
