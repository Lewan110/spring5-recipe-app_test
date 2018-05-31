package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Lewan on 31.05.2018.
 */
@Getter
@Setter
@NoArgsConstructor
public class CategoryCommand {
    private Long id;
    private String description;
}
