public class LibraryItem {
  String callno;
  String title;
  int year;
  
  public LibraryItem() {
    callno = "";
    title = "";
    year = 0;
  }
  
  public LibraryItem (String title, String callno, int year) {
    this.title = title;
    this.callno = callno;
    this.year = year;
  }
  
  public String getCallNo () {
    return callno;
  }
  
  public String toCollectionString() {
    return title + "(CallNumber: " + callno + "), first published in " + year + " ";
  }
  
}
