package hf.dp.Adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The hf.dp.Adapter.Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The hf.dp.Adapter.Duck says...");
        testDuck(duck);

        System.out.println("\n The hf.dp.Adapter.TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
