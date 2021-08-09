package util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ObjectArrayTest {

    @Mock
    ObjectArray objectArray;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        objectArray = new ObjectArray();
    }

    @Test
    void testCreateCart(){
//        for (Product p : objectArray.createCart()){
//            if(p.getProductId() == 505){
//                assertEquals("Fairy-tale book", p.getDescription());
//            }
//        }
        assertEquals("Coffee", objectArray.createCart()[0].getDescription());
    }
}