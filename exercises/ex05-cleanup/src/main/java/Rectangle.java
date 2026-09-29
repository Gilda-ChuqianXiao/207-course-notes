/**
 * Represents a rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
  *Creates a rectangle with the given width and height.
  *
  * @param w the width
  * @param h the height
  */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
  * Returns the area of the rectangle.
  *
  * @return the area
  */
  public double area() {
    return width * height;
  }

  /**
  * scales the rectangle.
  *
  * @param factor the scale factor
  */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
  * Checks whether this rectangle is larger than another rectangle.
  *
  * @param other the other rectangle
  * @return true if this rectangle is larger
  */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
