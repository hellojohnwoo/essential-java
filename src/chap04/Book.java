package chap04;

public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book() {
        this("", "");
        System.out.println("Call Constructor");
    }

    public Book(String title) {
        this(title, "Unknown");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("LittlePrince", "Saint-Exupéry");
        Book loveStory    = new Book("The Moon and Sixpence");
        Book emptyBook    = new Book();
        loveStory.show();
    }
}
