package co.istad.chhaya.restapi.repository;

import co.istad.chhaya.restapi.domain.Coffee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository // CoffeeRepository coffeeRepository = new CoffeeRepository()
public class CoffeeRepository {

    private final List<Coffee> coffees;

    public CoffeeRepository() {
        this.coffees = new ArrayList<>();
        Coffee coffee = new Coffee(1, "Ice Latte", "50%", BigDecimal.valueOf(5000));
        Coffee coffee2 = new Coffee(2, "Hot Latte", "50%", BigDecimal.valueOf(4500));
        Coffee coffee3 = new Coffee(3, "Ice Americano", "100%", BigDecimal.valueOf(4000));

        coffees.add(coffee);
        coffees.add(coffee2);
        coffees.add(coffee3);
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }

}
