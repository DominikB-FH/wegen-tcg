package at.banach.game.service;

import at.banach.game.entities.User;
import at.banach.game.repository.UserRepository;
import at.banach.httpserver.http.ContentType;
import at.banach.httpserver.http.HttpStatus;
import at.banach.httpserver.server.Request;
import at.banach.httpserver.server.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class UserService {
    private final UserRepository userRepository;
    private final ObjectMapper objectMapper;

    public Response createUser(Request request) {
        User register;
        try {
            register = this.objectMapper.readValue(request.getBody(), User.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        boolean result = userRepository.userExists(register.getUserName());

        if (result) {
            userRepository.createUser(register.getUserName(), register.getPassword());
            return new Response(HttpStatus.CREATED);
        } else {
            return new Response(HttpStatus.CONFLICT, ContentType.PLAIN_TEXT, "User already exists");
        }

    }

    public Response getUser() {
        return new Response(HttpStatus.OK, ContentType.PLAIN_TEXT, userRepository.getUsers().toString());
    }
}
