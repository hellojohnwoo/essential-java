package chap04;

import java.util.Scanner;

class Book2 {
    String title, author;
    public Book2(String title, String author) {
        this.title  = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Book[] book2 = new Book[2];

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<book2.length; i++) {
            System.out.println("Title : ");
            String title = sc.nextLine();

            System.out.println("Author : ");
            String autho = sc.nextLine();

            book2[i] = new Book(title, autho);
        }

        for (int i =0; i<book2.length; i++) {
            System.out.println("(" + book2[i].title + ", " + book2[i].author + ")");

            sc.close();
        }

    }
}
