package util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ArrayDemoTest {
    @Mock ArrayDemo arrayDemo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        arrayDemo = new ArrayDemo();
    }

    @Test
    void fill() {
        String s = "";
        for(int i: arrayDemo.fill(7)){
            s += i;
        }
        assertEquals("77777", s);
//        for(int i : arrayDemo.fill(7)){
//            assertEquals(7, i);
//        }
    }

    @Test
    void copy() {
        String s = "";
        for(int i: arrayDemo.copy(arrayDemo.fill(7))){
            s += i;
        }
        assertEquals("07700", s);
//        for(int i : arrayDemo.copy(arrayDemo.fill(7))){
//            assertEquals(7, i);
//        }
    }
}