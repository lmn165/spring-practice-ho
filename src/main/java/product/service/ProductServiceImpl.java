package product.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import product.repository.ProductRepository;

@Service @RequiredArgsConstructor
public final class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public String abc() {
        return null;
    }
}
