package day7.challenges;

import java.util.Scanner;

public class _21_BookClass {

    public static class Book {

        static int totalNoOfBooks;

        String title;
        String author;
        boolean isBorrowed = false;

        static {
            totalNoOfBooks = 0;
        }

        {
            totalNoOfBooks++;
        }

        public void borrowBook() {
            if (isBorrowed == true) {
                System.out.println("this book is already borrowed");
            } else {
                isBorrowed = true;
                System.out.println("this book is given to you :)");
            }

        }

        public void returnBook() {
            if (isBorrowed == false) {
                System.out.println("this book is not borrowed yet then how can you return it ");
            } else {
                isBorrowed = false;
                System.out.println("book successfully returned :)");
            }

        }

        public boolean checkAvailibility() {
            return !isBorrowed;
        }

        public void getBookInfo() {
            System.out.println("Title: " + title);
            System.out.println("author: " + author);
            System.out.println("isBorrowed: " + isBorrowed);
        }

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }

    public static void main(String[] args) {
        Book book1 = new Book("power of your subconcious mind", "nill bata sanata");
        book1.borrowBook();
        // System.out.println(book1.checkAvailibility());
        book1.borrowBook();
        book1.returnBook();
        // System.out.println(book1.checkAvailibility());
        // book1.getBookInfo();

        Book book2 = new Book("how to win friends and influence people", "dale carnegie");
        System.out.println("total number of books : " + Book.totalNoOfBooks);

        Scanner input = new Scanner(System.in);
        System.out.print("enter weekday you want to print in number : ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("invalid day!");
                break;

        }
    }
}
