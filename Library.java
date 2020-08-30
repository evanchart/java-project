import java.util.ArrayList;

public class Library {
  private String name = "";
  ArrayList<LibraryItem> library = new ArrayList<>();
  
  public Library (String name) {
    this.name = name;
    
  } 
  
  public void addItem (LibraryItem item) {
    library.add(item);
  }
  
  public LibraryItem getItem (String callno) {
    for (LibraryItem l: library) {
      if (l.callno == callno) {
        return l;
      }
    }
    LibraryItem I = new LibraryItem();
    return I;
  }
  
  public void printCollection () {
    System.out.println("The " + name + " Library Catalog");
    for (LibraryItem l: library) {
      System.out.println(l.toCollectionString());
    }
    System.out.println("\n\n\n\n");
  }
  
  
  
}
