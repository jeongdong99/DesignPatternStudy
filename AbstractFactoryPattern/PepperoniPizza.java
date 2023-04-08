package hf.dp.AbstractFactory;


public class PepperoniPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    public PepperoniPizza (PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    String Pepperoni = "";
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        Pepperoni = String.valueOf(ingredientFactory.createPepperoni());
    }
    public void bake(){
        System.out.println("Bake for 30 minutes at 350");
    }


}
