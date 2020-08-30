public class cone {
  private double radius;
  private double height;
  
  public cone (double $radius, double $height) {
    this.radius = $radius;
    this.height = $height;
  }
  public double getVolume() {
    return ((Math.PI / 3) * (radius * radius) * height);
  }
  public double getSurfaceArea() {
    return (Math.PI*radius*(radius+Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2) )));
  }
}
