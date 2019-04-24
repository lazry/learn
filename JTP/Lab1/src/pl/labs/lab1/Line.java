package pl.labs.lab1;

public class Line {

	private Point a;
	private Point b;
	
	public Line(Point a, Point b) {     // a constructor
	      super();
	      this.a = a;
	      this.b = b;
	      if ((a.getPointX()== b.getPointX())&& (a.getPointY()== b.getPointY())) {
	    	  System.out.println("Punkty wyznaczajace linie nakladaja sie";
	      }
	   }
	public int getLineA() {
	      return a;
	   }
	   public int getLineB() {
		  return b;
	   }
	   public void setLine(Point a, Point b) {
		   this.a = a;
		   this.b = b;
	   }
	public String toString(){//overriding the toString() method  
		  return "Linia. Punkt a("a.getPointX()+","+b.getPointY()+
				  "). Punkt b("b.getPointX()+","+b.getPointY()").";  
		 } 
	
}
