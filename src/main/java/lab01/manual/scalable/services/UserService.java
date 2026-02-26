package lab01.manual.scalable.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lab01.manual.scalable.models.User;
import lab01.manual.scalable.repositories.UserRepository;

@Service
public class UserService {
    
    // Injecting the UserRepository to handle data access related to users (making use of dependency injection)
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public Optional<User> getUserById(String id) {
        return userRepository.getUserById(id);
    }

    public User createUser(User user) {
        return userRepository.createUser(user);
    }

}
