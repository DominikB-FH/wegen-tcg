package at.banach.game.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Card {

    private Long cardID;
    private String cardName;
    private Long damage;
    private ElementType elementType;
}
