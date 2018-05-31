package guru.springframework.commands;

import lombok.*;

import java.math.BigDecimal;

/**
 * Created by Lewan on 31.05.2018.
 */
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand unitOfMeasure;

}