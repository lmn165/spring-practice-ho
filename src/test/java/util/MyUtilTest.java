package util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
class MyUtilTest {
    @Mock
    MyUtil myUtil;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
        myUtil = new MyUtil();
    }

    @DisplayName("크리스마스까지 앞으로 며칠?")
    @Test
    void findXmas() {
        System.out.println(myUtil.howLongRemain(LocalDate.now(), "12", "25"));
    }

    @DisplayName("이용 시간 현황")
    @Test
    void testUsedTime (){
//        System.out.println(myUtil.usedTime(LocalTime.of(14, 24, 35), LocalTime.of(17, 31, 19)));
        System.out.println(myUtil.usedTime("9", "30", "0", "18", "0", "0"));
    }
}