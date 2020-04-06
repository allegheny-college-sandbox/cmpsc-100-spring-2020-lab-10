package labten;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/** Displays G. Wiz's new library.
 *
 * @author Solutions Repository
 */
public class DisplayLibrary {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Set up reading from file
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/book.list");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    // Set up identifiers for reading the book list
    
    int column = 1;
    Book book = null;
    Scanner entry = null;
    ArrayList<Book> library = new ArrayList<Book>();
    
    // Do the loop
    
    while (input.hasNextLine()) {
      book = new Book();
      entry = new Scanner(input.nextLine());
      entry.useDelimiter("\t");
      while (entry.hasNext()) {
        switch (column) {
          case 1:
            book.setTitle(entry.next());
            break;
          case 2:
            book.setAuthor(entry.next());
            break;
          case 3:
            book.setPages(entry.nextInt());
            break;
          default:
            break;
        }
        column++;
      }
      library.add(book);
      column = 1;
    }
    
    // Set up identifiers for reading the library list
    double totalWidth = 0;
    
    System.out.println("This library contains " + library.size() + " books.");
    System.out.println();
    
    // Loop over library object
    
    int index = 0;
    while (index < library.size()) {
      book = library.get(index);
      System.out.println(book);
      totalWidth += book.getWidth();
      index++;
    }
    
    // Print results
    
    DecimalFormat fmt = new DecimalFormat("#.##");
    System.out.println("It takes up " + fmt.format(totalWidth / 12) 
                       + " linear feet of shelf space.");
    
  }
}