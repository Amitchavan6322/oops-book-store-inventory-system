package com.amit.book.inventory.Controller;

import com.amit.book.inventory.exception.InvalidBookIDException;
import com.amit.book.inventory.exception.InvalidBookNameException;
import com.amit.book.inventory.service.BookService;

import java.util.Scanner;

public class BookController {

    private static final Scanner scanner = new Scanner(System.in);

    public void run() {
        int option = 0;
        do {
            System.out.println("Please select option from below list :");
            System.out.println("1. Fill the book information");
            System.out.println("2. Display book information");
            System.out.println("9: Go back to main menu");
            option = Integer.parseInt(scanner.nextLine());

            BookService bookService = new BookService();
            switch (option){
                case 1:
                    try {
                        bookService.acceptingBookInfo();
                        break;
                    } catch (InvalidBookIDException | InvalidBookNameException invalidBookIDException) {
                        System.err.println(invalidBookIDException.getMessage());
                    }

                case 2:
                    bookService.displayBookInfo();
                    break;
            }

        }
        while (option != 9);
        //System.out.println("Welcome back to main menu!");
    }
}
