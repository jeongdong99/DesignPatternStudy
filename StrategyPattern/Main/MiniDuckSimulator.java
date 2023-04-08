package hf.dp.Strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		MyHWInfo.printInfo();

		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();


		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
