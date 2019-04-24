package pl.labs.lab1;

public class Point {

		   private int xValue;                           // attributes
		   private int yValue;

		   public Point(int xValue, int yValue) {     // a constructor
		      super();
		      this.xValue = xValue;
		      this.yValue = yValue;
		   }
		   // getter and setter member functions
		   public int getPointX() {
		      return xValue;
		   }
		   public int getPointY() {
			      return yValue;
			   }
		   public void setPoint(int xValue, int yValue) {
			   this.xValue = xValue;
			   this.yValue = yValue;
		   }
}

