package wl.tacocloud.domain;

import java.util.List;
import lombok.Data;

@Data
public class Taco {
    private List<Ingredient> ingredients;
}