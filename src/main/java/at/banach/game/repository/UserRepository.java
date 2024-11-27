package at.banach.game.repository;

import at.banach.game.entities.User;

import java.util.List;

public interface UserRepository {
    void createUser (String username, String password);
    boolean userExists(String username);
    List<User> getUsers();
}
