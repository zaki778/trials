package lab01.manual.scalable.repositories;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import lab01.manual.scalable.models.User;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Repository
public class UserRepository {

    private List<User> users;

    public UserRepository() {
        InputStream inputStream = getClass().getResourceAsStream("/users.json");

        if (inputStream == null) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Unable to read users.json");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        this.users = objectMapper.readValue(inputStream, new TypeReference<List<User>>() {});
    }

    public List<User> getAllUsers() {
        return users;
    }

    public Optional<User> getUserById(String id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public User createUser(User user) {
        users.add(user);
        return user;
    }


}
