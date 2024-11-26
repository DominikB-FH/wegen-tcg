import at.banach.game.controller.EchoController;
import at.banach.game.controller.UserController;
import at.banach.httpserver.server.Server;
import at.banach.httpserver.utils.Router;

import java.io.IOException;

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
    Router router = new Router();
    //router.addService("/profile", new UserController());
    router.addService("/echo", new EchoController());

    return router;
}
