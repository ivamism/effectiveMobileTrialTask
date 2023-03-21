package byIvam.UserService.service;

import byIvam.UserService.dto.UserDTO;
import byIvam.UserService.model.User;
import byIvam.UserService.repository.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
@Data
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserDTO userDTO) {
        User user = new User()
                .setName(userDTO.getName())
                .setEmail(userDTO.getEmail())
                .setPassword(userDTO.getPassword());
        userRepository.save(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(long userId) {

    }

    @Override
    public User findByID(long userId) {
        User user = userRepository.findById(userId).get();
        return user;
    }

}
