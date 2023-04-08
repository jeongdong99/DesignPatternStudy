package hf.dp.AbstractFactory;

public class  ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    String clam = "";
    public  ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        clam = String.valueOf(ingredientFactory.createClam());


    }

}
