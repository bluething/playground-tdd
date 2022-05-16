package io.github.bluething.playground.tdd.globomantics.domain.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith({MockitoExtension.class})
public class ProductServiceImplTest {
    @Mock
    private ProductRepository productRepository;

    @DisplayName("Given product id, when we call findById method with the id then we return product object with same id")
    @Test
    public void findByIdReturnProductWithSameIdAsInputParameter() {

    }
}
