package unit5_library;

public class Library {

    public static void main(String[] args) {
        //call static variable
        Book.bookSummary();
        //create book objects
        Book harryPotter1 = new Book("Harry Potter 1","J.K Rowling","Fantasy", "Penguin", 275, 1997);
        Book lordOfTheRings1 = new Book("LOTR1","J.R.R Tolkin", "fantasy", "Allen", 304, 1954);


        //print out the book
        System.out.println(harryPotter1);
        System.out.println(lordOfTheRings1);
        Book.bookSummary();
    }



}
