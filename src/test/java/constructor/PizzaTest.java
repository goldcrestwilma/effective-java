package constructor;

import static constructor.NyPizza.Size.SMALL;
import static constructor.Pizza.Topping.HAM;
import static constructor.Pizza.Topping.ONION;
import static constructor.Pizza.Topping.SAUSAGE;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PizzaTest {

    @Test
    void testBuilder() {
        NyPizza pizza = new NyPizza.Builder(SMALL)
            .addTopping(SAUSAGE)
            .addTopping(ONION)
            .build();

        Calzone calzone = new Calzone.Builder()
            .addTopping(HAM)
            .sauceInside()
            .build();

        assertThat(pizza.toppings).contains(SAUSAGE, ONION);
        assertThat(calzone.toppings).contains(HAM);
    }
}