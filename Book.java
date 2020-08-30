public class Book extends LibraryItem {
  private String author;
  private int page;
  private int c_page = 1;
  
  public Book(String title, String author, String callno, int year, int page) {
    super(title,callno,year);
    this.author = author;
    this.page = page;
    
  }
  
  public boolean readPages (int num) {
    if ((c_page + num) <= page) {
      c_page = c_page + num;
      return true;
    }
    else {
      return false;
    }
  }
  
  public String toCollectionString () {
    return super.toCollectionString() + "written by" + author + ". Currently on page " + c_page + " of " + page;
  }
  
  
  
}
