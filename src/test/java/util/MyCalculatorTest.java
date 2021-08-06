package util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyCalculatorTest {

    @Mock
    MyCalculator myCalculator;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
        myCalculator = new MyCalculator();
    }

    @Test
    void add() {
        assertEquals("15", myCalculator.add("7", "8"));
    }

    @Test
    void sub() {
        assertEquals("-1", myCalculator.sub("7", "8"));
    }

    @Test
    void multi() {
        assertEquals("56", myCalculator.multi("7", "8"));
    }

    @Test
    void divide() {
        assertEquals("0", myCalculator.divide("7", "8"));
    }
}