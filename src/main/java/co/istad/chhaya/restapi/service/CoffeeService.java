package co.istad.chhaya.restapi.service;

import co.istad.chhaya.restapi.domain.Coffee;
import co.istad.chhaya.restapi.dto.CoffeeResponse;
import co.istad.chhaya.restapi.dto.CreateCoffeeRequest;

import java.math.BigDecimal;
import java.util.List;

public interface CoffeeService {

    // 1. Expected result (return type: void, object, collection, int, ...)
    // 2. Your logic: add single coffee
    // 3. Parameters are used for client submission
    CoffeeResponse createCoffee(CreateCoffeeRequest createCoffeeRequest);


    List<CoffeeResponse> searchCoffee(String name, BigDecimal price);


    CoffeeResponse getCoffeeById(Integer id);


    List<CoffeeResponse> getCoffees();

}
