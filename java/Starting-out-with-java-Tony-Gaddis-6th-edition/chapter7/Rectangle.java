 /**
 Rectangle class, phase 4
 Under construction!
 */
 package chapter7;

 public class Rectangle
 {
    private double length;
    private double width;

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }
    public void setLength(double len)
    {
       length = len;
    }

    public void setWidth(double w)
    {
       width = w;
    }

    public double getLength()
    {
       return length;
    }

    public double getWidth()
    {
       return width;
    }

    public double getArea()
    {
       return length * width;
    }
}
