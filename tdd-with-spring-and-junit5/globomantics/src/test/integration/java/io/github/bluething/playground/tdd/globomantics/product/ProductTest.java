package io.github.bluething.playground.tdd.globomantics.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("Given Product API")
@SpringBootTest
public class ProductTest {
    @DisplayName("When we get product with existed id value then the API must return the product with same id")
    @Test
    public void getProductWithExistedIdThenReturnProductWithSameId() {

    }
}
