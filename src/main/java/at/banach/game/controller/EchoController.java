package at.banach.game.controller;

import at.banach.httpserver.http.ContentType;
import at.banach.httpserver.http.HttpStatus;
import at.banach.httpserver.server.Request;
import at.banach.httpserver.server.Response;
import at.banach.httpserver.server.RestController;

public class EchoController implements RestController {
    @Override
    public Response handleRequest(Request request) {
        return new Response(HttpStatus.OK,
                ContentType.PLAIN_TEXT,
                "Echo-" + request.getBody());
    }
}

