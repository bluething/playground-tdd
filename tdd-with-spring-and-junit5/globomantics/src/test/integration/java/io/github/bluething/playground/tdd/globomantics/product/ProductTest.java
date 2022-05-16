package io.github.bluething.playground.tdd.globomantics.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@DisplayName("Given Product API")
@SpringBootTest
@AutoConfigureMockMvc
public class ProductTest {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName("When we get product with existed id value then the API must return the product with same id")
    @Test
    public void getProductWithExistedIdThenReturnProductWithSameId() throws Exception {
        mockMvc.perform(get("/product/{id}", 1))
                .andExpect(jsonPath("$.id", is(1)));
    }
}
