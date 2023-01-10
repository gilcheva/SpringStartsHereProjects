package com.example.SFS.models;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
public class Purchase {

    private int id;
    private String product;
    private BigDecimal price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return id == purchase.id && Objects.equals(product, purchase.product) && Objects.equals(price, purchase.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, price);
    }
}
