package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    // Attribute
    private List<String> authorsPhucNH = new ArrayList<>();

    // Constructor
    public Book( String titlePhucNH, String categoryPhucNH, float costPhucNH) {
        super(titlePhucNH, categoryPhucNH, costPhucNH);
    }

    // Method to add an author
    // If the author is already in the list, display a message; otherwise, add the author and display a success message.
    public void addAuthor(String authorNamePhucNH) {
        if (authorsPhucNH.contains(authorNamePhucNH)) {
            System.out.println("Ngo Hoang Phuc 20225903. Author is already in the list");
            return;
        }
        authorsPhucNH.add(authorNamePhucNH);
        System.out.println("Ngo Hoang Phuc 20225903. Added author successfully");
    }

    // Method to remove an author
    // If the author is not in the list, display a message; otherwise, remove the author and display a success message.
    public void removeAuthor(String authorNamePhucNH) {
        if (!authorsPhucNH.contains(authorNamePhucNH)) {
            System.out.println("Ngo Hoang Phuc 20225903. Author is absent in the list");
            return;
        }
        authorsPhucNH.remove(authorNamePhucNH);
        System.out.println("Ngo Hoang Phuc 20225903. Removed author successfully");
    }


    // Getter and Setter
    public List<String> getAuthors() { return authorsPhucNH; }

    public void setAuthors(List<String> authorsPhucNH) { this.authorsPhucNH = authorsPhucNH; }

    // Method to print details of a book
    @Override
    public void print() {
        System.out.print(getIdPhucNH() + " - Book - " 
            + getTitlePhucNH() + " - " 
            + getCategoryPhucNH() + " - ");
        for (String authorPhucNH : authorsPhucNH) {
            System.out.print(authorPhucNH + " - ");
        }
        System.out.println(getCostPhucNH() + "$");
    }
}