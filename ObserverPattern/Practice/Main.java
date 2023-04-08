package add.dp.Observer;

public class Main {
	public static void main(String[] args) {
		MyHWInfo.printInfo();
		NumberGenerator generator = new RandomNumberGenerator();
		
		
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		
		
		generator.addObserver(observer1);
		generator.addObserver(observer2);

		
		generator.execute();
		
	}
}
