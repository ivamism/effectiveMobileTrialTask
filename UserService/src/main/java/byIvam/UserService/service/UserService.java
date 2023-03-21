package byIvam.UserService.service;

import byIvam.UserService.dto.UserDTO;
import byIvam.UserService.model.User;

public interface UserService {
   public User createUser(UserDTO userDTO);

   public User updateUser(User user);
   public void deleteUser(long userId);
   User findByID(long userId);
}
