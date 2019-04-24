package wyjatki;

public class MyException extends Exception {
		   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		int id;

		   public MyException(int x) {
		      id = x;
		   }

		   public String toString() {
		      return "CustomException[" + id + "]";
		   }
}

		