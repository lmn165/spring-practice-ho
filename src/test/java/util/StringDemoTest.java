package util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class StringDemoTest {
    @Mock
    StringDemo stringDemo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        stringDemo = new StringDemo();
    }

    @Test
    void concat() {
        assertEquals("abcdef", stringDemo.concat("abc", "def"));
    }
    @Test
    void subStringIdx(){
        assertEquals("def", stringDemo.subString("abcdef", 3));
    }
    @Test
    void subStringStartEnd(){
        assertEquals("bc", stringDemo.subString("abcdef", 1, 3));
    }
    @Test
    void testCompareTo(){
//        assertEquals(-1, stringDemo.compareTo("Apple", "Bus"));
        assertEquals(-1, stringDemo.compareTo("Apple", "apple"));
    }
    @Test
    void testCompareToIgnoreCase(){
        assertEquals(0, stringDemo.compareToIgnoreCase("Apple", "apple"));
    }
    @Test
    void testRemoveHyponeInJuminBunho(){
        assertEquals("9879981234567", stringDemo.removeHyponeInJuminBunho("987998-1234567"));
    }
}