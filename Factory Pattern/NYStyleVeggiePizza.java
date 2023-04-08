package hf.dp.Factory;

public class NYStyleVeggiePizza extends Pizza {
        public NYStyleVeggiePizza() {
            name = "NY Style Sauce and Veggie Pizza";
            dough = "Thin Crust Dough";
            sauce = "Marinara Sauce";
            toppings.add("Grated Reggiano Veggie");
        }
        void cut() {
            System.out.println("Cutting the pizza into square slices");
        }
}
