package inheritance;

import lombok.Data;

import javax.persistence.Id;

@Data
public class ItemDTO {
    @Id
    private long itemId;
}
