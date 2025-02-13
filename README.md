# oops-book-store-inventory-system
oops-book-store-inventory-system

# Project Overview  
The Core Java oops book store inventory system project is a basic Java application that demonstrates a book inventory system. It utilizes object-oriented programming principles and simulates the interactions between customers, books and suppliers.

# Features   
* Manage customer information.
* Manage book information.
* Manage supplier information.

# Installation and Setup  
* Prerequisites
* Java Development Kit (JDK) 21.
* An Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse.
* Git (optional, for version control).

# Steps
* Clone the repository
* Navigate to the project directory:
* cd core-java-hashset-book-store-inventory-system
* Open the project in your preferred IDE.
* Compile and run the application:
* Locate Main.java.
* Run the file to start the application.

# Package Structure
* com.amit.book.inventory Contains the main application logic (BookStoreInventorySystem.java)
* * com.amit.book.inventory.controller: includes all the controller classes:
  * BookController.java
  * CustomerController.java
  * SupplierController.java
* com.amit.book.inventory.model: includes all the model classes:
  * Book.java
  * Customer.java
  * Supplier.java
* com.amit.book.inventory.service: includes all the service classes and interfaces:
   * BookService.java
   * CustomerService.java
   * SupplierService.java
   * BookServiceInterface.java
   * CustomerServiceInterface.java
   * SupplierServiceInterface.java

 # Class Diagram

classDiagram
    class BookStoreInventorySystem {
        +main(args: String[])
    }

    class BookController {
        +run()
    }

    class CustomerController {
        +run()
    }

    class SupplierController {
        +run()
    }

    class BookService {
        +acceptingBookInfo()
        +displayBookInfo()
        +getBookById(bookId: int)
        +removeBookById(bookId: int)
        +updateBookPrice(bookId: int, newPrice: int)
    }

    class CustomerService {
        +acceptCustomerInfo()
        +displayCustomerInfo()
    }

    class SupplierService {
        +acceptSupplierInfo()
        +displaySupplierInfo()
    }

    class Book {
        +setBookID(id: int)
        +setName(name: String)
        +setAuthor(author: String)
        +setPublisher(publisher: String)
        +setNoOfCopies(copies: int)
        +setCategory(category: BookCategory)
        +setStoreLocation(location: String)
        +setPrice(price: int)
    }

    class Customer {
        +setCustomerID(id: int)
        +setCustomerName(name: String)
        +setCustomerAddress(address: String)
        +setCustomerContact(contact: Long)
        +setEmailID(emailID: String)
    }

    class Supplier {
        // Define supplier attributes and methods here
    }

    class InvalidBookIDException {
        // Exception details
    }

    BookStoreInventorySystem --> BookController
    BookStoreInventorySystem --> CustomerController
    BookStoreInventorySystem --> SupplierController

    BookController --> BookService
    CustomerController --> CustomerService
    SupplierController --> SupplierService

    BookService --> Book
    CustomerService --> Customer


