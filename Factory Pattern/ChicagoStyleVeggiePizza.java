package hf.dp.Factory;

public class ChicagoStyleVeggiePizza extends Pizza {
        public ChicagoStyleVeggiePizza() {
            name = "Chicago Style Deep Dish and Veggie Pizza";
            dough = "Extra Thick Crust Dough";
            sauce = "Plum Tomato Sauce";
            toppings.add("Shredded Mozzarella Veggie");
        }
        void cut() {
            System.out.println("Cutting the pizza into square slices");
        }
    }

