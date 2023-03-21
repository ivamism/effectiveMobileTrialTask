package byIvam.UserService.service;

import byIvam.UserService.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplementationTest {
    @Autowired
    UserServiceImplementation userServiceImplementation;

    @Test
    void findByID() {
        User user = userServiceImplementation.findByID(2);
        assertNotNull(user);
    }
}