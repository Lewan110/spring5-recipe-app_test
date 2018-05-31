package guru.springframework.commands;

/**
 * Created by Lewan on 31.05.2018.
 */
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class UnitOfMeasureCommand {
    private Long id;
    private String description;
}