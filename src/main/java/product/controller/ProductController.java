package product.controller;

import inheritance.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public final class ProductController {
    private final ItemService itemService;
}
