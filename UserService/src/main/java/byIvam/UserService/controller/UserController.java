package byIvam.UserService.controller;

import byIvam.UserService.dto.UserDTO;
import byIvam.UserService.model.User;
import byIvam.UserService.service.UserService;
import byIvam.UserService.service.UserServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody UserDTO userDTO) {

        return userService.createUser(userDTO);
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public User findById(@PathVariable long userId) {
        User user = userService.findByID(userId);
        return user;
    }

}
