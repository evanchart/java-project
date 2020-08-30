public class DVD extends LibraryItem {
  String director;
  String screenwriter;
  double length;
  double c_watch = 1;
  
  
  public DVD(String title, String director, String screenwriter, String callno, int year, double length) {
    super(title,callno,year);
    this.length = length;
    this.director = director;
    this.screenwriter = screenwriter;
  }
  
  public boolean watch(double num) {
    if ((c_watch + num) <= length) {
      c_watch = c_watch + num;
      return true;
    }
    else {
      return false;
    }
  }
  
  public String toCollectionString () {
    return super.toCollectionString() + "directed by " + director + " and written by " + screenwriter + ". Currently seen " + c_watch + " of " + length + " minutes.";
  }
  
}
