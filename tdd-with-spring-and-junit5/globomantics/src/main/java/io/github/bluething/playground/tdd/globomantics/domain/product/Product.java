package io.github.bluething.playground.tdd.globomantics.domain.product;

public class Product {
    private final Integer id;
    private final String name;
    private final Integer quantity;
    private final Integer version;

    public Product(Integer id, String name, Integer quantity, Integer version) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getVersion() {
        return version;
    }
}
