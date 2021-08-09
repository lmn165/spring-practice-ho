package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BusinessManTest {
    @Mock BusinessMan businessMan;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        businessMan = new BusinessMan("비트", "학생");
    }

    @DisplayName("상속 예제")
    @Test
    public void test_showName(){
        businessMan.setName("홍길동");
        assertEquals("홍길동", businessMan.getName());
        assertEquals("비트", businessMan.getCompany());
        assertEquals("학생", businessMan.getPosition());
    }
}