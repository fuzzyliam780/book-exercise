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
}
