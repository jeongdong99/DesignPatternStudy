package hf.dp.TemplateMethod;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilwater();
        brew();
        pourInCup();
        if(customerWantsCondiments())addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();

    public void boilwater() {
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    boolean customerWantsCondiments() {
        return true;
    }
}
