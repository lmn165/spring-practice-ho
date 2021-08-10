package inheritance;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import person.Person;

@RestController @RequiredArgsConstructor
public class ItemController {
    public final ItemService itemService;

    /**
     * 서로 다른 모듈간에는 아래와 같이 의존 관계로 사용하게 만들어준다.
     */
    public void some(Person person){

    }
}
