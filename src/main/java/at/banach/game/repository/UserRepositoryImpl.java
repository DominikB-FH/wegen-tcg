package at.banach.game.repository;

import at.banach.game.entities.User;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor

public class UserRepositoryImpl implements UserRepository {

    /*
     To do:
     expand create User
     create login/logout
     save to DB instead of Memory
    */

    private final List<User> users;

    @Override
    public void createUser(String username, String password) {
        if(userExists(username)){
            User newUser = new User();
            newUser.setUserId((long) users.size()); // jesus change this, look into how java can make unique IDs
            newUser.setUserName(username);
            newUser.setPassword(password);
            //newUser.setDecks(); --starter deck
            users.add(newUser);
        }else {
            System.out.println("User already exists");
        }
    }

    @Override
    public boolean userExists(String username) {
        for (User user : users) {
            if(Objects.equals(user.getUserName(), username)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
