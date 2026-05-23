/* Array of Books with Access Check
Extend the Book class: create an array of 5 Book objects. 
Add a method to check if a book's title matches a user-given string (via Scanner). 
If found, display its author and ISBN. */
import java.util.Scanner;

class Book{
    String title;
    String author;
    String isbn;

    Book(String t, String a, String i){
        this.title = t;
        this.author = a;
        this.isbn = i;
    }

    public boolean matchesTitle(String searchTitle){
        return this.title.equalsIgnoreCase(searchTitle);
    }

    public void displayDetails() {
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class Q12{
    public static void main(String[] args){
        Book[] library = new Book[5];
        library[0] = new Book("Wayards", "Tolkien", "543221");
        library[1] = new Book("1945", "George Bush", "524935");
        library[2] = new Book("To Kill a Mockingbird", "Lee", "635467");
        library[3] = new Book("The Great Adventures of Lupin", "Scottie", "273565");
        library[4] = new Book("Java Programming", "John Doe", "567890");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String Input = scanner.nextLine();

        boolean found = false;
        for (Book book : library) {
            if (book.matchesTitle(Input)) {
                book.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }

        scanner.close();
    }
}