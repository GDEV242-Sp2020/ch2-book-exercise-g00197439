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
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    //Question 2.83
    public String getAuthor() {
        return bookAuthor;
    }
    
    //Question 2.83
    public String getTitle() {
        return bookTitle;
    }
    
    //Question 2.84
    public void printAuthor() {
        System.out.println(bookAuthor);
    }
    
    //Question 2.84
    public void printTitle() {
        System.out.println(bookTitle);
    }
}
