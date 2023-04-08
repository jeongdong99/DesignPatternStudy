package hf.dp.AbstractFactory;

import hf.dp.Decorator.MyHWInfo;

public class PizzaTestDrive {

    public static void main(String[] args){
        MyHWInfo.printInfo();
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName());
        System.out.println();
        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza2.getName());

    }
}
