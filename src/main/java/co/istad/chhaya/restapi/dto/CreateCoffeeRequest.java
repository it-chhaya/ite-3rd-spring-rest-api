package co.istad.chhaya.restapi.dto;

import java.math.BigDecimal;

public record CreateCoffeeRequest(
        String name,
        String description,
        BigDecimal price
) {
}
