package inheritance;

import lombok.Data;
import lombok.ToString;

@Data
class Man{
    private String name;
}

@Data
public class BusinessMan extends Man {
    private final String company;
    private final String position;

}
