public class Program {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
			Licznik licz = new Licznik();
			Thread w0 = new MyThread(licz);
			Thread w1 = new MyThread(licz);
			w0.start();
			w1.start();
			w0.join();
			w1.join();
			System.out.println("Licznik="+ licz.get());
			
			boolean chec1 = false;
			boolean chec2 = false;
			int czeka = 1;
			//proces2
			while(true){
				//tu robi cos spoza krytycznej
				chec2 = true;
				czeka = 2;
				while (chec1 && czeka == 2);
				//sekcja krytyczna
				chec2 = false;
			}
			//proces1
			while(true){
				//tu robi cos spoza krytycznej
				chec1 = true;
				czeka = 1;
				while (chec2 && czeka == 1);
				//sekcja krytyczna
				chec1 = false;
			}
			
		}
	}
