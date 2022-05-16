package io.github.bluething.playground.tdd.globomantics.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    Product findProductById(Integer id);
}
