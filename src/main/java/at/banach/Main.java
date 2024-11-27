import at.banach.game.controller.UserController;
import at.banach.game.entities.User;
import at.banach.game.service.UserService;
import at.banach.game.repository.UserRepository;
import at.banach.game.repository.UserRepositoryImpl;
import at.banach.httpserver.server.Server;
import at.banach.httpserver.utils.Router;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public static void main(String[] args) {
    Server server = new Server(10001, configureRouter());
    try {
        server.start();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private static Router configureRouter()
{
    List<User> users = new ArrayList<>();
    Router router = new Router();
    ObjectMapper objectMapper = new ObjectMapper();

    UserRepository userRepository = new UserRepositoryImpl(users);

    router.addService("/users", new UserController(new UserService(userRepository,objectMapper)));

    return router;
}
