package io.github.bluething.playground.tdd.globomantics.domain.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.AssertionErrors;

import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class})
public class ProductServiceImplTest {
    @Mock
    private ProductRepository productRepository;

    private ProductServiceImpl productService;

    @DisplayName("Given product id, when we call findById method with the id then we return product object with same id")
    @Test
    public void findByIdReturnProductWithSameIdAsInputParameter() {
        Product product = new Product(1, "Product 1", 10, 1);
        when(productRepository.findProductById(1)).thenReturn(product);
        productService = new ProductServiceImpl(productRepository);
        Product actualProduct = productService.findById(1);
        Assertions.assertTrue(product.getId().equals(actualProduct.getId()));
    }
}
