package at.banach.game.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long userId;
    private String userName;
    private String password;
    //private String token; // add to a later date
    private Long coins;
    private Long elo;
    private Long gamesPlayed;
    private List<Deck> decks;


}
