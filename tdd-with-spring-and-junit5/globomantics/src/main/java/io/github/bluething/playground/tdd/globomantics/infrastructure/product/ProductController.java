package io.github.bluething.playground.tdd.globomantics.infrastructure.product;

import io.github.bluething.playground.tdd.globomantics.domain.product.Product;
import io.github.bluething.playground.tdd.globomantics.domain.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> getProduct(@PathVariable Integer id) throws URISyntaxException {
        Product product = productService.findById(id);
        return ResponseEntity
                .ok()
                .eTag(Integer.toString(product.getVersion()))
                .location(new URI("/product/" + product.getId()))
                .body(product);
    }
}
