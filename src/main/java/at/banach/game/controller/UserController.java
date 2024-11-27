package at.banach.game.controller;

import at.banach.game.service.UserService;
import at.banach.httpserver.http.ContentType;
import at.banach.httpserver.http.HttpStatus;
import at.banach.httpserver.http.Method;
import at.banach.httpserver.server.Request;
import at.banach.httpserver.server.Response;
import at.banach.httpserver.server.RestController;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class UserController implements RestController {
    private final UserService userService;

    @Override
    public Response handleRequest(Request request) {
        if (request.getMethod() == Method.POST && request.getPathname().equals("/users")) {
            return this.userService.createUser(request);
        } else if (request.getMethod() == Method.GET && request.getPathname().equals("/users")) {
            return this.userService.getUser();
        }

        return new Response(
                HttpStatus.BAD_REQUEST,
                ContentType.JSON,
                "[Bad Request]"
        );
    }
}
