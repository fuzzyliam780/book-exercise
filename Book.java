/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Liam Marquis)
 * @version (2/4/19)
 */
class Book
{
     // The fields.
    private String author = "";
    private String title = "";
    private String refNumber = "ZZZ";
    private int pages = 0;
    private int borrowed = 0;
    private final boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = isCourseText;
    }
    
    /**
     * Provide access to string containing author's name
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Provide access to string containing book's title
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Provide access to int containing number of pages in the book
     * @return pages
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * Provide access to string containing the book's reference number
     * @return refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Provide access to int containing how many times the book has been borrowed
     * @return borrowed
     */
    public int getBorrowed(){
        return borrowed;
    }
    
    /**
     * Provide access to boolean containing whether or not the book is a course text
     * @return courseText
     */
    public boolean isCourseText(){
        return courseText;
    }
    
    /**
     * Set string containing the book's reference number to be a provided reference number
     */
    public void setRefNumber(String ref)
    {
        int letters = ref.length();
        if (letters >= 3){
            refNumber = ref;
        }else{
            System.out.println ("Error: The reference number must be longer than 3 characters!");
            refNumber = "";
        }
    }
    
    /**
     * Increases borrowed by 1 each time it is called
     * @return borrowed +1
     */
    public void borrow(){
        borrowed++;
    }
    
    /**
     * Print the author of the book to the terminal
     */
    public void printAuthor()
    {
        System.out.println("The Author is "+author);
    }
    
    /**
     * Print the title of the book to the terminal
     */
    public void printTitle()
    {
        System.out.println("The Title is "+title);
    }
    
    /**
     * Print the details of the book to the terminal
     */
    public void printDetails()
    {
        System.out.println("Title: "+title);
        System.out.println("\nAuthor: "+author);
        if (refNumber != ""){
            System.out.println("\nReference Number: "+refNumber);
        }
        System.out.println("\nPages: "+pages);
        System.out.println("\nNumber of Times Borrowed: "+borrowed);
    }
}
