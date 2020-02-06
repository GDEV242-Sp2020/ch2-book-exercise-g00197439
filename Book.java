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
    private int pages; //Question 2.85
    private String refNumber; //Question 2.88
    private int borrowed; //Question 2.91
    private boolean courseText; //Question 2.92

    /**
     * Set the author and title fields when this object
     * is constructed.
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
    public String getAuthor() {
        return author;
    }
    
    //Question 2.83
    public String getTitle() {
        return title;
    }
    
    //Question 2.85
    public int getPages() {
        return pages;
    }
    
    //Question 2.88
    public String getRefNumber() {
        return refNumber;
    }
    
    //Question 2.91
    public int getBorrowed() {
        return borrowed;
    }
    
    //Question 2.92
    public boolean isCourseText() {
        return courseText;
    }
    
    //Question 2.84
    public void printAuthor() {
        System.out.println(author);
    }
    
    //Question 2.84
    public void printTitle() {
        System.out.println(title);
    }
    
    //Question 2.87
    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author +
            ", Pages: " + pages + ", Borrowed " + borrowed + " times");
        if(refNumber.length() != 0) { //Question 2.89
            System.out.println(", Reference Number: " + refNumber);
        } else {
            System.out.println(", Reference Number: ZZZ");
    }
    
    //Question 2.88 & 2.90
    public void setRefNumber(String ref) {
        if(ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Error. Reference number must be at least three characters.");
        }
    }
    
    //Question 2.91
    public void borrow () {
        borrowed++;
    }
}
