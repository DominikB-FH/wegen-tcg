package at.banach.httpserver.server;

public interface RestController {
    Response handleRequest(Request request);
}
