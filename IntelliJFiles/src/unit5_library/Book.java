package unit5_library;

public class Book {
    //instance variables
    private String title, author,genre,publisher,dewey;
    private int numPages,releaseYear;

    //static variable
    private static int nextBookNum=1;

    //full constructor


    public Book(String title, String author, String genre, String publisher, int numPages, int releaseYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.numPages = numPages;
        this.releaseYear = releaseYear;
        this.dewey = author.substring(0,3) + nextBookNum;
        nextBookNum++;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", dewey='" + dewey + '\'' +
                ", numPages=" + numPages +
                ", releaseYear=" + releaseYear +
                '}';
    }

    public static void bookSummary(){
        System.out.println("Next book num:" + nextBookNum);
    }




}
