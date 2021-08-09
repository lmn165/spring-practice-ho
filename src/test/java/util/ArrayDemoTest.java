package util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ArrayDemoTest {
    @Mock ArrayDemo arrayDemo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        arrayDemo = new ArrayDemo();
    }

    @Test
    void test_fill() {
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
    void test_copy() {
        String s = "";
        for(int i: arrayDemo.copy(new int[]{7, 7, 7, 7, 7})){
            s += i;
        }
        assertEquals("07700", s);
//        for(int i : arrayDemo.copy(arrayDemo.fill(7))){
//            assertEquals(7, i);
//        }
    }
    @Test
    void test_createIntegerArray(){
        String s = "";
        for (int i : arrayDemo.createIntegerArray(1,6)){
            s += i;
        }
        assertEquals("12345", s);
    }
}