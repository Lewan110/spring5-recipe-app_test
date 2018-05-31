package guru.springframework.commands;

import lombok.*;

/**
 * Created by Lewan on 31.05.2018.
 */
@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private String recipeNotes;

}