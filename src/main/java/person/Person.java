package person;

import lombok.Data;

@Data
public final class Person {
    private String regiNum;
    private String passNum;

    Person(String rnum, String pnum){
        regiNum = rnum;
        passNum = pnum;
    }
    Person(String rnum){
        regiNum = rnum;
    }

}
