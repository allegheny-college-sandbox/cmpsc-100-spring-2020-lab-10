package labten;

/** Creates a Book object.
 *
 * @author Solutions Repository
 */
public class Book {
  
  private String title;
  private String author;
  private int pages;
  private double width;
  
  /** Sets a book title.
   *
   * @param title Book's title
   */
  public void setTitle(String title) {
    this.title = title;
  }
  
  /** Sets a Book's author.
   *
   * @param author Book's author
   */
  public void setAuthor(String author) {
    this.author = author;
  }
  
  /** Sets a Book's pagecount, automatically calculates width.
   *
   * @param pages Book's page count
   */
  public void setPages(int pages) {
    this.pages = pages;
    this.width = pages * .005;
  }
  
  /** Gets a book's width in inches.
   *
   */
  public double getWidth() {
    return this.width;
  }
  
  /** Creates String representation of Book.
   *
   */
  public String toString() {
    return this.title + "\n" 
           + this.author + "\n" 
           + this.pages + " pages\n";
  }
}