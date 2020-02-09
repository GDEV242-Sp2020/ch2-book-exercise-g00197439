/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author; //The author of the book
    private String title; //The title of the book
    private int pages; //Question 2.85; the number of pages in the book
    private String refNumber; //Question 2.88; the reference number of the book in a library
    private int borrowed; //Question 2.91; the number of times the book has been borrowed
    private boolean courseText; //Question 2.92; shows whether or not the book is apart of a course text

    /**
     * Constructor
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean course)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;  //Question 2.85
        refNumber = ""; //Question 2.88
        borrowed = 0; //Question 2.91
        courseText = course; //Question 2.92
    }

    //Question 2.83
    /**
     * Returns the author of the book
     */
    public String getAuthor() {
        return author;
    }
    
    //Question 2.83
    /**
     * Returns the title of the book
     */
    public String getTitle() {
        return title;
    }
    
    //Question 2.85
    /**
     * Returns the number of pages in the book
     */
    public int getPages() {
        return pages;
    }
    
    //Question 2.88
    /**
     * Returns the reference number of the book
     */
    public String getRefNumber() {
        return refNumber;
    }
    
    //Question 2.91
    /**
     * Returns the number of times the book has been borrowed
     */
    public int getBorrowed() {
        return borrowed;
    }
    
    //Question 2.92
    /**
     * Returns whether or not the book is part of a course text
     */
    public boolean isCourseText() {
        return courseText;
    }
    
    //Question 2.84
    /**
     * Prints the author of the book
     */
    public void printAuthor() {
        System.out.println(author);
    }
    
    //Question 2.84
    /**
     * Prints the title of the book
     */
    public void printTitle() {
        System.out.println(title);
    }
    
    //Question 2.87
    /**
     * Prints all of the details of the book including title, author, number of pages, 
     * how many times it was borrowed, and the reference number if there is one
     */
    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author +
            ", Pages: " + pages + ", Borrowed " + borrowed + " times");
        if(refNumber.length() != 0) { //Question 2.89
            System.out.println(", Reference Number: " + refNumber);
        } else {
            System.out.println(", Reference Number: ZZZ");
        }
    }
    
    //Question 2.88 & 2.90
    /**
     * Allows the user to set a reference number for the book
     */
    public void setRefNumber(String ref) {
        if(ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Error. Reference number must be at least three characters.");
        }
    }
    
    //Question 2.91
    /**
     * Records that the book has been borrowed
     */
    public void borrow () {
        borrowed++;
    }
}
