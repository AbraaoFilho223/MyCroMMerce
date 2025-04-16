package com.mycrommerce.user_service.seed;

import com.mycrommerce.user_service.model.Role;
import com.mycrommerce.user_service.model.User;
import com.mycrommerce.user_service.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DataSeeder {

    private final UserRepository userRepository;

    public DataSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void seed() {
        if (userRepository.count() == 0) {
            List<User> users = List.of(
                new User("admin", "admin@mycro.com", "admin123", Role.ADMIN),
                new User("john_doe", "john@example.com", "password", Role.CUSTOMER),
                new User("jane_doe", "jane@example.com", "password", Role.CUSTOMER)
            );
            userRepository.saveAll(users);
        }
    }
}
