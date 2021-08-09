package util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MatrixTest {

    @Mock
    Matrix matrix;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        matrix = new Matrix();
    }

    @Test
    void testCreatMatrix() {
        for (int[] i : matrix.creatMatrix(3, 3)){
            for (int j : i){
                System.out.printf("%d\t", j);
            }
            System.out.println();
        }
        assertEquals(4, matrix.creatMatrix(3, 3)[1][0]);
    }
}