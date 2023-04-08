package hf.dp.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class SaladVeggies implements Veggies{

    public List<String> toArray() {
        List<String> arr = new ArrayList<>();
        arr.add("tomato");
        arr.add("peekle");
        return arr;
    }
}
