package util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
final class Product {
    private final int productId;
    private final String description;
}

public final class ObjectArray {
    public Product[] createCart(){
        Product[] cart = new Product[5];
        String[] productNames = {"Coffee", "Computer", "Apple", "Dress", "Fairy-tale book"};
        for (int i=0; i<cart.length; i++){
            cart[i] = new Product(101*(i+1), productNames[i]);
        }
        return cart;
    }
}
